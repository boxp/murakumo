(ns murakumo.murakumo-pubsub-test
  (:require [clojure.test :refer :all]
            [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as stest]
            [com.stuartsierra.component :as component]
            [murakumo.murakumo-pubsub :as pubsub]))

(use-fixtures
  :once {:before #(stest/instrument)})

(deftest test-create-topic
  (is (-> (pubsub/pubsub-subscription-component)
          component/start
          (pubsub/create-topic :hoge)
          component/stop)))

(deftest test-create-subscription
  (is (-> (pubsub/pubsub-subscription-component)
          component/start
          (pubsub/create-subscription :fuga :fuga-subscription)
          component/stop)))

(deftest test-add-subscriber
  (is (-> (pubsub/pubsub-subscription-component)
          component/start
          (pubsub/add-subscriber :hogehoge :hogehoge-subscription #(println %))
          component/stop)))
