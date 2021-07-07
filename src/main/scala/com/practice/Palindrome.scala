package com.practice

object Palindrome {

  def isPalindrome(x: Int): Boolean = {

    var ans : Boolean = true

    if(x<0){
      ans = false
    }
    else{
      var s = x.toString
      var i = 0
      var j = s.length-1
      while(i<j)
      {
        if(s.charAt(i) != s.charAt(j)){
          ans = false
        }
        i = i+1
        j = j-1
      }
    }
    ans
  }

  def main(args : Array[String]): Unit = {
  var a: Int = 11
  var ans: Boolean = isPalindrome(a)
  if(ans == true)
  {
  println("Yes")
  }
  else{
  println("No")
  }
  }

}
