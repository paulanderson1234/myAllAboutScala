package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 30/01/18.
  */
object min extends App {

  /* Note - The min method will iterate through all the elements in the collection and return the smallest element

  The min method is a member of the TraversableOnce trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to find the minimum element in the sequence using the min function
  //Note - donut sequence is of type String, the min function is using the natural order of type String.
  println("\nStep 2: How to find the minimum element in the sequence using the min function")
  println(s"Min element in the donuts sequence = ${donuts.min}")

  //How to initialize a Sequence of donut prices
  println("\nStep 3: How to initialize a Sequence of donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
  println(s"Elements of prices = $prices")

  //How to find the minimum element in the sequence using the min function
  //Note - prices Sequence is of type double, the min function is using the natural ordering of type Double
  println("\nStep 4: How to find the minimum element in the sequence using the min function")
  println(s"Min element in the donut prices sequence = ${prices.min}")

}
