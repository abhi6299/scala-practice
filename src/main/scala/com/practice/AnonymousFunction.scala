package com.practice

object AnonymousFunction {

  def main(args: Array[String]): Unit = {

    //An anonymous function is also known as a function literal. A function which does not contain a name is known
    //  as an anonymous function. An anonymous function provides a lightweight function definition.
    //  It is useful when we want to create an inline function.

    // Creating anonymous functions
    // with multiple parameters Assign
    // anonymous functions to variables
    var myfc1 = (str1:String, str2:String) => str1 + str2

    // An anonymous function is created
    // using _ wildcard instead of
    // variable name because str1 and
    // str2 variable appear only once
    var myfc2 = (_:String) + (_:String)

    // Here, the variable invoke like a function call
    println(myfc1("Geeks", "12Geeks"))
    println(myfc2("Geeks", "forGeeks"))

  }

  }
