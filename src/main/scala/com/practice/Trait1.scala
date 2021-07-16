package com.practice

object Trait1 {

  trait MyTrait
  {
    def pet
    def pet_color
  }
  trait ExampleTrait{
    def print() ={
      println("This is a example trait")
    }
  }

  //When a class inherits one trait, then use extends keyword.When a class inherits multiple traits then use
  // extends keyword before the first trait and after that use with keyword before other traits.
  class MyClass extends MyTrait with ExampleTrait
  {
    def pet(){ // Implementation of methods of MyTrait
      println("Pet: Dog")
    }
    def pet_color(){
      println("Pet_color: White")
    }
    def pet_name(){ // Class method
      println("Pet_name: Dollar")
    }
  }

  def main(args: Array[String]): Unit = {
    //Unlike class inheritance, in which each class must inherit from just one superclass,
    // a class can mix in any number of traits.

    //Traits are like interfaces in Java. But they are more powerful than the interface in Java because
    // in the traits you are allowed to implement the members. Traits can have methods(both
    // abstract and non-abstract), and fields as its members.

    //Note: we are allowed to implement the method(only abstract methods) in traits. If a trait contains method
    // implementation, then the class which extends this trait need not implement the method which already implemented
    // in a trait.

    // We can inherit a class and multiple trait together also !
    val obj = new MyClass()
    obj.pet()
    obj.pet_color()
    obj.pet_name()
    obj.print()

    //1- Traits does not contain constructor parameters.
    //2- An "abstract class" can also inherit traits by using extends keyword.
    //3- In Scala, one trait can inherit another trait by using a extends keyword.
    //4- Traits support multiple inheritance: a class can inherit both normal classes or abstract class and traits
    //by using extends keyword before the class name and with keyword before the trait’s name
  }

  }
