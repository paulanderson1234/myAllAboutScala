package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object reverseIterator extends App {

  /*Note - The reverseIterator method returns an iterator which you can use to traverse the elements of a collection in reversed order.

  The reverseIterator method is a member of SeqLike trait
  */

  //How to initialize a sequence of donut prices
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to print all elements in reversed order using reverseIterator function
  println("\nStep 2: How to print all elements in reversed order using reverseIterator function")
  println(s"Elements of donuts in reversed order = ${donuts.reverseIterator.toList}")

  //How to iterate through elements using foreach method
  println("\nStep 3: How to iterate through elements using foreach method")
  val reverseIterator: Iterator[String] = donuts.reverseIterator
  reverseIterator.foreach(donut => println(s"donut = $donut"))


}
