package com.allaboutscala.Chapter3.functions

import scala.util.Random

/**
  * Created by paul on 15/01/18.
  */
object createHigherOrderFunctionByName extends App {

  //How to define a List with Tuple3 elements
  println("Step 1: How to define a List with Tuple3 elements")
  val listOrders = List(("Glazed Donuts", 5, 2.50), ("Vanilla Donuts", 10, 3.50))

  //How to define a function to loop through each Tuple3 elements of the List and calculate total cost
  println("\nStep 2: How to define a function to loop through each Tuple3 of the List and calculate total cost")
  def placeOrder(orders: List[(String, Int, Double)])(exchangeRate: Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach {order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

  //How to call function with curried group parameter for List of Tuple3 elements
  println("\nStep 3: How to call function with curried group parameter for List of Tuple3 elements")
  //exchange rate = 0.5
  println(s"Total cost of order = £${placeOrder(listOrders)(0.5)}")

  //How to define a call-by-name function
  println("\nStep 4: How to define a call-by-name function")
  def placeOrderWithByNameParameter(orders: List[(String, Int, Double)])(exchangeRate: => Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach {order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

  //How to define a simple USD to GBP function
  println("\nStep 5: How to define a simple USD to GBP function")
  val randomExchangeRate = new Random(10)
  def usdToGbp: Double = {
    val rate = randomExchangeRate.nextDouble()
    println(s"Fetching USD to GBP exchange rate = $rate")
    rate
  }

  //How to call function with call-by-name parameter
  println("\nStep 6: How to call function with call-by-name parameter")
  println(s"Total cost of order = £${placeOrderWithByNameParameter(listOrders)(usdToGbp)}")


  println("\nStep 7: How to define a simple USD to GBP function using nextInt with upper value 5")
  val randomExchangeRate2 = new Random()
  def usdToGbp2: Int = {
    val rate = randomExchangeRate2.nextInt(5)
    println(s"Fetching USD to GBP exchange rate2 = $rate")
    rate
  }

  println("\nStep 8: How to call function with call-by-name parameter")
  println(s"Total cost of order = £${placeOrderWithByNameParameter(listOrders)(usdToGbp2)}")



}
