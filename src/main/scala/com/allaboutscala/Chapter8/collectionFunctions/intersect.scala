package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 30/01/18.
  */
object intersect extends App {

  /* Note - The intersect method will find the common elements between two Sets

  The intersect method is a member of the GenSetLike trait

  */

  //How to initialize a Set of donuts
  println("Step 1: How to initialize a Set of donuts")
  val donuts1: Set[String] = Set("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts1 = $donuts1")

  //How to initialize another Set of donuts
  println("\nStep 2: How to initialize another Set of donuts")
  val donuts2: Set[String] = Set("Plain Donut", "Chocolate Donut", "Vanilla Donut")
  println(s"Elements of donuts2 = $donuts2")

  //How to find the common elements between two Sets using intersect function
  println("\nStep 3: How to find the common elements between two Sets using intersect function")
  println(s"Common elements between donuts1 and donuts2 = ${donuts1 intersect donuts2}")
  println(s"Common elements between donuts2 and donuts1 = ${donuts2 intersect donuts1}")

  //How to find the common elements between two Sets using & function
  println("\nStep 4: How to find the common elements between two Sets using & function")
  println(s"Common elements between donuts1 & donuts2 = ${donuts1 & donuts2}")
  println(s"Common elements between donuts2 & donuts1 = ${donuts2 & donuts1}")

}
