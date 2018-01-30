package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 30/01/18.
  */
object head extends App {

  /* Note - The head method will return the first element in the collection

  The head method is a member of the IterableLike trait.

  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to access the first element of the donut sequence
  println("\nStep 2: How to access the first element of the donut sequence")
  println(s"First element of donut sequence = ${donuts(0)}")

  //How to access the first element of the donut sequence using the head method
  println("\nStep 3: How to access the first element of the donut sequence using the head method")
  println(s"First element of donut sequence using head method = ${donuts.head}")

  //How to create an empty sequence
  println("\nStep 4: How to create an empty sequence")
  val donuts2: Seq[String] = Seq.empty[String]
  println(s"Elements of donuts2 = $donuts2")

  //How to access the first element of the donut sequence using the headOption function
  println("\nStep 5: How to access the first element of the donut sequence using the headOption function")
  println(s"First element of empty sequence = ${donuts2.headOption.getOrElse("No donut was found!")}")

  val donuts3 = donuts2 :+ "New head"

  println(s"First element post addition to new sequence = ${donuts3.headOption.getOrElse("No donut was found!")}")


}
