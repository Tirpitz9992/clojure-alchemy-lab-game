(ns clojure-alchemy-lab-game.core
  (:require [quil.core :as q]))

(defn setup []
  (q/frame-rate 30)
  ;设置帧率和颜色
  (q/background 255))

(defn update-state [state]
  state)

(defn draw-state [state]
  (q/fill 0)
  (q/rect 10 10 100 100))

(q/defsketch test
             :title "测试"
             :size [400 400]
             :setup setup
             :update update-state
             :draw draw-state)
