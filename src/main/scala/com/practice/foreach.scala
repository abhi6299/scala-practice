package com.practice

object foreach {
  def main(args: Array[String]): Unit ={
    var i=0
    var city = Array("Lucknow","Delhi","Kanpur")

    city.foreach(x => println(s"$x $x"))

    city.foreach(println)

  }

}
