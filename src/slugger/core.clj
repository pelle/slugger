(ns slugger.core
  (:refer-clojure :exclude [replace])
  (:use [slugger.conversions]
        [clojure.string :only [replace lower-case trim]]))

(defn ->slug
  "Convert a UTF-8/16 string into a 7 bit ascii representation suitable for use as a slug in a url."
  [text]
  (-> (unidecode text)
      (convert-accented-entities)
      (convert-misc-entities)
      (convert-misc-characters)
      (lower-case)
      (trim)
      (replace  #"\s+" "-")))