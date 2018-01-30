package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 10/01/18.
  */
object optionFunctionParams extends App {

  //How to define an Option in a function parameter
  println("Step 1: How to define an Option in a function parameter")
  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1 // Let's simulate a 10% discount

        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case None => 2.50 * quantity
    }
  }

  //How to call a function which has an Option parameter
  println("\nStep 2: How to call a function which has an Option parameter")
  println(s"""Total cost = ${calculateDonutCost("Glazed Donut", 5, None)}""")

  //How to assign a default value to an Option parameter
  println("\nStep 3: How to assign a default value to an Option parameter")
  def calculateDonutCostWithDefaultOptionValue(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match{
      case Some(coupon) =>
        val discount = 0.1 // Let's simulate a 10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case _ => 2.50 * quantity
    }
  }

  //How to call a function whose Option parameter has a default value
  println("\nStep 4: How to call a function which has an Option parameter with a default value")
  println(s"""Total cost = ${calculateDonutCostWithDefaultOptionValue("Glazed Donut", 5)}""")
  println(s"""Total cost with discount = ${calculateDonutCostWithDefaultOptionValue("Glazed Donut", 5, Some("COUPON_1234"))}""")

  //Tips
  println(s"\nTip 1: Use the map function to extract a valid Option value")
  val favoriteDonut: Option[String] = Some("Glazed Donut")
  favoriteDonut.map(d => println(s"Favorite donut = $d"))

  val leastFavoriteDonut: Option[String] = Some("Plain Donut")
  leastFavoriteDonut.map(d => println(s"Least Favorite donut = $d"))

  val otherDonut: Option[String] = None
  otherDonut.map(d => println(s"No output as nothing supplied = $d"))


}
