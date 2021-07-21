package com.practice

import scala.collection.mutable.ListBuffer

object Excel_Functions {
  private def convertCtoF(temp: Double) = temp * 1.8 + 32

  def Solve(l: List[String]): List[String] = {
    val x = ListBuffer[String]()
    for(i <- 0 to l.length-1) {
      if(l(i)(0)=='A')
        x += l(i)
    }
    val y = x.toList
    println(x)
    y
  }

  def main(args: Array[String]): Unit = {

    val temperatures = List(10.0,20.0,30.0)
    def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
    println(forecastInFahrenheit)


    var count = 0
    val fname = "C:\\Users\\Dell\\Desktop\\TCS\\Abhi.txt"
    val s = scala.io.Source.fromFile(fname)
    while (s.hasNext)
    {
      if(s.next.toInt != 32)
        count = count + 1
    }
    println(count)
    s.close()

    val l = List("Abhinav","Abhishek","Dhruv","Nikhil")
    val a = l.filter(_.startsWith("A"))
    println(a)
    //OR
    val b = Solve(l)
    println(b)

  }
}
