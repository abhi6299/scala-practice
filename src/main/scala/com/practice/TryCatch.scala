package com.practice

import java.io.{FileNotFoundException, FileReader, IOException}
import scala.reflect.internal.util.NoFile.file

object TryCatch {

  def main(args: Array[String]): Unit = {

    try{
      var file = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => println("Not Found")
      case ex: IOException => println("Unable to read file properly")
    }
    finally {
      //file.close()
    }

  }
}