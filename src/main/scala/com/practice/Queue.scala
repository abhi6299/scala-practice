package com.practice
import scala.collection.mutable._

object Queue {

  def main(args: Array[String]): Unit = {

    val x = scala.collection.mutable.Queue(1,2,3)
    x.enqueue(10)

    println(x)

  }

  }
