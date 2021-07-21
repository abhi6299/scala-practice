package com.practice

import scala.util.Random

class Stock{
  var symbol = "XYZ"
  var price = 100
}

object PatternMatching {
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }
  def Test(x: Any): Any = x match {
    case 1 | "Abhinav" => "one"
    case 2 | 5.0 => 1
    case _ => "other"
  }

  def Sell = println("Lets sell it")
  def Buy = println("Let's buy it")
  def doNothing = println("Do Nothing")

  def main(args: Array[String]): Unit = {
    val x: Int = Random.nextInt(10)
    println(x)
    x match {
      case 0 => println("zero")
      case 1 => println("one")
      case 2 => println("two")
      case _ => println("other")
    }

    println(matchTest(x)) //Single-Type Match
    println(Test(5.0)) // Multi-Type Match

    //Pattern Matching using if in Case
    val count = 10
    //Variation 1
    count match {
      case 1 => println("one, a lonely number")
      case x if (x == 2 || x == 3) => println("two's company, three's a crowd")
      case x if (x > 3) => println("4+, that's a party")
      case _ => println("i'm guessing your number is zero or less")
    }
    //OR
    count match {
      case 1 =>
        println("one, a lonely number")
      case x if x == 2 || x == 3 =>
        println("two's company, three's a crowd")
      case x if x > 3 =>
        println("4+, that's a party")
      case _ =>
        println("i'm guessing your number is zero or less")
    }
    //OR with parenthesis
    count match {
      case 1 =>
        println("one, a lonely number")
      case x if x == 2 || x == 3 =>
        println("two's company, three's a crowd")
      case x if x > 3 =>
        println("4+, that's a party")
      case _ =>
        println("i'm guessing your number is zero or less")
    }

    //Variation 2
    count match {
      case a if 0 to 9 contains a => println("0-9 range: " + a)
      case b if 10 to 19 contains b => println("10-19 range: " + b)
      case c if 20 to 29 contains c => println("20-29 range: " + c)
      case _ => println("Hmmm...")
    }

    //Using instance in pattern matching
    var stock = new Stock()
    stock match {
      case x if (x.symbol == "XYZ" && x.price < 20) => Buy
      case x if (x.symbol == "XYZ" && x.price > 50) => Sell
      case x => doNothing
    }

  }

    /*
      def describe(x: Any) = x match {
        case 5 => "five"
        case true => "truth"
        case "hello" => "hi!"
        case Nil => "the empty list"
        case _ => "something else"
      }

        expr match {
        case BinOp("+", e, Number(0)) => println("a deep match")
        case _ =>

          for ((country, city) <- capitals)
            println("The capital of " + country + " is " + city)
      }

      //for loop
      persons filter (p => !p.isMale) flatMap (p => (p.children map (c => (p.name, c.name))))

      for (p <- persons; if !p.isMale; c <- p.children)
    yield (p.name, c.name)

    for (p <- persons; n = p.name; if (n startsWith "To"))
    yield n

      */



}
