package com.practice

object runningSum {

  def runningSum(nums: Array[Int]): Array[Int] = {

    var ans: Array[Int] = new Array[Int](nums.length)
    var sum: Int = 0

    for(i <- 0 to nums.length-1)
    {
      ans(i) = sum + nums(i)
      sum = sum + nums(i)
    }

    ans

  }

  def main(args : Array[String]): Unit = {
    var a: Array[Int] = Array(1,2,3,4,5)
    var ans = runningSum(a)
    for(i <- ans)
      {
        println(i)
      }
  }

}
