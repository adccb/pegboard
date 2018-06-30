(ns pegboard.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [pegboard.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[pegboard started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[pegboard has shut down successfully]=-"))
   :middleware wrap-dev})
