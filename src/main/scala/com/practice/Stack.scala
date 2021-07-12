package com.practice

object Stack {

  def main(args: Array[String]): Unit = {

    val x = scala.collection.mutable.Stack(1,2,3)
    x.push(10)
    x.push(90)
    println(x)
    x.pop
    println(x)
    x.pop()
    println(x)

  }

}
