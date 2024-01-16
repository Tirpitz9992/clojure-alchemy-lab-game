(ns clojure-alchemy-lab-game.core
  (:require [quil.core :as q]
            [clojure-alchemy-lab-game.draw :as draw]
            [clojure-alchemy-lab-game.keyboard :as keyboard]))

(defn update-state [state]
  state)

(q/defsketch test
             :title "test"
             :size [400 400]
             :setup draw/setup
             :update update-state
             :draw draw/draw-state
             :key-pressed (fn [state key] (keyboard/handle-key-pressed state key))
             :key-released (fn [state key] (keyboard/handle-key-released state key)))
