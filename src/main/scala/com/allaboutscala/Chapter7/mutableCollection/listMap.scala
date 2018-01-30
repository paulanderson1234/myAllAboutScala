package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.ListMap

/**
  * Created by paul on 25/01/18.
  */
object listMap extends App {

  //Note - a ListMap is a collection of key and value pairs where the keys are backed by a List data structure.

  //How to initialize a ListMap with 3 elements
  println("\nStep 1: How to initialize a ListMap with 3 elements")
  val listMap1: ListMap[String, String] = ListMap("PD" -> "Plain Donut", "SD" ->"Strawberry Donut", "CD" -> "Chocolate Donut")
  println(s"Elements of listMap1 = $listMap1")

  //How to initialize ListMap using key -> value notation
  println("\nStep 2: How to initialize ListMap using key -> value notation")
  val listMap2: ListMap[String, String] = ListMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of listMap1 = $listMap2")

  //How to access elements of ListMap by specific key
  println("\nStep 3: How to access elements of ListMap by specific key")
  println(s"Element by key VD = ${listMap2("VD")}")
  println(s"Element by key GD = ${listMap2("GD")}")

  //How to add elements to ListMap using +=
  println("\nStep 4: How to add elements to ListMap using +")
  listMap1 += ("KD" -> "Krispy Kreme Donut")
  println(s"Element of listMap1 = $listMap1")

  //How to add elements from a ListMap to an existing ListMap using ++=
  println("\nStep 5: How to add elements from a ListMap to an existing ListMap using ++=")
  listMap1 ++= listMap2
  println(s"Element of listMap1 = $listMap1")

  //How to remove key and its value from ListMap using -=
  println("\nStep 6: How to remove key and its value from ListMap using -=")
  listMap1 -= ("CD")
  println(s"ListMap without the key CD and its value = $listMap1")

  //How to initialize an empty ListMap
  println("\nStep 7: How to initialize an empty ListMap")
  val emptyListMap: ListMap[String, String] = ListMap.empty[String,String]
  println(s"Empty ListMap of type String = $emptyListMap")


}
