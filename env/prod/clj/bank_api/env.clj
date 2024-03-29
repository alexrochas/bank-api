(ns bank-api.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[bank-api started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[bank-api has shut down successfully]=-"))
   :middleware identity})
