package com.practice

import scala.collection.mutable.ListBuffer

object Excel_CaseClasses {

  def main(args: Array[String]): Unit = {

    case class Student (name:String, age:Int)

    val s1 = Student("Nidhi", 23)
    val s2 = s1.copy()
    val s3 = s1.copy(age = 24)

    println("Name is " + s1.name);
    println("Age is " + s1.age);

    println("Copy Name " + s2.name);
    println("Copy Age " + s2.age);

    println("Copy Name " + s3.name);
    println("Copy Age " + s3.age);

    val l = ListBuffer[Student]()
    l += s1
    l += s2
    l += s2
    l.foreach(println)


  }

}
