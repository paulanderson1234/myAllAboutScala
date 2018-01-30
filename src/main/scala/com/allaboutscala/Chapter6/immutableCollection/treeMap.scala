package com.allaboutscala.Chapter6.immutableCollection

//Note - requires the use of import to use TreeMap
import scala.collection.immutable.TreeMap

/**
  * Created by paul on 23/01/18.
  */
object treeMap extends App {

  //How to initialize a TreeMap with 3 elements using Tuples key and value

  //Note - The TreeMap is sorted by default using the natural order the its key eg CD > PD > SD
  println("Step 1: How to initialize a TreeMap with 3 elements using Tuples key and value")
  val treeMap1: TreeMap[String, String] = TreeMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of treeMap1 = $treeMap1")

  //How to initialize TreeMap using key -> value notation
  println("\nStep 2: How to initialize TreeMap using key -> value notation")
  val treeMap2: TreeMap[String, String] = TreeMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of treeMap2 = $treeMap2")

  //How to access elements of TreeMap by specific key
  println("\nStep 3: How to access elements of TreeMap by specific key")
  println(s"Element by key VD = ${treeMap2("VD")}")
  println(s"Element by key GD = ${treeMap2("GD")}")

  //How to add elements to TreeMap using +
  println("\nStep 4: How to add elements to TreeMap using +")
  val treeMap3: TreeMap[String, String] = treeMap1 + ("KD" -> "Krispy Kreme Donut")
  println(s"Elements in treeMap3 = $treeMap3")

  //How to add two TreeMaps together using ++
  println("\nStep 5: How to add two TreeMaps together using ++")
  val treeMap4: TreeMap[String, String] = treeMap1 ++ treeMap2
  println(s"Elements in treeMap4 = $treeMap4")

  //How to remove key and its value from TreeMap using -
  println("\nStep 6: How to remove key and its value from TreeMap using -")
  val treeMap5: TreeMap[String, String] = treeMap4 - ("CD")
  println(s"TreeMap without the key CD and its value = $treeMap5")

  //How to change ordering of TreeMap to descending alphabet
  println("\nStep 7: How to change ordering of TreeMap to descending alphabet")
  object AlphabetOrdering extends Ordering[String] {
    def compare(key1:String, key2:String) = key2.compareTo(key1)
  }
  val treeMap6: TreeMap[String, String] = TreeMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))(AlphabetOrdering)
  println(s"Elements of treeMap6 in descending order = $treeMap6")

  //How to initialize an empty TreeMap
  println("\nStep 8: How to initialize an empty TreeMap")
  val emptyTreeMap: TreeMap[String,String] = TreeMap.empty[String,String]
  println(s"Empty TreeMap = $emptyTreeMap")

}
