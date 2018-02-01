package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 30/01/18.
  */
object max extends App {

  /* Note - The max method will iterate through all the elements in a collection and return the largest element

  The max method is a member of the TraversableOnce trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to find the maximum element in the sequence using the max function
  //donut elements are of type String, the max method is using the natural order of String
  println("\nStep 2: How to find the maximum element in the sequence using the max function")
  println(s"Max element in the donuts sequence = ${donuts.max}")

  //How to initialize donut prices
  println("\nStep 3: How to initialize donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
  println(s"Elements of prices = $prices")

  //How to find the maximum element in the sequence using the max function
  //donut prices elements are of type Double, the max method is using the natural order of type Double
  println("\nStep 4: How to find the maximum element in the sequence using the max function")
  println(s"Max element in the donut prices sequence = ${prices.max}")

}
