package com.practice

object EnumerationScala extends Enumeration{

  type Enumeration = Value
  // Assigning values
  val first = Value(0,"Thriller") // Default id = 0
  val second = Value(-1,"Horror") // Default id = 1
  val third = Value(-3,"Comedy") // Default id = 2
  val fourth = Value(10,"Romance") // Default id = 3

  type WeekDays = Value
  val firs = Value("Mon")
  val sec = Value("Tues")

  def main(args: Array[String]): Unit = {
    println(s"Main Movie Genres = ${EnumerationScala.values}")
    println(s"Main Movie Genres = ${EnumerationScala.third}")
    println(s"Main Movie Genres = ${EnumerationScala.third.id}")
    println(s"Main Movie Genres = ${EnumerationScala.values}")

  }
  }
