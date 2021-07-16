package com.practice

//Examaple 1
trait TraitExample{
  var value: Int // Abstract field
  // Concrete field
  var Height = 10
  val Width = 30
}
class MClass extends TraitExample {
  // Overriding MyTrait's fields
  var value = 12
  Height = 40
  override val Width = 10
  def Display() = {
    printf("Value:%d", value);
    printf("\nHeight:%d" ,Height);
    printf("\nWidth:%d", Width);
  }
}

//Example 2
trait TraitExample2{
  var Height = 10
  val Width = 30
}
class MClass2 { // Not extending trait here
  def print() = println("Example Class")
}

object Trait2 {

  def main(args: Array[String]): Unit = {

    // Override: abstract fields are those fields with containing initial value and concrete fields are
    // those fields which contain the initial value. we are allowed to override them in the class which
    // extends trait. If a field is declared using the var keyword, then there is no need to write override
    // keyword when we override them. And if a field is declared using the val keyword, then you must write
    // override keyword when we override them.
    var x = new MClass()
    x.Display()

    val y = new MClass2() with TraitExample2 //We can also add traits to an object instance.
    y.print()
    println(y.Height+","+y.Width)
  }
  }
