(ns slugger.conversions-test
  (:use clojure.test
        slugger.conversions))

(deftest unidecode-test
  ;; I Changed the unidecode rules for scandivian and german letters to follow conventions
  (is (= (unidecode "Brændgård vil have øl i grünefeldt") "Braendgard vil have ol i grunefeldt"))

  ;; The following tests were converted from Java from Junidecoder
  (is (= (unidecode "\u00C6neid") "AEneid"))
  (is (= (unidecode "\u00e9tude") "etude"))
  ; Chinese
  (is (= (unidecode "\u5317\u4eb0") "Bei Jing "))
  ; Canadian syllabics
  (is (= (unidecode "\u1515\u14c7\u14c7") "shanana"))
  ; Cherokee
  (is (= (unidecode "\u13d4\u13b5\u13c6") "taliqua"))
  ; Syriac
  (is (= (unidecode "\u0726\u071b\u073d\u0710\u073a") "ptu'i"))
  ;Devangari
  (is (= (unidecode "\u0905\u092d\u093f\u091c\u0940\u0924") "abhijiit"))
  ; Bengali
  (is (= (unidecode "\u0985\u09ad\u09bf\u099c\u09c0\u09a4") "abhijiit"))
  ;Malayalaam
  (is (= (unidecode "\u0d05\u0d2d\u0d3f\u0d1c\u0d40\u0d24") "abhijiit"))
  
  ;; Malayalaam. The correct transliteration is "malayaalam" but
  ;; since junidecode is context insentitive this is the best we can
  ;; do.
  (is (= (unidecode "\u0d2e\u0d32\u0d2f\u0d3e\u0d32\u0d2e\u0d4d") "mlyaalm"))
  ; Japanese
  (is (= (unidecode "\u3052\u3093\u307e\u3044\u8336") "genmaiCha "))

  ; The following tests were taken from here:
  ; https://github.com/rsl/stringex/blob/master/test/unidecoder_test.rb

  ; Which took it from here originally
  ; http://www.columbia.edu/kermit/utf8.html
  (let [ dont-convert [ "Vitrum edere possum; mihi non nocet." ; Latin
                        "Je puis mangier del voirre. Ne me nuit." ; Old French
                        "Kristala jan dezaket, ez dit minik ematen." ; Basque
                        "Kaya kong kumain nang bubog at hindi ako masaktan." ; Tagalog
                        "Ich kann Glas essen, ohne mir weh zu tun." ; German
                        "I can eat glass and it doesn't hurt me."]] ; English
      (doseq [s dont-convert]
        (is (= (unidecode s) s))
        ))
  
  (let [convert { "Je peux manger du verre, ça ne me fait pas de mal."  ; French
                    "Je peux manger du verre, ca ne me fait pas de mal."
                  "Pot să mănânc sticlă și ea nu mă rănește."  ; Romanian
                    "Pot sa mananc sticla si ea nu ma raneste."
                  "Ég get etið gler án þess að meiða mig."  ; Icelandic
                    "Eg get etid gler an thess ad meida mig."
                  "Unë mund të ha qelq dhe nuk më gjen gjë."  ; Albanian
                    "Une mund te ha qelq dhe nuk me gjen gje."
                  "Mogę jeść szkło i mi nie szkodzi."  ; Polish
                    "Moge jesc szklo i mi nie szkodzi."
                  "Я могу есть стекло, оно мне не вредит."  ; Russian
                    "Ia moghu iest' stieklo, ono mnie nie vriedit."
                  "Мога да ям стъкло, то не ми вреди."  ; Bulgarian
                    "Mogha da iam stklo, to nie mi vriedi."
                  "ᛁᚳ᛫ᛗᚨᚷ᛫ᚷᛚᚨᛋ᛫ᛖᚩᛏᚪᚾ᛫ᚩᚾᛞ᛫ᚻᛁᛏ᛫ᚾᛖ᛫ᚻᛖᚪᚱᛗᛁᚪᚧ᛫ᛗᛖ᛬"  ; Anglo-Saxon
                    "ic.mag.glas.eotacn.ond.hit.ne.heacrmiacth.me:"
                  "ὕαλον ϕαγεῖν δύναμαι· τοῦτο οὔ με βλάπτει"  ; Classical Greek
                    "ualon phagein dunamai; touto ou me blaptei"
                  "मैं काँच खा सकता हूँ और मुझे उससे कोई चोट नहीं पहुंचती"  ; Hindi
                    "maiN kaaNc khaa sktaa huuN aur mujhe usse koii cott nhiiN phuNctii"
                  "من می توانم بدونِ احساس درد شيشه بخورم"  ; Persian
                    "mn my twnm bdwni Hss drd shyshh bkhwrm"
                  "أنا قادر على أكل الزجاج و هذا لا يؤلمن"  ; Arabic
                    "'n qdr `l~ 'kl lzjj w hdh l yw'lmn"
                  "אני יכול לאכול זכוכית וזה לא מזיק לי"  ; Hebrew
                    "ny ykvl lkvl zkvkyt vzh l mzyq ly"
                  "ฉันกินกระจกได้ แต่มันไม่ทำให้ฉันเจ็บ"  ; Thai
                    "chankinkracchkaid aetmanaimthamaihchanecchb"
                  "我能吞下玻璃而不伤身体。"  ; Chinese
                    "Wo Neng Tun Xia Bo Li Er Bu Shang Shen Ti . "
                  "私はガラスを食べられます。それは私を傷つけません。"  ; Japanese
                    "Si hagarasuwoShi beraremasu. sorehaSi woShang tukemasen. "}]
      (doseq [s convert]
        (is (= (unidecode (key s)) (val s))))))

(deftest convert-accented-html-entities-test
  (let [ examples { "&aring;"  "aa"
                    "&egrave;" "e"
                    "&icirc;"  "i"
                    "&Oslash;" "oe"
                    "&uuml;"   "ue"
                    "&Ntilde;" "n"
                    "&ccedil;" "c" }]
    (doseq [ s examples]
      (is (= (convert-accented-entities (key s)) (val s))))))

(deftest convert-misc-html-entities-test
  (let [ examples { "America&#8482;" "America(tm)"
                    "Tea &amp; Sympathy" "Tea and Sympathy"
                    "To be continued&#8230;" "To be continued..."
                    "Foo&nbsp;Bar" "Foo Bar"
                    "100&#163;" "100 pound"
                    "&frac12; a dollar" "half a dollar"
                    "35&deg;" "35 degrees" }]
    (doseq [ s examples]
      (is (= (convert-misc-entities (key s)) (val s))))))

(deftest convert-misc-characters-test
  (let [ examples { "Foo & bar make foobar" "Foo and bar make foobar"
                    "Breakdown #9"  "Breakdown number 9"
                    "foo@bar.com" "foo at bar dot com"
                    "100% of yr love"  "100 percent of yr love"
                    "Kisses are $3.25 each" "Kisses are 3 dollars 25 cents each"
                    "Kisses are €3.25 each" "Kisses are 3 euros 25 cents each"
                    "That CD is £3.25 plus tax" "That CD is 3 pounds 25 pence plus tax"
                    "This CD is ¥1000 instead" "This CD is 1000 yen instead"} ]
    (doseq [ s examples]
      (is (= (convert-misc-characters (key s)) (val s))))))
