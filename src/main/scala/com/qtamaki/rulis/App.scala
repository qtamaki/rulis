package com.qtamaki.rulis

import RubyLike._

object App {
  def main(args: Array[String]) {
    println("Hello com.qtamaki.Ruby Like Scala!")
    println("".blank_?)
    println("abc" << "def" << "ghi" << 1.to_s << (1.2).to_s)
    var x:String = null
    println(x.nil_?)
    x = "not null!!"
    println(x.nil_?)
    println(x.is_a_?[String])
  }
}
