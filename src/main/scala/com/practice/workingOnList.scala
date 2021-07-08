package com.practice

import scala.collection.mutable.ListBuffer

object workingOnList {

  def main(args: Array[String]): Unit ={
    var i=0
    var temp: List[Int] = List(1)

    var a = new ListBuffer[Int]()

    a += 10
    a += 20

    val b= a.toList // Converting a BufferList into List

    println(b)

    println(a)

    val temp2 = for(x <- temp) yield x*2

    println(temp2)
  }

}
