package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object size extends App {

  /* Note - The size method calculates the number of elements in a collection and return its size

  The size method is a member of TraversableOnce trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut", "Plain Donut", "Plain Donut 2")
  println(s"Elements of donuts = $donuts")

  //How to count the number of elements in the sequence using size function
  println("\nStep 2: How to count the number of elements in the sequence using size function")
  println(s"Size of donuts sequence = ${donuts.size}")

  //How to use the count function
  println("\nStep 3: How to use the count function")
  println(s"Number of times element Plain Donut specifically appears in donuts sequence = ${donuts.count(_ == "Plain Donut")}")
  println(s"Number of times elements containing Plain Donut found in donuts sequence = ${donuts.count(_ contains "Plain Donut")}")

}
