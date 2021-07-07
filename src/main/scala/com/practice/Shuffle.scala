package com.practice

object Shuffle {

  def shuffle(nums: Array[Int], n: Int): Array[Int] = {

    var ans = new Array[Int](nums.length)
    var j = n
    var k = 0
    for (i <- 0 to n - 1) {
      ans(k) = nums(i)
      ans(k + 1) = nums(j)
      j = j + 1
      k = k + 2
    }

    ans
  }

  def main(args: Array[String]): Unit = {
    var a: Array[Int] = Array(1, 2, 3, 4, 5, 6)
    var t = 3
    var ans = shuffle(a,t)
    for (i <- ans) {
      println(i)
    }
  }

}
