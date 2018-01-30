package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object drop extends App {

  /* Note - The drop method takes an integer parameter N and will return a new collection that does not contain the first N elements.

  The drop method is a member of the IterableLike trait
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to drop the first element using drop function - SEQUENCE
  println("\nStep 2: How to drop the first element using drop function")
  println(s"Drop the first element in the sequence = ${donuts.drop(1)}")

  //How to drop the first two elements using the drop function - SEQUENCE
  //Note - drops (n) elements from a sequence, list or set
  println("\nStep 3: How to drop the first two elements using the drop function")
  println(s"Drop the first and second elements in the sequence = ${donuts.drop(2)}")

  //How to drop the first two elements using the drop function - SET
  println("\nStep 4: How to drop the first two elements using the drop function from Set")
  val donutBasket1: Set[String] = Set("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Current set before dropping = $donutBasket1")
  println(s"Drop the first and second elements in the Set = ${donutBasket1.drop(2)}")

  //How to drop the first two elements using the drop function - LIST
  println("\nStep 5: How to drop the first two elements using the drop function from List")
  val list1: List[String] = List("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Current list before dropping = $list1")
  println(s"Drop the first and second elements in the List = ${list1.drop(2)}")

  //How to drop the last three elements using the dropright function - LIST
  println("\nStep 5: How to drop the first two elements using the drop function from List")
  val list2: List[String] = List("A","B","C","D","E","F","G")
  println(s"Current list before dropping = $list2")
  println(s"Drop the last 3 elements in the List = ${list2.dropRight(3)}")

}