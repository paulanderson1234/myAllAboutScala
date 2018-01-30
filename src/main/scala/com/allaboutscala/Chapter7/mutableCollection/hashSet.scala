package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.HashSet

/**
  * Created by paul on 25/01/18.
  */
object hashSet extends App {

  /** Note - a Set is a data structure which allows you to store elements which are not repeatable. A Set also does not guarantee the ordering of elements.

 a Mutable HashSet is the concrete implementation of the mutable Set trait. **/

  //How to initialize a HashSet with 3 elements
  println("\nStep 1: How to initialize a HashSet with 3 elements")
  val hashSet1: HashSet[String] = HashSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of hashSet1 = $hashSet1")

  //How to check specific elements in HashSet
  println("\nStep 2: How to check specific elements in HashSet - returns true")
  println(s"Element Plain Donut = ${hashSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${hashSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${hashSet1("Chocolate Donut")}")

  //How to check specific elements NOT in HashSet
  println("\nStep 2b: How to check specific elements NOT in HashSet - returns false")
  println(s"Element Colourful Donut = ${hashSet1("Colourful Donut")}")

  //How to add elements to HashSet using +=
  println("\nStep 3: How to add elements to HashSet using +=")
  hashSet1 += "Vanilla Donut"
  println(s"Elements of hashSet1 after adding Vanilla Donut element = $hashSet1")

  //How to add two HashSets together using ++=
  //Note - Vanilla added to set in Step 3
  println("\nStep 4: How to add two HashSets together using ++=")
  println("Note - only distinct elements will be placed in set - only one instance of Vanilla present")
  hashSet1 ++= HashSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of hashSet1 after adding another HashSet = $hashSet1")

  //How to remove element from HashSet using -=
  println("\nStep 5: How to remove element from HashSet using -=")
  hashSet1 -= "Plain Donut"
  println(s"HashSet without Plain Donut element = $hashSet1")

  //How to find the intersection between two HashSets using &
  //Note - HashSet1 is Set(Strawberry Donut, Glazed Donut, Vanilla Donut, Chocolate Donut) after steps 3,4 and 5
  println("\nStep 6: How to find the intersection between two HashSet using &")
  println("Note - this is the common element found in both sets specified")
  val hashSet2: HashSet[String] = HashSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of hashSet1 and hashSet2 = ${hashSet1 & hashSet2}")

  //How to find the difference between two HashSets using &~
  //Note - HashSet1 is (Strawberry Donut, Glazed Donut, Vanilla Donut, Chocolate Donut) after steps 3,4 and 5
  //Note - HashSet2 is ("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println("\nStep 7: How to find the difference between two HashSets using &~")
  println("Note - this is all elements found in set 1 but not in set 2")
  println(s"Difference of hashSet1 and hashSet2 = ${hashSet1 &~ hashSet2}")

  //How to find the difference between two HashSets using &~
  //Note - HashSet1 is (Strawberry Donut, Glazed Donut, Vanilla Donut, Chocolate Donut) after steps 3,4 and 5
  //Note - HashSet2 is ("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println("\nStep 7b: How to find the difference between two HashSets using &~")
  println("Note - this is all elements found in set 2 but not in set 1")
  println(s"Difference of hashSet2 and hashSet1 = ${hashSet2 &~ hashSet1}")

  //How to initialize an empty HashSet
  println("\nStep 8: How to initialize an empty HashSet")
  val emptyHashSet: HashSet[String] = HashSet.empty[String]
  println(s"Empty HashSet = $emptyHashSet")

}
