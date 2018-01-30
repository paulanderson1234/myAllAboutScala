package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object collect extends App {

  /* Note - The collect method takes a Partial Function as its parameter and applies it to all the elements in the collection to create a new collection which satisfies the Partial Function

  The collect method is a member of the TraversableLike trait.

  */

  //How to initialize a Sequence which contains donut names and prices
  println("Step 1: How to initialize a Sequence which contains donut names and prices")
  val donutNamesandPrices: Seq[Any] = Seq("Plain Donut", 1.5, "Strawberry Donut", 2.0, "Glazed Donut", 2.5)
  println(s"Elements of donutNamesAndPrices = $donutNamesandPrices")

  //How to use collect function to cherry pick all the donut names
  //Note - use of partial function to extract the String from the Sequence
  println("\nStep 2: How to use collect function to cherry pick all the donut names")
  val donutNames: Seq[String] = donutNamesandPrices.collect{ case name: String => name }
  println(s"Elements of donutNames = $donutNames")

  //How to use collect function to cherry pick all the donut prices
  //Note - use of partial function to extract the Double from the Sequence
  println("\nStep 2b: How to use collect function to cherry pick all the donut prices")
  val donutPrice: Seq[Double] = donutNamesandPrices.collect{ case price: Double => price }
  println(s"Elements of donutPrice = $donutPrice")

}
