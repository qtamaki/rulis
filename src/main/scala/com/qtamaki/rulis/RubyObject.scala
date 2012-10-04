package com.qtamaki.rulis

class RubyObject(n: Any) {
	def to_s = n.toString
	def nil_? = n == null
	// RubyならTを動的に渡せるが、Scalaじゃ無理？
	def is_a_?[T] = n.isInstanceOf[T]
}