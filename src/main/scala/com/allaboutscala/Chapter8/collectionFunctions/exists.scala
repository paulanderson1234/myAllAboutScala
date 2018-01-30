package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object exists extends App {

  /* Note - The exists method takes a predicate function and will use it to find the first element in the collection which matches the predicate.

  The exists method is a member of the IterableLike trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to check if a particular element exists in the sequence using the exists function
  println("\nStep 2: How to check if a particular element exists in the sequence using the exists function - returns true")
  val doesPlainDonutExists: Boolean = donuts.exists(donutName => donutName == "Plain Donut")
  println(s"Does Plain Donut exists = $doesPlainDonutExists")

  val doesPlainDonutExistsFalse: Boolean = donuts.exists(donutName => donutName == "Colour Donut")
  println(s"Does Colour Donut exists = $doesPlainDonutExistsFalse")

  //How to declare a predicate value function for the exists function
  println("\nStep 3: How to declare a predicate value function for the exists function")
  val plainDonutPredicate: (String) => Boolean = (donutName) => donutName == "Plain Donut"
  println(s"Value function plainDonutPredicate = $plainDonutPredicate")

  //How to call the predicate function from Step 3 - true
  println("\nStep 4: How to call the predicate function from Step 3")
  println(s"Boolean value of function plainDonutPredicate = ${donuts.exists(plainDonutPredicate)}")

  //How to drop call the predicate function from Step 3 - false
  println("\nStep 4b: How to call the false predicate function - not existing in Sequence")
  val colourDonutPredicateFalse: (String) => Boolean = (donutName) => donutName == "Colour Donut"
  println(s"Boolean value of function plainDonutPredicateFalse = ${donuts.exists(colourDonutPredicateFalse)}")

  //How to declare a predicate def function for the exists function
  println("\nStep 5: How to declare a predicate def function for the exists function")
  def plainDonutPredicateFunction(donutName: String): Boolean = donutName == "Plain Donut"
  def colourDonutPredicateFunction(donutName: String): Boolean = donutName == "Colour Donut"


  //How to find element Plain Donut using the exists function and passing through the predicate def function from Step 5
  println("\nStep 6: How to find element Plain Donut using the exists function and passing through the predicate function from Step 5")
  println(s"Does plain Donut exists = ${donuts.exists(plainDonutPredicateFunction(_))}")
  println(s"Does colour Donut exists = ${donuts.exists(colourDonutPredicateFunction(_))}")


}
