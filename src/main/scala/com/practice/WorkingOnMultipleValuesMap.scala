package com.practice

import scala.collection.mutable

object WorkingOnMultipleValuesMap {
  def main(args: Array[String]): Unit = {

    //One key Multiple Values
    val t = mutable.HashMap(1 -> List("Abhinav", "Lucknow"))
    for (i <- t) {
      println(i._1)
      for (j <- i._2) println(j)
    }

    t.foreach {
      x =>
        println(x._1)
        x._2.foreach(print)
    }
  }

}
