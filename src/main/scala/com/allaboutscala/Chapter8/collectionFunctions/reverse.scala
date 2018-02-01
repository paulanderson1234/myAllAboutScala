package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object reverse extends App {

  /* Note - The reverse method will create a new sequence with the elements in reversed order

  The reverse method is a member of SeqLike trait
  */

  //How to initialize a sequence of donut prices
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to get the elements of the sequence in reverse using the reverse method
  println("\nStep 2: How to get the elements of the sequence in reverse using the reverse method")
  println(s"Elements of donuts in reversed order = ${donuts.reverse}")

  //How to access each reversed element using reverse and foreach methods
  println("\nStep 3: How to access each reversed element using reverse and foreach methods")
  donuts.reverse.foreach(donut => println(s"donut = $donut"))

}
