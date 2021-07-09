package com.practice

object listFuntion {

  def main(args: Array[String]): Unit = {

    val list1 = List.range(1, 5)
    println(list1)

    val list2 = List.fill(5)("Abhinav")
    println(list2)

    val list3 = List.fill(2, 3)("Lucknow")
    println(list3)

    //The tabulate method creates a list whose elements are computed according to a
    //supplied function.

    val list4 = List.tabulate(5)(n => n)
    println(list4)
    val list5 = List.tabulate(5)(n => n * n)
    println(list5)
    val list6 = List.tabulate(5, 5)(_ * _)
    println(list6)

    val list7 = List.concat(List('a','b'),List('c'))
    println(list7)



  }

}
