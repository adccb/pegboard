(ns user
  (:require [server.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [server.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'server.core/repl-server))

(defn stop []
  (mount/stop-except #'server.core/repl-server))

(defn restart []
  (stop)
  (start))


