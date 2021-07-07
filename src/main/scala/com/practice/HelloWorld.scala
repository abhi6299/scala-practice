package com.practice
import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer
import scala.math
import scala.math.Numeric.BigDecimalAsIfIntegral.mkNumericOps

object HelloWorld extends App {
  println("Hello World")

  //Question 2
  def greet(name: String): String = s"Hello $name"

  println(greet("Abhinav"))


  val nums = List(1,2,3,4,5,6,7,8,9,10)

  println(nums.sum)

  //for(n <- 10 to 1 by -1 ) println(n)

  //val numbers = (1 to 10).toList
  //numbers.foreach(println)
  //println(numbers)

  //val num2= (1 to 10).reverse.toList
  //num2.foreach(println)

  //val evens = for(n <- numbers if n % 2 == 0) yield n
  //numbers.filter(_%2==0).foreach(println)
  //val betterEvens = (0 to 1000000 by 2).toList
  //println(betterEvens)

  val str: String = "Abhinav025"
  if(str.length<10 || str.length>10) println(s"Does not have 10 character in it")
  else println(s"Have 10 Character in it")*/

  /*def factorial(num: Int): Long = {
    if(num == 1) 1
    else
      num * factorial(num-1)
  }
  println(factorial(10))

  def fact(m: Int): Long = {
    def tailFactorial(result: Long, num: Int): Long = {
    if(num == 1) result
    else
      tailFactorial(num * result, num-1)
  }
  tailFactorial(1,m)
  }
  println(fact(10))
  */

  def isPrime(num: Int, i: Int): Boolean = {
    if(num < 2) false
    else if(num == 2) true
    else if(num % i == 0) false
    else if(i*i > num) true
    else isPrime(num, i + 1)
  }
  if(isPrime(7,2)) println(s"It is prime number")
  else println(s"It is not prime number")

  /*def ConCat(t: List[String], str: String, i: Int): String = {
    if(t.length == i) str
    else{
      val temp = s"$str${t.take(i)}"
      ConCat(t.drop(1),temp,i+1)
    }

  }

  val temp = List("Abhinav", "Dhruv", "Lucknow")
  val str = ConCat(temp,"",1)
  println(str)*/

  /*
  //Creating arrays of string, int and doubles
  val nums = ArrayBuffer(1, 2, 3)
  val names = ArrayBuffer("Abhi", "LKO")
  val numDoubles = ArrayBuffer(1.7, 5.6)
  val temp = ArrayBuffer[Int]()
  nums.foreach(println)

  temp.append(1)
  temp.appendAll(Seq(4,7))
  temp.foreach(println)
  */
  /*
  //Creating list of string, int and doubles
  val nums = List(1, 2, 3)
  val names = List("Abhi", "LKO")
  val numDoubles = List(1.7, 5.6)
  val temp = List[Int]()
  nums.foreach(println)

  val a = 0 +: nums
  println(nums)
  println(a)
  val b = a :+ nums
  println(b)
  val c = a :+ List(7,6,5)
  println(c)
  val d = a :+ Vector(7,6,5)
  println(d)
   */
  /*
  //Creating sets of string, int and doubles
  val nums = scala.collection.mutable.Set(1, 2, 3)
  val names = Set("Abhi", "LKO")
  val numDoubles = scala.collection.mutable.Set(1.7, 5.6)
  val temp = Set[Int]()
  numDoubles.foreach(println)

  nums += 10
  println(nums)
  numDoubles ++= Set(4.9,5.2,6.5)
  println(numDoubles)
  */
  /*
  //Creating tuple map of string, int and doubles
  val nums = scala.collection.mutable.Map("India" -> 5000, "Australia" -> 10000, "US" -> 30000)
  nums.foreach{
    case(s,i) => println(s"Country: $s, Population: $i")
  }
  nums.foreach{
    p => if(p._2 > 1000) nums(p._1)=p._2*2
  }
  nums.foreach{
    case(s,i) => println(s"Country: $s, Population: $i")
  }*/

  /*
  def convertToFahrenheit(cel: Double): Double = {
    val fah = (cel * 1.8) + 32
    fah
  }
  def solve(cel: List[Double]): List[Double]={
    val x=cel.map(convertToFahrenheit)
    x
  }

  val list = solve(List(3.4,4.5,5.6))
  println(list)


  val city = List("Lko", "Mumbai", "Lonavala")
  val newCity=city.filter(_.charAt(0) == 'L')

  println(newCity)
  */

  /*
  trait shape {
    def area(): Int
  }
  class circle(radius: Int) extends shape{
    override area(): Int ={
      val x = (radius * radius * 22)/7
      x
    }
  }
  val c= new circle(2)
  println(c.area())
  */

}

