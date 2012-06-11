(ns slugger.core
  (:use [clojure.string :only [replace lower-case trim]])
  (:import [net.sf.junidecode Junidecode]))
  
(defn unidecode
  "Create 7-bit ascii version of unicode string."
  [text]
  (net.sf.junidecode.Junidecode/unidecode text))

(defn slug
  [text]
  (-> (unidecode text)
      (trim)
      (lower-case)
      (replace  #"\s+" "-")))