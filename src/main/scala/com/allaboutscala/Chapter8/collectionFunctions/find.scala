package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object find extends App {

  /* Note - The find method takes a predicate function as parameter and uses it to find the first element in the collection which matches the predicate. It returns an Option and as such it may return a None for the case where it does not match any elements in the collection with the predicate function.

  The find method is a member of the TraversableLike trait.
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to find a particular element in the sequence using the find function
  //Note - find method returns Option of type String
  println("\nStep 2: How to find a particular element in the sequence using the find function")
  val plainDonut: Option[String] = donuts.find(donutName => donutName == "Plain Donut")
  println(s"Find Plain Donut = ${plainDonut.get}")

  //How to find element Vanilla Donut which does not exist in the sequence using the find function
  //Note - returns NoSuchElementException due to using Option with just a get request
  println("\nStep 3: How to find element Vanilla Donut which does not exist in the sequence using the find function")
  println("Note - NoSuchElementException: None.get returned for Option get request which is not found")
  //val vanillaDonut: String = donuts.find(_ == "Vanilla Donut").get
  //println(s"Find Vanilla Donuts = $vanillaDonut")

  //How to find element Vanilla Donut using the find function and getOrElse
  println("\nStep 4: How to find element Vanilla Donut using the find function and getOrElse")
  println("Note - use getOrElse to avoid exceptions!")
  val vanillaDonut2: String = donuts.find(_ == "Vanilla Donut").getOrElse("Vanilla Donut was not found!")
  println(s"Find Vanilla Donuts = $vanillaDonut2")

}
