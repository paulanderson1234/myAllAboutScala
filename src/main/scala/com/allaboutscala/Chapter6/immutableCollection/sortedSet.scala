package com.allaboutscala.Chapter6.immutableCollection

import scala.collection.immutable.SortedSet

/**
  * Created by paul on 23/01/18.
  */
object sortedSet extends App {

  //Note - SortedSet is a trait - can store unique elements and provides ordering on the elements

  //How to initialize a SortedSet with 3 elements
  println("Step 1: How to initialize a SortedSet with 3 elements")
  val sortedSet1: SortedSet[String] = SortedSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of sortedSet1 = $sortedSet1")

  //How to check specific elements in SortedSet
  println("\nStep 2: How to check specific elements in SortedSet - returns true")
  println(s"Element Plain Donut = ${sortedSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${sortedSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${sortedSet1("Chocolate Donut")}")

  //How to check specific elements NOT in SortedSet
  println("\nStep 2: How to check specific elements NOT in SortedSet - returns false")
  println(s"Element Colourful Donut = ${sortedSet1("Colourful Donut")}")

  //How to add elements to SortedSet using +
  println("\nStep 3: How to add elements to SortedSet using +")
  println("Note - only adds distinct entries to the list")
  val sortedSet2: SortedSet[String] = sortedSet1 + "Vanilla Donut" + "Vanilla Donut"
  println(s"Adding elements to SortedSet using + = $sortedSet2")
  // NOTE: we only have one Vanilla Donut element and not two as SortedSet is distinct

  //How to add two SortedSets together using ++
  println("\nStep 4: How to add two SortedSets together using ++")
  println("Note - adds 2 sets together and orders in alphabetical order")
  val sortedSet3: SortedSet[String] = sortedSet1 ++ SortedSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two SortedSets together using ++ = $sortedSet3")

  //How to remove element in SortedSet using -
  println("\nStep 5: How to remove element in SortedSet using -")
  println("Note - orders remaining elements in alphabetical order")
  val sortedSet4: SortedSet[String] = sortedSet1 - "Plain Donut"
  println(s"SortedSet without Plain Donut element = $sortedSet4")

  //How to find the intersection between two SortedSets using &
  println("\nStep 6: How to find the intersection between two SortedSets using &")
  println("Note - finds common elements in both sets and returns in alphabetical order")
  val sortedSet5: SortedSet[String] = SortedSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of sortedSet1 and sortedSet5 = ${sortedSet1 & sortedSet5}")

  //How to find the difference between two SortedSets using &~
  println("\nStep 7: How to find the difference between two SortedSets using &~")
  println("Note - finds elements from Set1 that do not exist in Set5")
  println(s"Difference of sortedSet1 and sortedSet5 = ${sortedSet1 &~ sortedSet5}")

  //How to find the difference between two SortedSets using &~
  println("\nStep 7b: How to find the difference between two SortedSets using &~")
  println("Note - finds elements from Set5 that do not exist in Set1")
  println(s"Difference of sortedSet5 and sortedSet1 = ${sortedSet5 &~ sortedSet1}")

  //How to change ordering of SortedSet to descending alphabet
  println("\nStep 8: How to change ordering of SortedSet to descending alphabet")
  object AlphabetOrdering extends Ordering[String] {
    def compare(element1:String, element2:String) = element2.compareTo(element1)
  }
  val sortedSet6: SortedSet[String] = SortedSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(AlphabetOrdering)
  println(s"Elements of sortedSet6 = $sortedSet6")
  // NOTE: The elements are now printed in descending order first with Strawberry Donut, then Plain Donut and finally Chocolate Donut

  //How to initialize an empty SortedSet
  println("\nStep 9: How to initialize an empty SortedSet")
  val emptySortedSet: SortedSet[String] = SortedSet.empty[String]
  println(s"Empty SortedSet = $emptySortedSet")



}
