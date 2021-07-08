package com.practice

object workingOnTuples {

  def main(args: Array[String]): Unit ={

    var temp: Tuple2[Int,String] = (1,"Lucknow")

    println(temp._1)
    println(temp._2)
  }

}
