package com.practice

object reverseInAString extends App{

  def reverse(x: Int): Int = {

    var sign = 1
    if(x<0)
    {
      sign = sign * -1
    }

    var temp = x.toString
    var i = 0
    var j = temp.length-1
    while(i<j)
    {
      var a = temp.charAt(i)
      temp.replace(temp.charAt(i),temp.charAt(j))
      temp.charAt(j)=a
      i = i+1
      j = j-1
    }
    var b : Int = temp.toInt
    b = b * sign
    b
  }

  def main(args: Array[String]): Unit = {

    val ans : Array[Int] = Array (-1,0,1,2,-1,-4)
    val t : Int = 6
    val a = reverse(1234)
    println(a)

  }

}
