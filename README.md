# slugger

Slugger is a library primarily to create 7-bit url slugs from strings.

The goal is for Slugger to replicate the functionality of the Ruby stringex gem.

https://github.com/rsl/stringex

## Usage

Add the following to your project.clj

```clojure
[slugger "1.0.0"]
```

Then you can use it:

```clojure
(use 'slugger.core)

(->slug "learn how to say 你好") 
=> "learn-how-to-say-ni-hao"

(->slug "learn how to say 你好")
=> "learn-how-to-say-ni-hao"

(->slug " this string   should be simple enough")
=> "this-string-should-be-simple-enough"

(->slug "Vi vil have mere &Oslash;l")
=> "vi-vil-have-mere-oel"

(->slug "Vi vil have mere øl")
=> "vi-vil-have-mere-oel"

(->slug "An idea worth $100")
=> "an-idea-worth-100-dollars"

(->slug "my email address is pelle@picomoney.com")
=> "my-email-address-is-pelle-at-picomoney-dot-com"
```

## Unidecoder

This library includes Giuseppe Cardone's excellent Junidecode.

http://junidecode.sourceforge.net/

It is not available in a maven library so I include it within the jar.

Note I have made a few minor changes to it for transliterating Scandinavian letters using local rules.

You can also use it directly:

```clojure
(use '[slugger.core :only [unidecode]])
(unidecode "私はガラスを食べられます。それは私を傷つけません。")
=>"Si hagarasuwoShi beraremasu. sorehaSi woShang tukemasen. "
```

## License

Copyright © 2012 Pelle Braendgaard

Distributed under the Eclipse Public License, the same as Clojure.

Junidecoder © Giuseppe Cardone

Distributed under BSD license

http://junidecode.sourceforge.net/