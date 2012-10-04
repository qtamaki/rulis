package com.qtamaki.rulis

object RubyLike {
  implicit def toBlankable(n: Any) = new Blankable(n)
  implicit def toRubyString(str: String) = new RubyString(str)
}