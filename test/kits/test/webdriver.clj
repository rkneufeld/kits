(in-ns 'kits.homeless)

(when-after-clojure-1-3
 (ns kits.test.webdriver
   (:use kits.webdriver)))

;;; Even though there are no tests in this file it still serves the purpose of
;;; testing that the namespace can be loaded