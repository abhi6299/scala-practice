package com.practice

object usingFilterPartitionFindTakeWhileDropWhileSpan {

  def main(args: Array[String]): Unit = {

    //Filter
    val a = Array(300,400,800,1300)
    a.filter(_%400 == 0).foreach(println)
    //or
    val b = a.filter(_%400 == 0)
    for(i <- b) println(i)

    for(i <- a) println(i)

    //Partition
    println(List(1,2,3,4,5,6).partition(_%2 == 0))

    //Find
    val x = List(1,2,3,4,5,6).find(_%2 == 0)
    println(x)
    println(List(1,2,3,4).find(_>5)) // Gives None as Answer

    //Takewhile : takes the longest prefix of list xs such that every element in the prefix satisfies p
    val list = List(2,3,4,1)
    println(list.takeWhile(_<4))

    //Drop while: removes the longest prefix of list xs such that every element in the prefix satisfies p
    println(list.dropWhile(_<4))

    //Span : The span method combines takeWhile and dropWhile in one operation, just
    //like splitAt combinestake and drop. It returns a pair of two lists, defined by the equality:
    //xs span p equals (xs takeWhile p, xs dropWhile p)

    println(List(4,8,13,12,50,60,70,80).span(_%4 == 0))



  }

  }
