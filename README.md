# slugger

Slugger is a library primarily to create 7-bit url slugs from strings.

The goal is for Slugger to replicate the functionality of the Ruby stringex gem.

https://github.com/rsl/stringex

## Usage

Add the following to your project.clj

```clojure
[slugger "0.1.0"]
```

Then you can use it:

```clojure
(use 'slugger.core)

(->slug "learn how to say 你好") 
=> "learn-how-to-say-ni-hao"
```

## License

Copyright © 2012 Pelle Braendgaard

Distributed under the Eclipse Public License, the same as Clojure.

Junidecoder © Giuseppe Cardone

Distributed under BSD license

http://junidecode.sourceforge.net/