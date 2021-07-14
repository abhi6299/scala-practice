package com.practice

object FirstClassFunction {

  def main(args: Array[String]): Unit = {

    var increase = (x: Int) => {
      println("Working with first clas function")
      x + 1
    }

    println(increase(10))

  }

  }
