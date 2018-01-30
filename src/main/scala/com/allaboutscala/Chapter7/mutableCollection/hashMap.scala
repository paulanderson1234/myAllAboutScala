package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.HashMap

/**
  * Created by paul on 25/01/18.
  */
object hashMap extends App {

  //Note - a HashMap is a collection of key and value pairs which are stored internally using a Hash Table data structure.

  //How to initialize a HashMap with 3 elements
  println("\nStep 1: How to initialize a HashMap with 3 elements")
  val hashMap1: HashMap[String, String] = HashMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of hashMap1 = $hashMap1")

  //How to initialize HashMap using key -> value notation
  println("\nStep 2: How to initialize HashMap using key -> value notation")
  val hashMap2: HashMap[String, String] = HashMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of hashMap2 = $hashMap2")

  //How to access elements of HashMap by specific key
  println("\nStep 3: How to access elements of HashMap by specific key")
  println(s"Element by key VD = ${hashMap2("VD")}")
  println(s"Element by key GD = ${hashMap2("GD")}")

  //How to add elements to HashMap using +=
  //Note - seems to be added in no particular ordering
  println("\nStep 4: How to add elements to HashMap using +=")
  hashMap1 += ("KD" -> "Krispy Kreme Donut")
  println(s"Element in hashMap1 = $hashMap1")

  //How to add elements from a HashMap to an existing HashMap using ++=
  //Note - seems to be added in no particular ordering
  println("\nStep 5: How to add elements from a HashMap to an existing HashMap using ++=")
  hashMap1 ++= hashMap2
  println(s"Elements in hashMap1 = $hashMap1")

  //How to remove key and its value from HashMap using -=
  println("\nStep 6: How to remove key and its value from HashMap using -=")
  hashMap1 -= "CD"
  println(s"HashMap without the key CD and its value = $hashMap1")

  //How to initialize an empty HashMap
  println("\nStep 7: How to initialize an empty HashMap")
  val emptyMap: HashMap[String,String] = HashMap.empty[String,String]
  println(s"Empty HashMap = $emptyMap")

}
