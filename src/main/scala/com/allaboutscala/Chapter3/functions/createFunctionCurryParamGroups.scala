package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 15/01/18.
  */
object createFunctionCurryParamGroups extends App {

  //How to define function with curried parameter groups
  println("Step 1: How to define function with curried parameter groups")
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  //How to call a function with curried parameter groups
  println("\nStep 2: How to call a function with curried parameter groups")
  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")

  //How to create a partial function from a function with curried parameter groups
  println("\nStep 3: How to create a partial function from a function with curried parameter groups")
  val totalCostForGlazedDonuts = totalCost("Glazed Donut") _

  //How to call a partial function
  println("\nStep 4: How to call a partial function")
  println(s"\nTotal cost for Glazed Donuts ${totalCostForGlazedDonuts(10)(0.1)}")

}
