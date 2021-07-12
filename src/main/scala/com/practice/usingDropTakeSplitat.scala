package com.practice

object usingDropTakeSplitat {

  def main(args: Array[String]): Unit = {

    //drop, take, splitAt - all create new list

    val list = List(1,5,2,3,4)

    val l = list.drop(2)
    println(l)

    val temp = list.take(1)
    println(temp)
    println(list)

    println(list.splitAt(2))
    println(list)

  }

  }
