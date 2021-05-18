;;; Copyright (C) 2013 Adam Tornhill
;;;
;;; Distributed under the GNU General Public License v3.0,
;;; see http://www.gnu.org/licenses/gpl.html

(defproject code-maat "1.1-SNAPSHOT"
  :description "A toolset to mine and analyze version control data"
  :url "http://www.adamtornhill.com/code/codemaat.htm"
  :license {:name "GNU General Public License v3.0" :url "http://www.gnu.org/licenses/gpl.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/data.zip "1.0.0"]
                 [incanter/incanter-core "1.9.3"]
                 [clatrix "0.5.0"]                          ;; required for incanter 1.9.3 otherwise the tests fail
                 [org.clojure/tools.cli "0.3.1"]
                 [org.clojure/data.csv "1.0.0"]
                 [clj-time "0.15.2"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.clojure/math.combinatorics "0.1.6"]
                 [semantic-csv "0.2.1-alpha1"]
                 [instaparse "1.4.10"]]
  :main code-maat.cmd-line
  :aot [code-maat.cmd-line]
  :jvm-opts ["-Xmx4g" "-Djava.awt.headless=true" "-Xss512M"])
