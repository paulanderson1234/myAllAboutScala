package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object slice extends App {

  /* Note - The slice method takes a start and end index and will use them to return a new collection with elements that are within the start and end index range

  The slice method is a member of IterableLike trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to take a section from the sequence using the slice function
  println("\nStep 2: How to take a section from the sequence using the slice function")
  println(s"Take elements from the sequence from index 0 to 1 = ${donuts.slice(0,1)}")
  println(s"Take elements from the sequence from index 0 to 2 = ${donuts.slice(0,2)}")
  println(s"Take elements from the sequence from index 0 to 3 = ${donuts.slice(0,3)}")

  //Slice function where the index is out of range
  println("\nStep 3: Slice function where the index is out of range")
  println("Note - no index out of bounds exceptions using slice function - where available elements < index requested")
  println(s"Take elements from the sequence from index 0 to 4 = ${donuts.slice(0,4)}")

}
