package com.practice

object foreach {
  def main(args: Array[String]): Unit ={
    var i=0
    var city = Array("Lucknow","Delhi","Kanpur")

    city.foreach(x => println(s"$x $x"))

    city.foreach(println)
    //or
    city.foreach(o => println(o))

    val x = List(1,2,3,4,5)

    var sum1 = 0
    x.foreach(i => sum1 += i)
    println(sum1)

    //or

    var sum2 = 0
    x.foreach(sum2 += _)
    println(sum2)

  }

}
