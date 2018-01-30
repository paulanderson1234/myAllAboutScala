package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.SortedSet

/**
  * Created by paul on 25/01/18.
  */
object sortedSet extends App {

  /* Note - a Set is a data structure which allows you to store elements which are not repeatable. While a Set also does not guarantee the ordering of elements, a SortedSet will produce elements in a given order.

  a SortedSet is a trait which provides the Set semantics but also allows you to drive the ordering of the elements within the SortedSet */

  //How to initialize a SortedSet with 3 elements
  println("\nStep 1: How to initialize a SortedSet with 3 elements")
  val sortedSet1: SortedSet[String] = SortedSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of sortedSet1 = $sortedSet1")

  //How to check specific elements in SortedSet
  println("\nStep 2: How to check specific elements in SortedSet - returns true")
  println(s"Element Plain Donut = ${sortedSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${sortedSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${sortedSet1("Chocolate Donut")}")

  //How to check specific elements NOT in SortedSet
  println("\nStep 2b: How to check specific elements NOT in SortedSet - returns false")
  println(s"Element Colourful Donut = ${sortedSet1("Colourful Donut")}")

  //How to add elements to SortedSet using +=
  println("\nStep 3: How to add elements to SortedSet using +=")
  sortedSet1 += "Vanilla Donut"
  println(s"Elements of sortedSet1 after adding Vanilla Donut element = $sortedSet1")

  //How to add two SortedSets together using ++=
  println("\nStep 4: How to add two SortedSets together using ++=")
  println("Note - only adds distinct elements as Vanilla appears once even though already added in Step 3")
  sortedSet1 ++= SortedSet[String]("Vanilla Donut", "Glazed Donut", "Glazed Donut")
  println(s"Elements of sortedSet1 after adding second SortedSet = $sortedSet1")

  //How to remove element from SortedSet using -=
  println("\nStep 5: How to remove element from SortedSet using -=")
  sortedSet1 -= "Plain Donut"
  println(s"sortedSet1 without Plain Donut element = $sortedSet1")

  //How to find the intersection between two SortedSets using &
  // SortedSet1 after Step 5 - Chocolate Donut, Glazed Donut, Strawberry Donut, Vanilla Donut
  println("\nStep 6: How to find the intersection between two SortedSets using &")
  println("Note - this is the common element found in both sets specified")
  val sortedSet2: SortedSet[String] = SortedSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of sortedSet1 and sortedSet5 = ${sortedSet1 & sortedSet2}")

  //How to find the difference between two SortedSets using &~
  // SortedSet1 after Step 5 - Chocolate Donut, Glazed Donut, Strawberry Donut, Vanilla Donut
  // SortedSet2 after Step 6 - Vanilla Donut, Glazed Donut, Plain Donut
  println("\nStep 7: How to find the difference between two SortedSets using &~")
  println("Note - this is all elements found in set 1 but not in set 2")
  println(s"Difference of sortedSet1 and sortedSet2 = ${sortedSet1 &~ sortedSet2}")

  //How to find the difference between two SortedSets using &~
  // SortedSet1 after Step 5 - Chocolate Donut, Glazed Donut, Strawberry Donut, Vanilla Donut
  // SortedSet2 after Step 6 - Vanilla Donut, Glazed Donut, Plain Donut
  println("\nStep 7b: How to find the difference between two SortedSets using &~")
  println("Note - this is all elements found in set 2 but not in set 1")
  println(s"Difference of sortedSet2 and sortedSet1 = ${sortedSet2 &~ sortedSet1}")

  //How to change ordering to descending alphabet in SortedSet
  println("\nStep 8: How to change ordering to descending alphabet in SortedSet")
  object DescendingAlphabetOrdering extends Ordering[String] {
    def compare(element1:String, element2:String) = element2.compareTo(element1)
  }
  val sortedSet6: SortedSet[String] = SortedSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(DescendingAlphabetOrdering)
  println(s"Elements of sortedSet6 = $sortedSet6")

  //How to initialize an empty SortedSet
  println("\nStep 9: How to initialize an empty SortedSet")
  val emptySortedSet: SortedSet[String] = SortedSet.empty[String]
  println(s"Empty SortedSet = $emptySortedSet")



}
