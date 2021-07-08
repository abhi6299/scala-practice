package com.practice

object whileExample {
  def main(args: Array[String]): Unit ={
    var i=0
    var city = Array("Lucknow","Delhi","Kanpur")
    while(i < city.length)
      {
        println(city(i))
        i += 1
      }
  }
}
