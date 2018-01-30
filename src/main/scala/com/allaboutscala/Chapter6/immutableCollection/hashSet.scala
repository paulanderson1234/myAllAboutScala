package com.allaboutscala.Chapter6.immutableCollection

import scala.collection.immutable.HashSet

/**
  * Created by paul on 23/01/18.
  */
object hashSet extends App {

  //Note - HashSetwill use the elements HashCode as a key to allow for fast lookup of the elements value within the HashSet

  //How to initialize a HashSet with 3 elements
  println("Step 1: How to initialize a HashSet with 3 elements")
  val hashSet1: HashSet[String] = HashSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of hashSet1 = $hashSet1")

  //How to check specific elements in HashSet
  println("\nStep 2: How to check specific elements in HashSet - confirms true")
  println(s"Element Plain Donut = ${hashSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${hashSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${hashSet1("Chocolate Donut")}")

  //How to check specific elements are not in HashSet
  println("\nStep 2b: How to check specific elements are NOT in HashSet - confirms false")
  println(s"Element Colourful Donut = ${hashSet1("Colourful Donut")}")

  //How to add elements in HashSet using +
  println("\nStep 3: How to add elements in HashSet using +")
  val hashSet2: HashSet[String] = hashSet1 + "Vanilla Donut" + "Vanilla Donut"
  println(s"Adding elements to HashSet using + = $hashSet2")
  // NOTE: we only have one Vanilla Donut element and not two as HashSet is distinct

  //How to add two HashSets together using ++
  //Note - no order on output adding Vanilla as first element and Glazed Donut as last element in hashset
  println("\nStep 4: How to add two HashSets together using ++")
  val hashSet3: HashSet[String] = hashSet1 ++ HashSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two HashSets together using ++ = $hashSet3")

  //How to remove element in HashSet using -
  println("\nStep 5: How to remove element in HashSet using -")
  val hashSet4: HashSet[String] = hashSet1 - "Plain Donut"
  println(s"HashSet without Plain Donut element = $hashSet4")

  //How to find the intersection between two HashSets using &
  println("\nStep 6: How to find the intersection between two HashSets using &")
  println("Note - this is the common elements found in both hash sets specified")
  val hashSet5: HashSet[String] = HashSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of hashSet1 and hashSet5 = ${hashSet1 & hashSet5}")

  //How to find the difference between two HashSets using &~
  println("\nStep 7: How to find the difference between two HashSets using &~")
  println("Note - this is all elements found in set 1 but not in set 5")
  println(s"Difference of hashSet1 and hashSet5 = ${hashSet1 &~ hashSet5}")

  //How to find the difference between two HashSets using &~
  println("\nStep 7b: How to find the difference between two HashSets using &~")
  println("Note - this is all elements found in set 5 but not in set 1")
  println(s"Difference of hashSet1 and hashSet5 = ${hashSet5 &~ hashSet1}")

  //How to initialize an empty HashSet
  println("\nStep 8: How to initialize an empty HashSet")
  val emptyHashSet: HashSet[String] = HashSet.empty[String]
  println(s"Empty HashSet = $emptyHashSet")

}
