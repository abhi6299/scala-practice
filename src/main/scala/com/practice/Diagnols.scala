package com.practice

object Diagnols {

  def diagonalSum(mat: Array[Array[Int]]): Int = {


    var sum = 0

    for(i <- 0 to mat.length-1)
    {
      sum = sum+mat(i)(i)
    }
    var i = 0
    for(j <- mat.length-1 to 0 by -1)
    {
      if(i!=j)
      {
        sum = sum+mat(j)(i)
      }
      i=i+1
    }
    sum
  }

}
