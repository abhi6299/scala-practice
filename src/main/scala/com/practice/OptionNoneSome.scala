package com.practice

object OptionNoneSome {

  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }

  def Example(s: Option[String]): Unit = {
    println(s)
  }
  def main(args: Array[String]): Unit = {

    val a = toInt("100")
    val b = toInt("lp")
    println(a)
    println(b)

    //Pattern Matching
    val x = "90g"
    toInt(x) match {
      case Some(i) => println(i)
      case None => println("That didn't work.")
    }

    //Example("Lucknow") // This won't work since the arg in Example func is Option
    Example(Some("Abhinav"))
    Example(None)

  }

  }
