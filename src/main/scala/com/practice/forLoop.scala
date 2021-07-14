package com.practice

object forLoop {

  def main(args: Array[String]): Unit ={

    val x = List.range(1,10)

    for(i <- x if i %2 == 0) println(i)

    val y = for{
      i <- x        // A genrator
      n = i + 2       // A definintion
      if (n > 5)      // A filter
    } yield n
    println(y)

    val p = for(x <- List(1,2,3); y<- List("10", "2") if x == y.toInt) yield (x,y)
    println(p)

    for(i <- 1 until 5) print(i)
    println()
    for(i <- 1 to 5) print(i)

  }

}
