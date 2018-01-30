package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object foldRight extends App {

  /* Note - The foldRight method takes an associative binary operator function as parameter and will use it to collapse elements from the collection

  The order for traversing the elements in the collection is from right to left and hence the name foldRight

  The foldRight method allows you to also specify an initial value

  Prefer using foldLeft as opposed to foldRight since foldLeft is fundamental in recursive function and will help you prevent stack-overflow exceptions.

  The foldRight method is a member of the TraversableOnce trait

   */

  //How to initialize a sequence of donut prices
  println("Step 1: How to initialize a sequence of donut prices")
  val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Donut prices = $prices")

  //How to sum all the donut prices using foldRight function
  println("\nStep 2: How to sum all the donut prices using foldRight function")
  println("Note - passing into foldRight method initial Double of 0.0")
  val sum = prices.foldRight(0.0)(_ + _)
  println(s"Sum = $sum")

  //How to initialize a Sequence of donuts
  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts = $donuts")

  //How to create a String of all donuts using foldRight function
  //Note - the foldRight implementation is different from foldLeft which was a + b + " Donut "
  println("\nStep 4: How to create a String of all donuts using foldRight function")
  println(s"All donuts = ${donuts.foldRight("")((a, b) => a + " Donut " + b)}")

  //How to declare a value function to create the donut string
  //Note - the foldRight implementation is different from foldLeft which was a + b + " Donut "
  println("\nStep 5: How to declare a value function to create the donut string")
  val concatDonuts: (String, String) => String = (a, b) => a + " Donut " + b
  println(s"Value function concatDonuts = $concatDonuts")

  //How to create a String of all donuts using value function from Step 5 and foldRight function
  println("\nStep 6: How to create a String of all donuts using value function from Step 5 and foldRight function")
  println(s"All donuts = ${donuts.foldRight("")(concatDonuts)}")

}
