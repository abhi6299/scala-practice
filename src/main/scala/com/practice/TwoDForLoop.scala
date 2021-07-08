package com.practice

object TwoDForLoop {

  def main(args: Array[String]): Unit = {

    val list = List(List(1,2,3),List(4,5,6),List(7,8,9))

    //Printing in different ways
    for(x <- list) println(x)
    for(x <- list ; y <-x ) print(y)
    println()
    list.foreach(x => x.foreach(print))
    println()

    //Finding sum of list
    var sum = 0
    for(x <- list ; y <-x ) sum += y
    println(sum)

    sum=0
    list.foreach(x => x.foreach(y => sum += y))
    println(sum)
  }

}
