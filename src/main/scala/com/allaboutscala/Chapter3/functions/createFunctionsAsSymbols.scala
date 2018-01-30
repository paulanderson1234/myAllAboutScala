package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 15/01/18.
  */
object createFunctionsAsSymbols extends App {

  //How to create and instantiate a class

  class DonutCostCalculator {

    // We are hard-coding the totalCost value for simplicity.
    val totalCost = 100

    def minusDiscount(discount: Double): Double = {
      totalCost - discount
    }

    // Step 3: How to define function whose name is just the symbol minus -
    def -(discount: Double): Double = {
      totalCost - discount
    }

    // Step 6: How to define function whose name is just the symbols +++
    def +++(taxAmount: Double): Double = {
      totalCost + taxAmount
    }

  }



  println("Step 1: How to create and instantiate a class")
  val donutCostCalculator = new DonutCostCalculator()

  //How to call a function from an instantiated class
  println("\nStep 2: How to call a function from an instantiated class")
  println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")

  //How to call function whose name is just a symbol
  println("\nStep 4: How to call function whose name is just the symbol -")
  println(s"Calling function - = ${donutCostCalculator.-(10.5)}")

  //How to call a function using the operator style notation
  println("\nStep 5: How to call a function using the operator style notation")
  println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")






}
