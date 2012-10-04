package com.qtamaki.rulis

class Blankable(n: Any) {
  def blank_? = {
    n match {
      case null => true
      case () => true
      case "" => true
      case _ => false
    }
  }
}