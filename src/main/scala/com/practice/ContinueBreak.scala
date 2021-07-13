package com.practice

object ContinueBreak {

  def main(args: Array[String]): Unit = {

    /*int i = 0; // This is Java
    boolean foundIt = false;
    while (i < args.length) {
      if (args[i].startsWith("-")) {
        i = i + 1;
        continue;
      }
      if (args[i].endsWith(".scala")) {
        foundIt = true;
        break;
      }
      i = i + 1;
    }*/

    // To transliterate this Java code directly to Scala, instead of doing an if and then a continue, you could
    // write an if that surrounds the entire remainder of the while loop. To get rid of the break, you would
    // normally add a boolean variable indicating whether to keep going, but in this case you can
    // reuse foundIt.

    //making use of extra variable
    /*var i = 0
    var foundIt = false
    while (i < args.length && !foundIt) {
      if (!args(i).startsWith("-")) {
        if (args(i).endsWith(".scala"))
          foundIt = true
      }
      i = i + 1
    }*/

    //Using recursion
    /*def searchFrom(i: Int): Int =
      if (i >= args.length) -1
      else if (args(i).startsWith("-")) searchFrom(i + 1)
      else if (args(i).endsWith(".scala")) i
      else searchFrom(i + 1)
    val i = searchFrom(0)*/

    //still want to use break; Use breakable
    /*import scala.util.control.Breaks._
    import java.io._
    val in = new BufferedReader(new InputStreamReader(System.in))
    breakable {
      while (true) {
        println("? ")
        if (in.readLine() == "") break
      }
    }*/

  }
}