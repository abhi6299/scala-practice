package com.practice

import scala.collection.mutable.ArrayBuffer

object workingOnArrays {

  def main(args: Array[String]): Unit ={
    var i=0
    var city = Array("Lucknow","Delhi","Kanpur") //a Scala array is a mutable sequence of objects that all share the same type.
    var temp: ArrayBuffer[Int] = new ArrayBuffer[Int]()

    temp.append(4)
    temp += 10

    println(temp)

    city.foreach(x => println(s"$x $x")) // Method 1
    city.foreach{ //Method 2
      x => println(x+x)
    }
    var c:Array[String] = for(i <- city) yield {i+i} //Method 3 using yield
    c.foreach(println)

  }

}
