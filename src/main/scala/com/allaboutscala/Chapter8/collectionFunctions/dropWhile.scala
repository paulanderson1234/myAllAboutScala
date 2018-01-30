package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object dropWhile extends App {

  /* Note - ethod takes a predicate function parameter that will be used to drop all the elements in a collection which satisfies the predicate function. It will then return a new collection with elements that matched the predicate function

  The dropWhile method is a member of the IterableLike trait.
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to drop elements from the sequence using the dropWhile function
  println("\nStep 2: How to drop elements from the sequence using the dropWhile function")
  println(s"Drop donut elements whose name starts with letter P = ${donuts.dropWhile(_.charAt(0) == 'P')}")

  //How to declare a predicate function to be passed-through to the dropWhile function
  println("\nStep 3: How to declare a predicate function to be passed-through to the dropWhile function")
  val dropElementsPredicate: (String) => Boolean = (donutName) => donutName.charAt(0) == 'P'
  println(s"Value function dropElementsPredicate = $dropElementsPredicate")

  //How to drop elements using the predicate function from Step 3
  println("\nStep 4: How to drop elements using the predicate function from Step 3")
  println(s"Drop elements using function from Step 3 = ${donuts.dropWhile(dropElementsPredicate)}")






}
