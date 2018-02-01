package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object takeRight extends App {

  /* Note - The takeRight method takes an integer N as parameter and will use it to return a new collection consisting of the last N elements

  The takeRight method is a member of IterableLike trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to take the last N elements using the takeRight function
  /*Note - If you pass in an integer parameter N to the takeRight method where N is larger than the size of the collection,
           the takeRight method will return all the elements in the collection
  */

  println("\nStep 2: How to take the last N elements using the takeRight function")
  println(s"Take the last donut element in the sequence = ${donuts.takeRight(1)}")
  println(s"Take the last two donut elements in the sequence = ${donuts.takeRight(2)}")
  println(s"Take the last three donut elements in the sequence = ${donuts.takeRight(3)}")
  println(s"Take the last N elements in the sequence where N > collection size = ${donuts.takeRight(5)}")

}
