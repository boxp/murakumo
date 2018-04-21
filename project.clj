(defproject murakumo "0.1.0-SNAPSHOT"
  :description "A Google Cloud Platform API Libraries for Clojure."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[murakumo/murakumo-pubsub "0.1.0"]]
  :sub ["murakumo-pubsub"]
  :plugins [[lein-sub "0.3.0"]])
