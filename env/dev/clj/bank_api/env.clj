(ns bank-api.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [bank-api.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[bank-api started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[bank-api has shut down successfully]=-"))
   :middleware wrap-dev})
