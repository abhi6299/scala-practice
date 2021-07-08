package com.practice

object functions extends App{

    val res = maximum(10, 20)
    println(res)

  def maximum(x: Int , y: Int): Int = {
  if(x<y)
  {
    y
  }
  else
  {
    x
  }
}

}
