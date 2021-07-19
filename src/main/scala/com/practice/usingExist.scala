package com.practice

object usingExist {

  def main(args: Array[String]): Unit ={

    val l = List(1,2,3,4,5)
    val x = l.exists(m => {
      m%2 == 0
    })
    println(x)

    //OR || Exist return true or false

    var x1 = 0
    if(l.exists(_%2 != 0)) x1 = 100
    println(x1)

  }

}
