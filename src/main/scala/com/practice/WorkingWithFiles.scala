package com.practice

import java.io.{File, PrintWriter}

object WorkingWithFiles {

  def main(args: Array[String]): Unit ={

    //Printing letter by letter
    val fname = "C:\\Users\\Dell\\Desktop\\TCS\\Abhi.txt"
    val s = scala.io.Source.fromFile(fname)
    while (s.hasNext)
    {
      println(s.next)
    }
    // closing file
    s.close()

    //Printing Line by line
    val s1 = scala.io.Source.fromFile(fname)
    for(i <- s1.getLines()){
      println(i)
    }
    s1.close

    //Writing in a file
    val file_Object = new File("C:\\Users\\Dell\\Desktop\\TCS\\abc.txt" ) // Creating a file
    val print_Writer = new PrintWriter(file_Object) // Passing reference of file to the printwriter
    print_Writer.write("Hello, This is Geeks For Geeks") // Writing to the file
    print_Writer.close() // Closing printwriter

    /*
    def scalaFiles =
      for {
        file <- filesHere
        if file.getName.endsWith(".scala")
      } yield file

    for (
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala")
    ) println(file)
    */

  }

}
