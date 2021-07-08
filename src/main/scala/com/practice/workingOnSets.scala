package com.practice

import scala.collection.immutable.HashSet
import scala.collection.mutable

object workingOnSets {

  def main(args: Array[String]): Unit ={
    var i=0

    val immutableSet = HashSet(1)
    val mutableSet = mutable.HashSet(1,2,3,3) //Repeated elements will not be printed in set

    println(mutableSet)
    println(immutableSet)

    mutableSet += 23
    println(mutableSet)

    //immutableSet += 23 //This won't work as the immutable Hashset has been used
    val temp = immutableSet + 23 // Adding element in immutable sets like this
    println(temp)
  }

}
