package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 01/02/18.
  */
object transpose extends App {

  /* Note - The transpose method will pair and overlay elements from another collections into a single collection

  The transpose method is a member of GenericTraversableTemplate trait

  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to initialize donut prices
  println("\nStep 2: How to initialize donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
  println(s"Elements of prices = $prices")

  //How to create a List of donuts and prices
  //Note - creates nested Lists
  println("\nStep 3: How to create a List of donuts and prices")
  val donutList = List(donuts, prices)
  println(s"Sequence of donuts and prices = $donutList")

  //How to pair each element from both donuts and prices Sequences using the transpose function
  println("\nStep 4: How to pair each element from both donuts and prices Sequences using the transpose function")
  println(s"Transposed list of donuts paired with their individual prices = ${donutList.transpose}")

}
