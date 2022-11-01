(ns treinamento.core
  (:require
   ;[clojure.walk :refer [macroexpand-all]]
   [treinamento.teste :as tst]
   [clojure.string :as cljstr]
   ) 
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(tst/soma2 3 4)
(Math/pow 2 3)
Math/PI

(= (cljstr/reverse "palavra") "palavra")
(reverse "palavra")

;(def lista '(1 2 3 4))

;(defn funcao-let [argumento]
 ; (let [simbolo (+ 3 (* 4 argumento))
  ;      simbolo2 "outro valor"]
   ; simbolo
    ;simbolo2))

;(defn recursao [numero]
;  (println numero)
;  (println "faz isso")
;  (if (neg? numero)
;    "é negativo"
;    (recursao (dec numero))))

;(recursao 5)

;(defn funcao-loop [num1 num2]
 ; (loop [arg1 num1
  ;       arg2 num2
   ;      saida []]
    
   ; (cond
   ;   (even? arg1)
   ;   (recur (dec arg1) arg2 (conj arg1))
;
 ;     (zero? (rem arg2 3))
  ;    (recur arg1 (dec arg2) (conj arg2))
;
 ;     :else saida)
  ;  
   ; ))


(for [horas (range 4)]
  (for [minutos (range 0 60 10)]
    [horas minutos]))

;(loop [numero 10]
  ;(if (zero? numero)
   ; "saida"
   ; (do
     ; (when (even? numero)
    ;    (println "corpo do when")
   ;     (println (+ 3 4))
  ;      (println numero)))
 ;   (recur (dec numero))))

(fn [arg1 arg2] (+ 3 arg1 arg2))

(#(* %2 (+ 3 %1)) 5 2)

(map #(+ 3 %) [1 2 3])

(defn funcao1 [& args]
  args)

(defn funcao2 [argumento]
  argumento)

(funcao2 2)
(funcao1 2 3)

;(defn funcao-soma [x & args]
 ; (apply + x))

(apply + 1 2 [1 2 3])

;(funcao-soma 1 2)

(range 5)
(range 2 7)
(range 3 13 2)

(defn meu-range
  ([] (range 7))
  ([num] (meu-range 3 num 2))
  ([num1 num2] (meu-range num1 num2 2))
  ([ini fim passo] (range ini fim passo)))

(meu-range 9)
(meu-range 0 9)


(range 10) -> (range 0 10 1)
(range 0 10 1)

(range )

;(defn funcao-multimetodos
 ; ([] "corpo 1")
  ;([ent1] "corpo 2")
  ;([ent1 ent2] "corpo 3")
  ;([ent1 ent2 ent3] "corpo 4"))

;(funcao-multimetodos 1 2 3)