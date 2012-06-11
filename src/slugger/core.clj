(ns slugger.core
  (:refer-clojure :exclude [replace])
  (:use [clojure.string :only [replace lower-case trim]])
  (:import [net.sf.junidecode Junidecode]))
  
(defn unidecode
  "Create 7-bit ascii version of unicode string."
  [text]
  (net.sf.junidecode.Junidecode/unidecode text))

(defn convert-accented-entities
  [text]
  (replace text #"&([A-Za-z])(grave|acute|circ|tilde|uml|ring|cedil|slash);" #(let [d (lower-case (second %))]
                                                                                (cond 
                                                                                  (= d "o") "oe"
                                                                                  (= d "a") "aa"
                                                                                  (= d "u") "ue"
                                                                                  :else d))))

(defn ->slug
  [text]
  (-> (unidecode text)
      (trim)
      (convert-accented-entities)
      (lower-case)
      (replace  #"\s+" "-")))