package com.practice

object equalStrings {

  def arrayStringsAreEqual(word1: Array[String], word2: Array[String]): Boolean = {

    var s1: String = ""
    var s2: String = ""
    for(i <- 0 to word1.length-1)
    {
      s1=s1+word1(i)
    }

    for(i <- 0 to word2.length-1)
    {
      s2=s2+word2(i)
    }

    var ans = false
    if(s1.equals(s2))
    {
      ans=true
    }
    ans
  }

  def main(args: Array[String]): Unit = {
    var a: Array[String] = Array("a","b")
    var b = Array("b","a")
    var t = 3
    var ans = arrayStringsAreEqual(a,b)
    if(ans == true)
      println("Equal")
    else
      println("Unequal")
  }

}
