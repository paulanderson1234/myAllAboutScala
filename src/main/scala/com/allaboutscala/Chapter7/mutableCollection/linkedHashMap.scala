package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.LinkedHashMap

/**
  * Created by paul on 25/01/18.
  */
object linkedHashMap extends App {

  /**Note - a LinkedHashMap is a collection of key and value pairs which are stored internally using Hash Table data structure. But iterating through the elements is done in order**/

  //How to initialize a LinkedHashMap with 3 elements
  println("\nStep 1: How to initialize a LinkedHashMap with 3 elements")
  val linkedHashMap1: LinkedHashMap[String, String] = LinkedHashMap("PD" -> "Plain Donut", "SD" ->"Strawberry Donut", "CD" -> "Chocolate Donut")
  println(s"Elements of linkedHashMap1 = $linkedHashMap1")

  //How to initialize a LinkedHashMap using key -> value notation
  println("\nStep 2: How to initialize a LinkedHashMap using key -> value notation")
  val linkedHashMap2: LinkedHashMap[String, String] = LinkedHashMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"LinkedHashMap1 = $linkedHashMap2")

  //How to access elements of LinkedHashMap by specific key
  println("\nStep 3: How to access elements of LinkedHashMap by specific key")
  println(s"Element by key VD = ${linkedHashMap2("VD")}")
  println(s"Element by key GD = ${linkedHashMap2("GD")}")

  //How to add elements to LinkedHashMap using +=
  println("\nStep 4: How to add elements to LinkedHashMap using +=")
  linkedHashMap1 += ("KD" -> "Krispy Kreme Donut")
  println(s"Elements of linkedHashMap1 = $linkedHashMap1")

  //How to add elements from a LinkedHashMap to an existing LinkedHashMap using ++=
  println("\nStep 5: How to add elements from a LinkedHashMap to an existing LinkedHashMap using ++=")
  linkedHashMap1 ++= linkedHashMap2
  println(s"Elements of linkedHashMap1 = $linkedHashMap1")

  //How to remove key and its value from LinkedHashMap using -=
  println("\nStep 6: How to remove key and its value from LinkedHashMap using -=")
  linkedHashMap1 -= ("CD")
  println(s"LinkedHashMap without the key CD and its value = $linkedHashMap1")

  //How to initialize an empty LinkedHashMap
  println("\nStep 7: How to initialize an empty LinkedHashMap")
  val emptyLinkedHashMap: LinkedHashMap[String, String] = LinkedHashMap.empty[String,String]
  println(s"Empty LinkedHashMap of type String = $emptyLinkedHashMap")

}
