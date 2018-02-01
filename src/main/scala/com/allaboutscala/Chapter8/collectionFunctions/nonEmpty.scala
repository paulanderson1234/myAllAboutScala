package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object nonEmpty extends App {

  /* Note - The nonEmpty method will test whether a given collection is not empty and will return either true or false

  The nonEmpty method is a member of the TraversableOnce trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to check if a sequence is not empty using nonEmpty function
  println("\nStep 2: How to check if a sequence is not empty using nonEmpty function - returns true")
  println(s"Is donuts sequence NOT empty = ${donuts.nonEmpty}")

  //How to create an empty sequence
  println("\nStep 3: How to create an empty sequence")
  val emptyDonuts: Seq[String] = Seq.empty[String]
  println(s"Elements of emptyDonuts = $emptyDonuts")

  //How to find out if sequence is empty using nonEmpty function
  println("\nStep 4: How to find out if sequence is empty using nonEmpty function - returns false")
  println(s"Is emptyDonuts sequence empty = ${emptyDonuts.nonEmpty}")

}
