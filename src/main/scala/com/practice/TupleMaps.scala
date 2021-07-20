package com.practice

import scala.collection.mutable

object TupleMaps {

  def main(args: Array[String]): Unit = {

    var a = mutable.HashMap[String,Int]()
    a += ("lucknow" -> 1000)
    a += ("kanpur" -> 2000)
    a += ("delhi" -> 3000)

    a.foreach(println)

    a.foreach{
      x => if(x._2>1000){
        var temp = x._2
        temp = temp * 2
        a(x._1) = temp
      }
    }

    println(a)

  }

  }
