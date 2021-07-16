package com.practice

//Example 1 - 1-In Scala, an abstract class can also contain a constructor and a constructor of an
// abstract class is called when an instance of a inherited class is created
abstract class author(name: String, topic: String)
{
  def details()
}
class gfg(name: String, topic: String) extends author(name, topic)
{
  def details()
  {
    println("Author name: " + name)
    println("Topic name: " + topic)
  }
}

//Example 2 - An abstract class can also contain only non- abstract method. This allows us to create
// classes that cannot be instantiated, but can only be inherited.
abstract class example{
  def details() // Non-abstract method
  {
    println("Welcome to GeeksforGeeks")
  }
}
class gfg2 extends example{}

//Example 3 - an abstract class can contain final methods (methods that cannot be overridden)
abstract class example1{
  final def print(): Unit ={
    println("Final method")
  }
}
class gfg3 extends example1{}

object AbstractClasses2 {

  def main(args: Array[String]): Unit = {

    var obj = new gfg("Ankita", "Abstract class")
    obj.details()

    var obj2 = new gfg2()
    obj2.details()

    var obj3 = new gfg3()
    obj3.print()

  }

}
