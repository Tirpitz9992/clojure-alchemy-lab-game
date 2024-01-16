(ns clojure-alchemy-lab-game.keyboard)

(defn handle-key-pressed [state key]
  (assoc state :last-key key))

(defn handle-key-released [state key]
  (assoc state :last-key nil))
