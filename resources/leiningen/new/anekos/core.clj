(ns {{name}}.core
  (:gen-class)
  (:require [clojure.pprint :refer [pprint]]))


(defn -main
  "Everybody wants to be a cat."
  [& args]
  (println "Hell O World!")
  (pprint args))
