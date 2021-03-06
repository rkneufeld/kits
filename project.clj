(defproject org.clojars.runa/kits "1.16.2"
  :description "Runa's core utilities."
  :min-lein-version "2.0.0"
  :license {:name "MIT License"
            :url "http://mit-license.org/"}
  :url "https://github.com/runa-dev/kits"
  :plugins [[jonase/eastwood "0.0.2"]
            [lein-kibit "0.0.7"]
            [lein-swank "1.4.4"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cheshire "5.0.1"]
                 [org.clojars.runa/clj-utils "1.3.1"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [org.clojars.runa/runa.tools.logging "0.2.7"]
                 [clojure-csv/clojure-csv "2.0.0-alpha1"]]
  :warn-on-reflection true
  :profiles {:dev {:dependencies [[org.clojars.runa/conjure "2.2.0"]
                                  [slamhound "1.3.3"]]}
             :1.4.0 {:dependencies [[org.clojure/clojure "1.4.0"]
                                    [org.clojars.runa/conjure "2.2.0"]]}
             :1.5.0 {:dependencies [[org.clojure/clojure "1.5.1"]
                                    [org.clojars.runa/conjure "2.2.0"]]}}
  :aliases {"run-tests" ["with-profile" "1.4.0:1.5.0" "test"]
            "slamhound" ["run" "-m" "slam.hound"]})

(cemerick.pomegranate.aether/register-wagon-factory!
 "s3p" #(eval '(org.springframework.aws.maven.PrivateS3Wagon.)))
