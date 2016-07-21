(ns user
  (:require [clojure.tools.namespace.repl :refer [refresh]]
            [clojure.repl :refer :all]
            [clojure.pprint :refer [pp pprint cl-format]]
            [criterium.core :refer [bench quick-bench]]
            [{{name}}.core :refer :all]))


(defn init []
  (alter-var-root (var *print-level*) (fn [_] 2))
  (alter-var-root (var *print-length*) (fn [_] 10)))


(defn reset []
  (init)
  (refresh))


(init)
