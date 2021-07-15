package com.practice

//Example 1
abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width =
    if (height == 0) 0 else contents(0).length
}

class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
}

//Example2
class Cat {
  val dangerous = false
}

class Tiger(param1: Boolean, param2: Int) extends Cat {
  override val dangerous = param1
  private var age = param2
}

object AbstractClasses {

  def main(args: Array[String]): Unit = {

    val ae = new ArrayElement(Array("hello", "world"))
    println(ae.width)

    val a = new Tiger(true,30) // Showing overriding of method of base class
    println(a.dangerous)

  }

  }
