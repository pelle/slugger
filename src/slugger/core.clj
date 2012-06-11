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

(def ENTITY_RULES { "#822[01]" "\""
                    "#821[67]" "'"
                    "#8230" "..."
                    "#8211" "-"
                    "#8212" "--"
                    "#215" "x"
                    "gt" ">"
                    "lt" "<"
                    "(#8482|trade)" "(tm)"
                    "(#174|reg)" "(r)"
                    "(#169|copy)" "(c)"
                    "(#38|amp)" "and"
                    "nbsp" " "
                    "(#162|cent)" " cent"
                    "(#163|pound)" " pound"
                    "(#188|frac14)" "one fourth"
                    "(#189|frac12)" "half"
                    "(#190|frac34)" "three fourths"
                    "(#176|deg)" " degrees"})

(defn convert-misc-entities [text]
  (replace (reduce #(replace %1 (re-pattern (str "&" (key %2) ";")) (val %2)) text ENTITY_RULES) #"&[^;]+;" ""))

(defn convert-misc-chars [text]
  text)
(defn ->slug
  [text]
  (-> (unidecode text)
      (trim)
      (convert-accented-entities)
      (lower-case)
      (replace  #"\s+" "-")))