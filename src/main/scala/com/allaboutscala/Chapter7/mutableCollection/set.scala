package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.Set

/**
  * Created by paul on 25/01/18.
  */
object set extends App {

  /** Note - a Set is a data structure which allows you to store elements which are not repeatable. A Set also does not guarantee the ordering of elements **/

  //How to initialize a Set with 3 elements
  println("\nStep 1: How to initialize a Set with 3 elements")
  val set1: Set[String] = Set("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of set1 = $set1")

  //How to check specific elements in Set
  println("\nStep 2: How to check specific elements in Set - outputs true")
  println(s"Element Plain Donut = ${set1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${set1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${set1("Chocolate Donut")}")

  //How to check specific elements NOT in Set
  println("\nStep 2: How to check specific elements NOT in Set - outputs false")
  println(s"Element Colourful Donut = ${set1("Colourful Donut")}")

  //How to add elements to Set using +=
  println("\nStep 3: How to add elements to Set using +=")
  set1 += "Vanilla Donut"
  println(s"Elements of set1 after adding elements Vanilla Donut = $set1")

  //How to add all elements from another Set using ++=
  println("\nStep 4: How to add all elements from another Set using ++=")
  set1 ++= Set[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of set1 after adding second set = $set1")

  //How to remove element from Set using -=
  println("\nStep 5: How to remove element from Set using -=")
  set1 -= "Plain Donut"
  println(s"Elements of set1 without Plain Donut element = $set1")

  //How to find the intersection between two Sets using &
  //Note - steps 4 and 5 have added Vanilla, Glazed and removed Plain
  println("\nStep 6: How to find the intersection between two Sets using &")
  println("Note - this is the common element found in both sets specified")
  val set2: Set[String] = Set("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of set1 and set2 = ${set1 & set2}")

  //How to find the difference between two Sets using &~
  //Note - steps 4 and 5 have added Vanilla, Glazed and removed Plain leaving Strawberry and Chocolate in Set 1 that are not in Set 2
  println("\nStep 7: How to find the difference between two Sets using &~")
  println("Note - this is all elements found in set 1 but not in set 2")
  println(s"Difference of set1 and set2 = ${set1 &~ set2}")

  //How to find the difference between two Sets using &~
  //Note - steps 4 and 5 have added Vanilla, Glazed and removed Plain leaving Plain in Set 2 that is not longer in Set 1
  println("\nStep 7: How to find the difference between two Sets using &~")
  println("Note - this is all elements found in set 2 but not in set 1")
  println(s"Difference of set2 and set1 = ${set2 &~ set1}")

  //How to initialize an empty Se
  println("\nStep 8: How to initialize an empty Set")
  val emptySet: Set[String] = Set.empty[String]
  println(s"Empty Set = $emptySet")

}
