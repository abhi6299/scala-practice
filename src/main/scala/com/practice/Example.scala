package com.practice
  import scala.util.control.Breaks.{break, breakable}
  import util.control.Breaks

object Example {
  def threeSum(nums: Array[Int]): List[List[Int]] = {

    nums.sorted
    var ans : List[List[Int]] = (List(List(0,0,0)))

    for(i <- 0 to (nums.length-1)) {
      breakable {
        if (i > 0 && nums(i) == nums(i - 1)) break
        var j = i + 1
        var k = nums.length - 1
        while (j < k) {
          val sum : Long = nums(i) + nums (j) + nums (k)
          if (sum == 0) {
            val temp: List[Int] = List(nums(i),nums(j),nums(k))

            /*
            How should I append the list "temp" in ans?

          val b=ans :: temp
            ans=b.clone()

            */

            while (j < k && nums(j) == nums(j + 1)) {
              j=j+1
            }

            while (j < k && nums(k) == nums(k - 1)) {
              k=k-1
            }

            j=j+1;
            k=k-1;

          }
          else if (sum < 0) {
            j=j+1
          }
          else {
            k=k-1
          }
        }
      }
    }
    ans
  }


  def main(args: Array[String]): Unit = {

    val ans : Array[Int] = Array (-1,0,1,2,-1,-4)
    val t : Int = 6
    val a = reverse(1234)
    println(a)

  }

  }