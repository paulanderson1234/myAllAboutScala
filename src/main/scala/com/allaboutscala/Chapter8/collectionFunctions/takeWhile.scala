package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object takeWhile extends App {

  /* Note - The takeWhile method takes a predicate function and will use it to return a new collection consisting of elements which match the predicate function

  The takeWhile method is a member of IterableLike trait
  */

  //How to initialize a List of donuts
  println("Step 1: How to initialize a List of donuts")
  val donuts: Seq[String] = List("Plain Donut", "Strawberry Donut", "Glazed Donut", "Peanut Donut")
  val donutsWithP: Seq[String] = List("Peanut Donut", "Pineapple Donut", "Pringle Donut", "Pasta Donut")
  println(s"Elements of donuts = $donuts")
  println(s"Elements of donutsWithP = $donutsWithP")


  //How to take elements from the List using the takeWhile function
  //Note - only returns result if First Char is "P" - will not return Peanut Donut from collection
  println("\nStep 2: How to take elements from the List using the takeWhile function")
  println("Note - takeWhile returns elements as long as the predicate you supply returns true")
  println(s"Take Elements of donuts which start with letter P until preicate returns false = ${donuts.takeWhile(_.charAt(0) == 'P')}")
  println(s"Take Elements of donutsWithP which start with letter P - all true = ${donutsWithP.takeWhile(_.charAt(0) == 'P')}")

  //How to declare a predicate function to be passed-through to the takeWhile function
  println("\nStep 3: How to declare a predicate function to be passed-through to the takeWhile function")
  val takeDonutPredicate: (String) => Boolean = (donutName) => donutName.charAt(0) == 'P'
  val takeDonutPredicateWithP: (String) => Boolean = (donutNameContainP) => donutNameContainP.charAt(0) == 'P'
  println(s"Value function takeDonutPredicate = $takeDonutPredicate")
  println(s"Value function takeDonutPredicateContainsP = $takeDonutPredicateWithP")


  //How to take elements using the predicate function from Step 3
  println("\nStep 4: How to take elements using the predicate function from Step 3")
  println(s"Take elements which satisfy predicate for first element only using function from Step 3 = ${donuts.takeWhile(takeDonutPredicate)}")
  println(s"Take elements which satisfy predicate for all elements using function from Step 3 = ${donutsWithP.takeWhile(takeDonutPredicateWithP)}")

}
