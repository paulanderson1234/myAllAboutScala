package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 15/01/18.
  */
object createHigherOrderFunction extends App {

  //Review how to define function with curried parameter groups
  println("Step 1: Review how to define function with curried parameter groups")
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  //The totalCost() function has a discount parameter which could be a potential candidate to pass-through a function to apply the discount logic.

  //How to define a higher order function which takes another function as parameter
  //A Higher Order Function is a function which takes another function as its parameters.
  println("\nStep 2: How to define a higher order function which takes another function as parameter")
  //f: has input type Double as parameter and returns a type of Double - Double => Double
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }

  //How to call higher order function and pass an anonymous function as parameter
  println("\nStep 3: How to call higher order function and pass an anonymous function as parameter")
  val totalCostOf5Donuts = totalCostWithDiscountFunctionParameter("Glazed Donut")(5){totalCost =>
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with anonymous discount function = $totalCostOf5Donuts")

  //How to define and pass a function to a higher order function
  println("\nStep 4: How to define and pass a function to a higher order function")
  def applyDiscount(totalCost: Double): Double = {
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }

  println(s"Total cost of 5 Glazed Donuts with discount function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")

  //separation on differing lines if required to make easier reading
  println(s"Total cost of 5 Glazed Donuts with discount function = " +
    s"${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")

}
