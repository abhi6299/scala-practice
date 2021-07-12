package com.practice

object crossConversion {

  def main(args: Array[String]): Unit = {

    val s = scala.collection.mutable.Set[Int]() // Mutable set
    s += 1
    s += (2,3)
    s ++= Set(9,8,7)
    println(s)

    val s2 = Set(10,20) //Immutable set
    println(s2)

    val convrt = s2 ++ s // Convertion happen here
    println(convrt)
    //convrt += 99 // Not possible as convrt become immutable
    //println(convrt)

    val convrt2 = s ++ s2
    println(convrt2)
    convrt2 += 100
    println(convrt2)


  }

}
