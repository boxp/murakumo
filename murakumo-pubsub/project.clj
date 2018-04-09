(defproject murakumo/murakumo-pubsub "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.google.guava/guava "22.0"]
                 [com.google.auth/google-auth-library-oauth2-http "0.6.1"]
                 [com.google.auth/google-auth-library-credentials "0.6.1"]
                 [com.google.cloud/google-cloud-pubsub "0.20.1-beta"
                  :exclusions [com.google.auth/google-auth-library-oauth2-http
                               com.google.auth/google-auth-library-credentials
                               com.google.guava/guava]]
                 [com.stuartsierra/component "0.3.2"]])
