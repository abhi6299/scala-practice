package com.practice

case class Students(id: Int, name:String,department: String,marks: Int)


object Student extends App{

  val St1= Students(1,"Abhi","CSE",100)
  val St2= Students(2,"Abhi","CSE",100)
  println(St1.name)

  val r= new scala.util.Random(100)
  println(r)

  val list: List[Students] = List(St1, St2)

  println(list)

}