(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "{{name}}"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [meowdule "0.2.0"]]
  :repl-options {:init-ns user}
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [criterium "0.4.4"]]
                   :source-paths ["dev"]}}
  :aot :all
  :main {{name}}.core)
