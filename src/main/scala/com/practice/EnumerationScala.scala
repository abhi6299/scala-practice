package com.practice

object EnumerationScala extends Enumeration{

  type EnumerationScala = Value
  // Assigning values
  val first = Value(0,"Thriller") // Default id = 0
  val second = Value(-1,"Horror") // Default id = 1
  val third = Value(-3,"Comedy") // Default id = 2
  val fourth = Value(10,"Romance") // Default id = 3

  def main(args: Array[String]): Unit = {
    println(s"Main Movie Genres = ${EnumerationScala.values}")
    println(s"Main Movie Genres = ${EnumerationScala.third}")
    println(s"Main Movie Genres = ${EnumerationScala.third.id}")
  }
  }
