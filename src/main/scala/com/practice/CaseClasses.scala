package com.practice

//1-The Case class has a default apply() method which manages the construction of object.
//A Case Object is also like an object, which has more attributes than a regular Object.
//Adv of case obj over the other -
//  1.It is serializable.
//  2.It has a by default hashCode implementation.

case class Book (name:String, author:String)

object CaseClasses {

  def main(args: Array[String]): Unit = {
    //you can create objects of the Case Class even in the absence of the keyword new.
    var Book1 = Book("Data Structure and Algorithm", "cormen")
    var Book2 = Book("Computer Networking", "Tanenbaum")
    println("Name of the Book1 is " + Book1.name);
    println("Author of the Book1 is " + Book1.author);
    println("Name of the Book2 is " + Book2.name);
    println("Author of the Book2 is " + Book2.author);

    //2-Reassignment of parameter variables not possible - The second convenience is that by default Scala
    // compiler affixes val or var for all the parameters of constructor so, we won’t be able to reassign a
    // new value to them once that class object is constructed that’s why even in absence of val or var, case
    // class’s constructor parameters will turn out to be class members, that is not practicable for regular classes.

  }
}
