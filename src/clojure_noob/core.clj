(ns clojure-noob.core
	(:gen-class)
)

(defn -main
	"Prints a simple message."
	[& args]
	(println "I'm a little teapot!")
)

(defn -useStr
	"Uses str."
	[name]
	(str "Hello, " name)
)

(defn -useVector
	"Uses vector."
	[]
	(vector 1 2 3 4)
)

(defn -useHashMap
	"Uses hash-map."
	[]
	{ :term "human" :definition "a person" }
)

(defn -useHashSet
	"Uses hash-set."
	[]
	(hash-set 1 2 2 3 3)
)

(defn -add100
	"Takes a number and adds 100 to it."
	[n]
	(+ n 100)
)

(defn dec-maker
	"A function that works exactly like the function inc-maker except with subtraction."
	[n]
	#(- % n)
	; can also be: (fn [i] (- i n))
)

(defn mapset
	"Works like map except the return value is a set."
	[_mapper _list]
	(set (map _mapper _list))
)

; Create a function that’s similar to symmetrize-body-part
; except that it has to work with weird space aliens with radial symmetry.
; Instead of two eyes, arms, legs, and so on, they have five.
(defn symmetrize-alien
	"Similar to symmetrize-body-part. But instead of two eyes, arms, legs, and so on, they have five"
	[]
	nil ; TODO
)

; Create a function that generalizes symmetrize-body-parts and the function you created in Exercise 5. 
; The new function should take a collection of body parts and the number of matching body parts to add.
(defn symmetrize
	"Similar to symmetrize-body-part. But is a generalization and can take any number of body parts."
	[n]
	nil ; TODO
)