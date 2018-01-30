package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 10/01/18.
  */
object createFunction extends App {

  //How to define and use a function which has a return type

  println("Step 1: How to define and use a function which has a return type")
  def favoriteDonut(): String = {
    "Glazed Donut"
  }

  val myFavoriteDonut = favoriteDonut()
  println(s"My favorite donut is $myFavoriteDonut")

  //How to define and use a function with no parenthesis
  println("\nStep 2: How to define and use a function with no parenthesis")
  def leastFavoriteDonut = "Plain Donut"
  println(s"My least favorite donut is $leastFavoriteDonut")

  //How to define and use a function with no return type
  println("\nStep 3: How to define and use a function with no return type")
  def printDonutSalesReport(): Unit = {
    // lookup sales data in database and create some report
    println("Printing donut sales report... done!")
  }
  printDonutSalesReport()

  //Use type inference to define function with no return type
  println("\nStep 4: Use type inference to define function with no return type")
  def printReport {
    // lookup sales data in database and create some report
    println("Printing donut report... done!")
  }
  printReport

}
