package com.practice

object workingOnList {

  def main(args: Array[String]): Unit ={
    var i=0

    var temp: List[Int] = List(1)

    val temp2 = for(x <- temp) yield x*2

    println(temp2)
  }

}
