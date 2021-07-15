package com.practice

object HigherOrderFunction {

  private def convertCtoF(temp: Double) = temp * 1.8 + 32

  // The return type of the below function is a function which accept two parameter(both String)
  // and return one Value:String
  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }

  def main(args: Array[String]): Unit = {

    //Higher Order Function
    val salaries = Seq(20000, 70000, 40000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(doubleSalary)
    println(newSalaries)

    //or
    val newList = salaries.map(_*2)
    println(newList)
    //or
    val newList1 = salaries.map(i => i*2)
    println(newList1)


    //Methods into function
    val temperatures = List(10.0,20.0,30.0)
    def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
    println(forecastInFahrenheit)

    //Function that return a function


    val domainName = "www.example.com"
    def getURL = urlBuilder(ssl=true, domainName)
    val endpoint = "users"
    val query = "id=1"
    val url = getURL(endpoint, query)
    println(url)

  }

  }
