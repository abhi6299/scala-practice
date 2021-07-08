package com.practice

import scala.collection.immutable.HashMap
import scala.collection.mutable

object workingOnMaps {

  def main(args: Array[String]): Unit ={
    var i=0

    val immutableMap = HashMap(1->"A")
    val mutableMap = mutable.HashMap(1->"b",2->"c",3->"d",3->"k") //Repeated elements will not be printed in set

    println(mutableMap)
    println(immutableMap)

    mutableMap += 23->"P"
    println(mutableMap)

    //immutableSet += 23 //This won't work as the immutable Hashset has been used
    val temp = immutableMap + (23->"H") // Adding element in immutable sets like this
    println(temp)
  }

}
