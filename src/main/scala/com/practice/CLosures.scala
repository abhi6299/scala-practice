package com.practice

object CLosures {

  def main(args: Array[String]): Unit = {

    //Scala Closures are functions which uses one or more free variables
    // and the return value of this function is dependent of these variable.

    //A closure function can further be classified into pure and impure functions, depending on the type of the
    // free variable. If we give the free variable a type var then the variable tends to change the value any
    // time throughout the entire code and thus may result in changing the value of the closure function.
    // Thus this closure is a impure function. On the other-hand if we declare the free variable
    //of the type val then the value of the variable remains constant and thus making the closure function a pure one.

    var employee = 50 // Since var is used so impure function

    // define closure function
    val gfg = (name: String) => println(s"Company name is $name"+
      s" and total no. of employees are $employee")

    gfg("geeksforgeeks")
  }

  }
