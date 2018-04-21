(ns murakumo.test.pubsub
  (:require [clojure.test :refer :all]
            [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as stest]
            [com.stuartsierra.component :as component]
            [murakumo.pubsub :as pubsub]))

(use-fixtures :once (fn [f]
                      (stest/instrument)
                      (f)))

(deftest test-pubsub-subscription-component
  (let [c (-> (pubsub/pubsub-subscription-component)
              component/start)]
    (testing "create-topic"
      (is (pubsub/create-topic c :hoge)))
    (testing "create-subscription"
      (is (pubsub/create-subscription c :hoge :hoge-subscription)))
    (testing "add-subscriber"
      (is (-> (pubsub/add-subscriber c :hoge :hoge-subscription #(println %))
              component/stop)))
    (testing "closing"
      (pubsub/delete-subscription c :hoge-subscription)
      (pubsub/delete-topic c :hoge))))
