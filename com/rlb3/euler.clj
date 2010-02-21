(ns com.rlb3.euler
  (:use clojure.contrib.lazy-seqs))

(defn problem1 [end]
  (reduce +
          (filter #(or (= (mod % 3) 0) (= (mod % 5) 0))
                  (range 1 end))))

(defn problem2 []
  (reduce +
          (filter even?
                  (for [x (fibs) :while (< x 4000000)] x))))

(defn problem3 [num cur]
  (if (= num cur)
    num
    (if (zero? (mod num cur))
      (problem3 (/ num cur) cur)
      (problem3 num (inc cur)))))

(defn problem7 []
  (last (take 10001 primes)))

