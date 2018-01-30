package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object diff extends App {

  /* Note - The diff method takes another Set as its parameter and uses it to find the elements that are different from the current Set compared to another Set

  The diff method is a member of the SetLike trait.
  */

  //How to initialize a Set containing 3 donuts
  println("Step 1: How to initialize a Set containing 3 donuts")
  val donutBasket1: Set[String] = Set("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donutBasket1 = $donutBasket1")

  //How to initialize a Set containing 2 donuts
  println("\nStep 2: How to initialize a Set containing 2 donuts")
  val donutBasket2: Set[String] = Set("Glazed Donut", "Vanilla Donut")
  println(s"Elements of donutBasket2 = $donutBasket2")

  //How to find the difference between two Sets using the diff function
  //Note - elements that are distinct and found in Set 1 but not Set 2
  println("\nStep 3: How to find the difference between two Sets using the diff function")
  val diffDonutBasket1From2: Set[String] = donutBasket1 diff donutBasket2
  println(s"Elements of diffDonutBasket1From2 = $diffDonutBasket1From2")

  //How to find the difference between two Sets using the diff function
  //Note - elements that are distinct and found in Set 2 but not Set 1
  println("\nStep 4: How to find the difference between two Sets using the diff function")
  val diffDonutBasket2From1: Set[String] = donutBasket2 diff donutBasket1
  println(s"Elements of diff DonutBasket2From1 = $diffDonutBasket2From1")

  //How to find the difference between two Sets using the --
  println("\nStep 5: How to find the difference between two Sets using the --")
  println(s"Difference between donutBasket1 and donutBasket2 = ${donutBasket1 -- donutBasket2}")
  println(s"Difference between donutBasket2 and donutBasket1 = ${donutBasket2 -- donutBasket1}")

}
