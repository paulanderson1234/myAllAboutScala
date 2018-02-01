package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object tail extends App {

  /* Note - The tail method returns a collection consisting of all elements except the first one

  The tail method is a member of TraversableLike trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to return all elements in the sequence except the head using the tail function
  println("\nStep 2: How to return all elements in the sequence except the head using the tail function")
  println(s"Elements of donuts excluding the head = ${donuts.tail}")

  //How to access the last element of the donut sequence by using the last function
  println("\nStep 3: How to access the last element of the donut sequence by using the last function")
  println(s"Last element of donut sequence = ${donuts.last}")

  //How to access the first element of the donut sequence by using the head function
  println("\nStep 4: How to access the first element of the donut sequence by using the head function")
  println(s"First element of donut sequence = ${donuts.head}")

  //How to return specific elements in the sequence that is not the tail or head
  println("\nStep 5: How to return Strawberry elements in the sequence - not tail, head or last")
  val strawberry = donuts.find(_ == "Strawberry Donut").getOrElse("Strawberry Donut was not found!")
  println(s"Elements of donuts using find = $strawberry")
  val strawberryIndex = donuts(1)
  println(s"Element selection by index 1 = $strawberryIndex")

}
