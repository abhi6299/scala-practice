package com.practice

//Exaple 1
//2-The abstract methods of abstract class are those methods which do not contain any implementation.
abstract class myauthor
{
  // abstract method
  def details()
}
class GFG extends myauthor
{
  def details()
  {
    println("Author name: Ankita Saini")
    println("Topic name: Abstract class in Scala")
  }
}
//Example 2 - an abstract class can also contain fields
abstract class Geek
{
  var name : String = "GeeksforGeeks"
  var tutorial: String = "Scala"
  def portal()
}

// GFG class extends abstract class
class GFG2 extends Geek
{
  def portal() // Abstract class method accessing fields of the abstract class
  {
    println("Portal name: " + name) // Note here
  }
  def tutdetails() // GFG class method accessing fields of the abstract class
  {
    println("Tutorial name: " + tutorial)
  }
}
object AbstractClasses1 {

  def main(args: Array[String]): Unit = {
    ////1-An abstract class is constructed using the abstract keyword. It contains both abstract and non-abstract
    //// methods and cannot support multiple inheritances
    //Example 1- Simply showing abstraction i.e. executing full function in inherited class
    var obj = new GFG()
    obj.details()
    //3- We cannot create a object of abstract class !
    //4- In Scala, an abstract class can also contain fields. These fields are accessed by the abstract class
    // methods and by the methods of the class which inherit abstract class.
    var obj1 = new GFG2()
    obj1.portal()
    obj1.tutdetails()

  }

}
