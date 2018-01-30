package com.allaboutscala.Chapter6.immutableCollection

/**
  * Created by paul on 23/01/18.
  */
object set extends App {

  //How to initialize a Set with 3 elements
  println("Step 1: How to initialize a Set with 3 elements")
  val set1: Set[String] = Set("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of set1 = $set1")

  //How to check specific elements exists in Set
  println("\nStep 2: How to check specific elements exists in Set - returns true")
  println(s"Element Plain Donut = ${set1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${set1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${set1("Chocolate Donut")}")

  //How to check specific elements not exist in Set
  println("\nStep 2b: How to check specific elements do not exist in Set - returns false")
  println(s"Element Colourful Donut = ${set1("Colourful Donut")}")

  //How to add elements in Set using +
  println("\nStep 3: How to add elements in Set using +")
  println("Note - We only have one Vanilla Donut element as Set only allows distinct values")
  val set2: Set[String] = set1 + "Vanilla Donut" + "Vanilla Donut"
  println(s"Adding elements to Set using + = $set2")

  //How to add two Sets together using ++

  //Note - no order on output adding Vanilla as first element and Glazed Donut as last element in set
  println("\nStep 4: How to add two Sets together using ++")
  val set3: Set[String] = set1 ++ Set[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two Sets together using ++ = $set3")

  //How to remove element from Set using -
  println("\nStep 5: How to remove element from Set using -")
  val set4: Set[String] = set1 - "Plain Donut"
  println(s"Set without Plain Donut element = $set4")

  //How to find the intersection between two Sets using &
  println("\nStep 6: How to find the intersection between two Sets using &")
  println("Note - this is the common element found in both sets specified")
  val set5: Set[String] = Set("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of set1 and set5 = ${set1 & set5}")

  //How to find the difference between two Sets using &~
  println("\nStep 7: How to find the difference between two Sets using &~")
  println("Note - this is all elements found in set 1 but not in set 5")
  println(s"Difference between set1 and set5 = ${set1 &~ set5}")

  //How to find the difference between two Sets using &~
  println("\nStep 7b: How to find the difference between two Sets using &~")
  println("Note - this is all elements found in set 5 but not in set 1")
  println(s"Difference between set1 and set5 = ${set5 &~ set1}")

  // How to initialize an empty Set
  println("\nStep 8: How to initialize an empty Set")
  val emptySet: Set[String] = Set.empty[String]
  println(s"Empty Set = $emptySet")

}
