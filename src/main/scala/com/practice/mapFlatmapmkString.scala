package com.practice

import scala.collection.mutable.ListBuffer

object mapFlatmapmkString {

  def main(args: Array[String]): Unit ={

    //Use of mkString
    val t = ListBuffer(1,2,3,4,5)
    t += 100
    val t1 = t.mkString("*")
    println(t1)
    println(t)

    //Use of map and flatten
    var words = ListBuffer("I","live","in","india")
    var w = words.map(_.toUpperCase())
    println(w)

    var p = w.flatMap(_.toLowerCase())
    println(p)

    var w1 = w.flatten
    println(w1)


    // Flatmap
    var name = Seq("Nidhi","Singh")
    var n = name.flatMap(_.toUpperCase())
    println(n)

    println(List.range(1,5).flatMap(i => List.range(1,i).map(j => (i,j))))
    println(List.range(1,5) flatMap(i => List.range(1,i) map(j => (i,j)))) // Can use without using .


    val x = List(4,5,6,7)
    val res = x.flatMap{
      s => List(s,s-1) //RHS is the function corresponding to s
    }
    println(res)

    val res1 = x flatMap{
      s => if(s % 3 == 0) List(s) else List(-s)
    }
    println(res1)


  }

}
