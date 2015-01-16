(defproject com.roomkey/slacker :lein-v
  :description "Transparent, non-invasive RPC by clojure and for clojure"
  :url "http://github.com/g1nn13/slacker"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [link "0.4.0"]
                 [info.sunng/carbonite "0.2.3"]
                 [cheshire "4.0.3"]
                 [slingshot "0.10.3"]
                 [org.clojure/java.jmx "0.2.0"]
                 [org.clojure/tools.logging "0.2.4"]]
  :profiles {:dev {:resource-paths ["examples"]
                   :dependencies [[codox "0.6.1"]]}
             :1.3 {:dependencies [org.clojure/clojure "1.3.0"]}}

  :plugins [[com.roomkey/lein-v "3.3.5"]
            [lein-exec "0.2.0"]
            [lein-maven-s3-wagon "0.2.4"]]

  :repositories {"rk-public" {:url "http://rk-maven-public.s3-website-us-east-1.amazonaws.com/releases/"} "releases"  {:url "s3://rk-maven/releases/"}
                 "snapshots" {:url "s3://rk-maven/snapshots/"}}

  :warn-on-reflection true

  :aliases {"run-example-server" ["run" "-m" "slacker.example.cluster-server"]
            "run-example-client" ["run" "-m" "slacker.example.cluster-client"]})
