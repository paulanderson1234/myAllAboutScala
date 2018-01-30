package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.LinkedHashSet

/**
  * Created by paul on 26/01/18.
  */
object linkedHashSet extends App {

  /* a LinkedHashSet will produce elements in order they were inserted to the LinkedHashSet. As mentioned in the previous tutorials, TreeSet and SortedSet allow you to drive the order of the elements. TreeSet and SortedSet should not be confused with LinkedHashSet where the order of elements will be according to the insertion order of the elements.*/

  //How to initialize a LinkedHashSet with 3 elements
  println("\nStep 1: How to initialize a LinkedHashSet with 3 elements")
  val linkedHashSet1: LinkedHashSet[String] = LinkedHashSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of linkedHashSet1 = $linkedHashSet1")

  //How to check specific elements in LinkedHashSet
  println("\nStep 2: How to check specific elements in LinkedHashSet - returns true")
  println(s"Element Plain Donut = ${linkedHashSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${linkedHashSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${linkedHashSet1("Chocolate Donut")}")

  //How to check specific elements NOT in LinkedHashSet
  println("\nStep 2: How to check specific elements NOT in LinkedHashSet - returns false")
  println(s"Element Colour Donut = ${linkedHashSet1("Colour Donut")}")

  //How to add elements to LinkedHashSet using +=
  println("\nStep 3: How to add elements to LinkedHashSet using +=")
  linkedHashSet1 += "Vanilla Donut"
  println(s"Elements of linkedHashSet1 after adding Vanilla Donut element = $linkedHashSet1")

  //How to add two LinkedHashSets together using ++=
  //Note - Vanilla already appending in Step 3 to linkedHashSet and being appended here again - only one instance of element will be returned
  println("\nStep 4: How to add two LinkedHashSets together using ++=")
  println("Note - appends only distinct elements to the Set")
  linkedHashSet1 ++= LinkedHashSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Elements of linkedHashSet1 after adding another HashSet = $linkedHashSet1")

  //How to remove element from LinkedHashSet using -=
  println("\nStep 5: How to remove element from LinkedHashSet using -=")
  linkedHashSet1 -= "Plain Donut"
  println(s"Set without Plain Donut element = $linkedHashSet1")

  //How to find the intersection between two LinkedHashSets using &
  //Note - linkedHashSet1 after steps 4 and 5 = Set(Strawberry Donut, Chocolate Donut, Vanilla Donut, Glazed Donut)
  //Note - common elements in both sets will therefore be Vanilla and Glazed
  println("\nStep 6: How to find the intersection between two LinkedHashSets using &")
  println("Note - this is the common element found in both sets specified")
  val linkedHashSet2: LinkedHashSet[String] = LinkedHashSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of linkedHashSet1 and linkedHashSet2 = ${linkedHashSet1 & linkedHashSet2}")

  //How to find the difference between two LinkedHashSets using &~
  //Note - linkedHashSet1 after steps 4 and 5 = Set(Strawberry Donut, Chocolate Donut, Vanilla Donut, Glazed Donut)
  //Note - linkedHashSet2 at step 6 = (Vanilla Donut, Glazed Donut, Plain Donut)
  println("\nStep 7: How to find the difference between two LinkedHashSets using &~")
  println("Note - this is all elements found in set 1 but not in set 2")
  println(s"Difference of linkedHashSet1 and linkedHashSet2 = ${linkedHashSet1 &~ linkedHashSet2}")

  //How to find the difference between two LinkedHashSets using &~
  //Note - linkedHashSet1 after steps 4 and 5 = Set(Strawberry Donut, Chocolate Donut, Vanilla Donut, Glazed Donut)
  //Note - linkedHashSet2 at step 6 = (Vanilla Donut, Glazed Donut, Plain Donut)
  println("\nStep 7: How to find the difference between two LinkedHashSets using &~")
  println("Note - this is all elements found in set 2 but not in set 1")
  println(s"Difference of linkedHashSet2 and linkedHashSet1 = ${linkedHashSet2 &~ linkedHashSet1}")

  //How to initialize an empty LinkedHashSet
  println("\nStep 8: How to initialize an empty LinkedHashSet")
  val emptyLinkedHashSet: LinkedHashSet[String] = LinkedHashSet.empty[String]
  println(s"Empty LinkedHashSet = $emptyLinkedHashSet")

}
