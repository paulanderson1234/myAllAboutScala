package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object fold extends App {

  /* Note - The fold method takes an associative binary operator function as parameter and will use it to collapse elements from the collection

  The fold method allows you to also specify an initial value.

  The fold method is a member of the TraversableOnce trait

   */

  //How to initialize a sequence of donut prices
  println("Step 1: How to initialize a sequence of donut prices")
  val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Donut prices = $prices")

  //How to sum all the donut prices using fold function
  println("\nStep 2: How to sum all the donut prices using fold function")
  println("Note - passing into fold method initial Double of 0.0")
  val sum = prices.fold(0.0)(_ + _)
  println(s"Sum = $sum")

  //How to initialize a Sequence of donuts
  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts1 = $donuts")

  //How to create a String of all donuts using fold function
  println("\nStep 4: How to create a String of all donuts using fold function")
  println(s"All donuts = ${donuts.fold("")((acc, s) => acc + s + " Donut ")}")

  //How to declare a value function to create the donut string
  println("\nStep 5: How to declare a value function to create the donut string")
  val concatDonuts: (String, String) => String = (s1, s2) => s1 + s2 + " Donut "
  println(s"Value function concatDonuts = $concatDonuts")

  //How to create a String of all donuts using value function from Step 5 and fold function
  println("\nStep 6: How to create a String of all donuts using value function from Step 5 and fold function")
  println(s"All donuts = ${donuts.fold("")(concatDonuts)}")

}
