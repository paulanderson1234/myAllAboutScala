package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 30/01/18.
  */
object isEmpty extends App {

  /* Note - The isEmpty method will check whether a given collection is empty and will return either true or false.

  The isEmpty method is a member of the Traversable trait

  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to find out if a sequence is empty using isEmpty function
  println("\nStep 2: How to find out if a sequence is empty using isEmpty function")
  println(s"Is donuts sequence empty = ${donuts.isEmpty}")

  //How to create an empty sequence
  println("\nStep 3: How to create an empty sequence")
  val donuts2: Seq[String] = Seq.empty[String]
  println(s"Elements of donuts2 = $donuts2")

  //How to find out if a sequence is empty using isEmpty function
  println("\nStep 4: How to find out if a sequence is empty using isEmpty function")
  println(s"Is donuts2 sequence empty = ${donuts2.isEmpty}")

}
