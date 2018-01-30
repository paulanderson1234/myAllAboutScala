package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 30/01/18.
  */
object last extends App {

  /* Note - The last method will return the last element in a collection.

  The last method is a member of the Traversable trait

  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to access the last element of the donut sequence by index
  println("\nStep 2: How to access the last element of the donut sequence by index")
  println(s"Last element of donut sequence = ${donuts(donuts.size - 1)}")

  //How to access the last element of the donut sequence by using the last function
  println("\nStep 3: How to access the last element of the donut sequence by using the last function")
  println(s"Last element of donut sequence = ${donuts.last}")

  //How to create an empty sequence
  println("\nStep 4: How to create an empty sequence")
  val donuts2: Seq[String] = Seq.empty[String]
  println(s"Elements of donuts2 = $donuts2")

  //How to access the last element of the donut sequence using the lastOption function
  println("\nStep 5: How to access the last element of the donut sequence using the lastOption function")
  println(s"Last element of empty sequence = ${donuts2.lastOption.getOrElse("No donut was found!")}")

  val donuts3 = donuts2 :+ "New head"

  println(s"Last option element of populated sequence = ${donuts3.lastOption.getOrElse("No donut was found!")}")

}
