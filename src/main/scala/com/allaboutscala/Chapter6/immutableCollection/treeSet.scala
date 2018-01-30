package com.allaboutscala.Chapter6.immutableCollection


import scala.collection.immutable.TreeSet

/**
  * Created by paul on 23/01/18.
  */
object treeSet extends App {

  //How to initialize a TreeSet with 3 elements
  println("Step 1: How to initialize a TreeSet with 3 elements")
  println("Note that the output becomes ordered alphabetically")
  val treeSet1: TreeSet[String] = TreeSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of treeSet1 = $treeSet1")

  //How to check specific elements in TreeSet
  println("\nStep 2: How to check specific elements in TreeSet - returns true")
  println(s"Element Plain Donut = ${treeSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${treeSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${treeSet1("Chocolate Donut")}")

  //How to check specific elements are NOT in TreeSet
  println("\nStep 2: How to check specific elements are NOT in TreeSet - returns false")
  println(s"Element Colourful Donut = ${treeSet1("Colourful Donut")}")

  //How to add elements to TreeSet using +
  println("\nStep 3: How to add elements to TreeSet using +")
  println("NOTE: we only have one Vanilla Donut element and not two as sets are distinct")
  val treeSet2: TreeSet[String] = treeSet1 + "Vanilla Donut" + "Vanilla Donut"
  println(s"Adding elements to TreeSet using + = $treeSet2")
  // NOTE: we only have one Vanilla Donut element and not two as sets are distinct

  //How to add two TreeSets together using ++
  println("\nStep 4: How to add two TreeSets together using ++")
  println("Note that the combined output becomes ordered alphabetically")
  val treeSet3: TreeSet[String] = treeSet1 ++ TreeSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two TreeSets together using ++ = $treeSet3")

  //How to remove element in TreeSet using -
  println("\nStep 5: How to remove element in TreeSet using -")
  println("Note that the remaining output becomes ordered alphabetically")
  val treeSet4: TreeSet[String] = treeSet1 - "Plain Donut"
  println(s"TreeSet without Plain Donut element = $treeSet4")

  //How to find the intersection between two TreeSets using &
  println("\nStep 6: How to find the intersection between two TreeSets using &")
  println("Note - this is all elements found in both sets")
  val treeSet5: TreeSet[String] = TreeSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of treeSet1 and treeSet5 = ${treeSet1 & treeSet5}")

  //How to find the intersection between two TreeSets using &
  println("\nStep 6b: How to find the intersection between two TreeSets using &")
  println("Note - this is all elements found in both sets")
  val treeSet6: TreeSet[String] = TreeSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of treeSet6 and treeSet1 = ${treeSet6 & treeSet1}")

  //How to find the difference between two TreeSets using &~
  println("\nStep 7: How to find the difference between two TreeSets using &~")
  println("Note - this is all elements found in set 1 but not in set 5")
  println(s"Difference of treeSet1 and treeSet5 = ${treeSet1 &~ treeSet5}")

  //How to find the difference between two TreeSets using &~
  println("\nStep 7b: How to find the difference between two TreeSets using &~")
  println("Note - this is all elements found in set 5 but not in set 1")
  println(s"Difference of treeSet1 and treeSet5 = ${treeSet5 &~ treeSet1}")

  //How to change ordering of TreeSet to descending alphabet
  println("\nStep 8: How to change ordering of TreeSet to descending alphabet")
  object AlphabetOrdering extends Ordering[String] {
    def compare(element1:String, element2:String) = element2.compareTo(element1)
  }
  val treeSet7: TreeSet[String] = TreeSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(AlphabetOrdering)
  println(s"Elements of treeSet7 = $treeSet7")

  //How to initialize an empty TreeSet
  println("\nStep 9: How to initialize an empty TreeSet")
  val emptyTreeSet: TreeSet[String] = TreeSet.empty[String]
  println(s"Empty TreeSet = $emptyTreeSet")

}
