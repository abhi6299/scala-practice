package com.practice

import scala.collection.mutable.ArrayBuffer

object UsingFilterFunctions {

  def main(args: Array[String]): Unit = {

    //The withFilter method takes a predicate function and will restrict the elements to match the predicate function.
    // withFilter does not create a new collection while filter() method will create a new collection
    val donuts: Seq[String] = List("Plain Donut", "Strawberry Donut", "Glazed Donut")
    donuts.withFilter(_.charAt(0) == 'P').foreach(x => println(s"The donut starting with letter P is:$x"))

    //filter() method will create a new collection
    val city: ArrayBuffer[String] = ArrayBuffer("Lucknow","Kanpur","Sitapur")
    val c = city.filter(_.startsWith("K"))
    println(c)


  }

}
