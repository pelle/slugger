(ns slugger.core-test
  (:use clojure.test
        slugger.core))


(deftest slug-tests
  (is (= (->slug "learn how to say 你好")  "learn-how-to-say-ni-hao"))
  (is (= (->slug " this string   should be simple enough")  "this-string-should-be-simple-enough"))
  (is (= (->slug "Vi vil have mere &Oslash;l")  "vi-vil-have-mere-oel"))
  (is (= (->slug "Vi vil have mere øl")  "vi-vil-have-mere-ol"))
  (is (= (->slug "An idea worth $100")  "an-idea-worth-100-dollars"))
  (is (= (->slug "my email address is pelle@picomoney.com")  "my-email-address-is-pelle-at-picomoney-dot-com"))
  )
