package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.TreeSet

/**
  * Created by paul on 26/01/18.
  */
object treeSet extends App {

    /*a SortedSet is a trait which provides the Set semantics but also allows you to drive the ordering of the elements within the SortedSet.

    A TreeSet is a class implementation of the SortedSet trait and it uses a Red Black Tree as its underlying data structure.*/

  //How to initialize a TreeSet with 3 elements
  println("\nStep 1: How to initialize a TreeSet with 3 elements")
  val treeSet1: TreeSet[String] = TreeSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of treeSet1 = $treeSet1")

  //How to check specific elements in TreeSet
  println("\nStep 2: How to check specific elements in TreeSet - returns true")
  println(s"Element Plain Donut = ${treeSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${treeSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${treeSet1("Chocolate Donut")}")

  //How to check specific elements NOT in TreeSet
  println("\nStep 2b: How to check specific elements NOT in TreeSet  - returns false")
  println(s"Element Colour Donut = ${treeSet1("Colour Donut")}")

  //How to add elements to TreeSet using +=
  println("\nStep 3: How to add elements to TreeSet using +=")
  treeSet1 += "Vanilla Donut"
  println(s"Elements of treeSet1 after adding Vanilla Donut element = $treeSet1")

  //How to add two TreeSets together using ++=
  println("\nStep 4: How to add two TreeSets together using ++=")
  println("Note - only distingt elements are added to the set ")
  treeSet1 ++= TreeSet[String]("Vanilla Donut", "Glazed Donut", "Vanilla Donut")
  println(s"Elements of treeSet1 after adding second set = $treeSet1")

  //How to remove element from TreeSet using -=
  println("\nStep 5: How to remove element from TreeSet using -=")
  treeSet1 -= "Plain Donut"
  println(s"treeSet1 without Plain Donut element = $treeSet1")

  //How to find the intersection between two TreeSets using &
  //Note - TreeSet1 after Step 5 = (Chocolate Donut, Glazed Donut, Strawberry Donut, Vanilla Donut)
  println("\nStep 6: How to find the intersection between two TreeSets using &")
  println("Note - this is the common element found in both sets specified")
  val treeSet2: TreeSet[String] = TreeSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of treeSet1 and treeSet2 = ${treeSet1 & treeSet2}")

  //How to find the difference between two TreeSets using &~
  //Note - TreeSet1 after Step 5 = (Chocolate Donut, Glazed Donut, Strawberry Donut, Vanilla Donut)
  //Note - TreeSet2 after Step 6 = (Vanilla Donut, Glazed Donut, Plain Donut)
  println("\nStep 7: How to find the difference between two TreeSets using &~")
  println("Note - this is all elements found in set 1 but not in set 2")
  println(s"Difference of treeSet1 and treeSet2 = ${treeSet1 &~ treeSet2}")

  //How to change ordering to descending alphabet in TreeSet
  println("\nStep 8: How to change ordering to descending alphabet in TreeSet")
  object DescendingAlphabetOrdering extends Ordering[String] {
    def compare(element1:String, element2:String) = element2.compareTo(element1)
  }
  val treeSet3: TreeSet[String] = TreeSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(DescendingAlphabetOrdering)
  println(s"Elements of treeSet3 = $treeSet3")

  //How to initialize an empty TreeSet
  println("\nStep 9: How to initialize an empty TreeSet")
  val emptyTreeSet: TreeSet[String] = TreeSet.empty[String]
  println(s"Empty TreeSet = $emptyTreeSet")

}
