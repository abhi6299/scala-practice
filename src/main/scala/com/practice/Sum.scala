package com.practice

object Sum extend App{

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {

      val ans: Array[Int] = new Array[Int](2)

      val Hash: scala.collection.mutable.Map[Int, Int] = scala.collection.mutable.Map()

      for (n <- 0 to (nums.length - 1)) {

        var x: Int = target - nums(n)
        if (Hash.contains(x)) {
          ans(0) = Hash(x)
          ans(1) = n
          ans
        }

        Hash += (nums(n) -> n)

      }

      ans

    }

  def main(args: Array[String]): Unit = {

  val ans : Array[Int] = Array (2,7,11,15)
  val t : Int = 9
  val a = twoSum(ans,t)
  for(i <- a){
  println(i)
}

}
}
