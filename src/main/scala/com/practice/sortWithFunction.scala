package com.practice

object sortWithFunction {

  def main(args: Array[String]): Unit = {

    println(List(1,-3,4,2,6).sortWith(_<_))

    val listWords = List("Lucknow","Mumbai","Delhi")

    println(listWords.sorted)
    println(listWords.sortWith(_.length<_.length))

  }

  }
