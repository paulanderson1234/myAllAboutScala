package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object take extends App {

  /* Note - The take method takes an integer N as parameter and will use it to return a new collection consisting of the first N elements.

  The take method is a member of IterableLike trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to take elements from the sequence using the take function
  /*Note - If you pass in an integer parameter N to the take method where N is larger than the size of the collection,
           the take method will return all the elements in the collection
  */
  println("\nStep 2: How to take elements from the sequence using the take function")
  println("Note - returns the first N elements from the collection")

  println(s"Take the first donut element in the sequence = ${donuts.take(1)}")
  println(s"Take the first and second donut elements in the sequence = ${donuts.take(2)}")
  println(s"Take the first, second and third donut elements in the sequence = ${donuts.take(3)}")
  println(s"Take the first, second and third donut elements in the sequence where N > collection size = ${donuts.take(5)}")

}
