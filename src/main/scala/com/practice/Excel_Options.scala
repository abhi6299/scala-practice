package com.practice

import scala.collection.mutable.ListBuffer

object Excel_Options {

  def main(args: Array[String]): Unit = {

    val a : ListBuffer[Int] = new ListBuffer[Int]()

    l += Some(1000)
    l += Some(2000)
    l += None
    l += Some(3000)

    a += 1000
    a += 2000
    a += 3000

    for(i <- 0 to a.length-1)
      {
        if(a(i)==1000) a(i) = 0
      }
    println(a)

    val l : ListBuffer[Option[Int]] = new ListBuffer[Option[Int]]()
    val l1 : ListBuffer[Option[Int]] = new ListBuffer[Option[Int]]()
    l.foreach {
      x => x match
      {
        case Some(i) => l1 += Some(i*2)
        case None => l1 += None
      }
    }

    println(l1)

    for(i <- 0 to l.length-1){
      l(i) match
      {
        case Some(x) => l(i) = Some(x*2)
        case None => l1 += None
      }
    }

    println(l)


    //Part 3 - ConCat Strings
    val list : ListBuffer[Option[String]] = new ListBuffer[Option[String]]()

    list += Some("1000")
    list += Some("2000")
    list += None
    list += Some("abhinav")

    var temp: String =""
    list.foreach {
      x => x match
      {
        case Some(i) => temp = temp+i
        case None => temp = temp + ""
      }
    }
    println(temp)


  }
}
