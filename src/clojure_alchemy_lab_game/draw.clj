(ns clojure-alchemy-lab-game.draw
  (:require [quil.core :as q]))

(defn setup []
  (q/frame-rate 30)
  (q/background 255))

(defn draw-state [{:keys [last-key]}]
  (q/background 255)
  (q/fill 0)
  (q/text-size 16) ; 设置文本大小为16
  (q/text "0" 20 20) ; 显示"0"在屏幕上的(20, 20)位置
  (when last-key
    (q/text (str "Last key pressed: " last-key) 20 40))) ; 如果有按键被按下，显示在(20, 40)位置
