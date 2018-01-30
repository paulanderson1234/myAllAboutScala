package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 10/01/18.
  */
object createFunctionWithParams extends App {

  //How to define a funtion with parameters
  println("Step 1: How to define function with parameters")
  def calculateDonutCost(donutName: String, quantity: Int): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    // make some calculations ...
    2.50 * quantity
  }

  //How to call a function with parameters
  println("\nStep 2: How to call a function with parameters")
  val totalCost = calculateDonutCost("Glazed Donut", 5)
  println(s"Total cost of donuts = $totalCost")

  //How to add default values to function parameters - adding couponCode to parameter list with default NO CODE
  println("\nStep 3: How to add default values to function parameters")
  def calculateDonutCost(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity, couponCode = $couponCode")


    // make some calculations ...
    2.50 * quantity
  }

  //How to call a funtion with parameters that has default values
  println("\nStep 4: How to call a function with parameters that has default values")
  val totalCostWithDiscount = calculateDonutCost("Glazed Donut", 4, "COUPON_12345")
  println(s"Total cost of donuts with discount = $totalCostWithDiscount")

  val totalCostWithoutDiscount = calculateDonutCost("Glazed Donut", 4)
  println(s"Total cost of donuts with discount = $totalCostWithoutDiscount")

}
