package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 01/02/18.
  */
object union extends App {

  /* Note - The union method takes a Set as parameter and will merge its elements with the elements from the current Set

  The union method is a member of SetLike trait

  */

  //How to initialize a Set of donuts
  println("Step 1: How to initialize a Set of donuts")
  val donuts1: Set[String] = Set("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts1 = $donuts1")

  //How to initialize another Set of donuts
  println("\nStep 2: How to initialize another Set of donuts")
  val donuts2: Set[String] = Set("Plain Donut", "Chocolate Donut", "Vanilla Donut")
  println(s"Elements of donuts2 = $donuts2")

  //How to merge two Sets using union function
  println("\nStep 3: How to merge two Sets using union function")
  println(s"Union of Sets donuts1 and donuts2 = ${donuts1 union donuts2}")
  println(s"Union of Sets donuts2 and donuts1 = ${donuts2 union donuts1}")

  //How to merge two Sets using ++ function
  println("\nStep 4: How to merge two Sets using ++ function")
  println(s"Union of Sets donuts1 and donuts2 = ${donuts1 ++ donuts2}")
  println(s"Union of Sets donuts2 and donuts1 = ${donuts2 ++ donuts1}")

}
