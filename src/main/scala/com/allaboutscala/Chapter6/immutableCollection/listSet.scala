package com.allaboutscala.Chapter6.immutableCollection

import scala.collection.immutable.ListSet

/**
  * Created by paul on 22/01/18.
  */
object listSet extends App {

  //How to initialize an immutable ListSet with 3 elements
  println("Step 1: How to initialize an immutable ListSet with 3 elements")
  val listSet1: ListSet[String] = ListSet("Plain DonutZ","Strawberry DonutZ","fredy", "Chocolate DonutZ")
  println(s"Elements of listSet1 = $listSet1")

  //How to check elements of immutable ListSet
  println("\nStep 2: How to check elements of immutable ListSet")
  println(s"Element Plain Donut = ${listSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${listSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${listSet1("Chocolate Donut")}")

  //element not in the list to return false
  println("\nStep 2b: How to check elements of immutable ListSet which returns false")
  println(s"Element Chocolated Donut = ${listSet1("Chocolated Donut")}")

  //print elements of listSet1
  println("\nPrinting individual elements for listSet1")
  listSet1.foreach((element:String) => println(element+" "))

  println("\nPrinting first element (letter) from each string held in listSet1")
  listSet1.foreach((element:String) => println(element(0)))

  println("\nPrinting first string from each listSet1")
  println(s"First string from list set: ${listSet1.head}")

  println("\nPrinting last string from each listSet1")
  println(s"Last string from list set: ${listSet1.last}")

  //Dropwhile from listSet
  val xxx = listSet1.dropWhile(p => p.contains("Z"))
  println("\nDrops elements from list while list contains a Z")
  println(s"Remaining elements in the listSet having dropped any previous ones containing Z: $xxx")

  //Drop from listSet
  val yyy = listSet1.drop(1)
  println("\nDrops first elements from list")
  println(s"Remaining elements in the listSet having dropped first element: $yyy")

  //Drop from listSet
  val zzz = listSet1.drop(3)
  println("\nDrops first 3 elements from list")
  println(s"Remaining elements in the listSet having dropped first three element: $zzz")


    //How to add elements of immutable ListSet using +
  println("\nStep 3: How to add elements of immutable ListSet using +")
  val listSet2: ListSet[String] = listSet1 + "Vanilla Donut"
  println(s"Adding element Vanilla to ListSet using + = $listSet2")

  //How to add two ListSet together using ++
  println("\nStep 4: How to add two ListSet together using ++")
  val listSet3: ListSet[String] = listSet1 ++ ListSet("Glazed Donut")
  println(s"Add two lists together using ++ = $listSet3")

  //How to remove element from the ListSet using -
  println("\nStep 5: How to remove element from the ListSet using -")
  val listSet4: ListSet[String] = listSet1 - ("Plain Donut")

  println(s"ListSet with the element Plain Donut = $listSet1")
  println(s"ListSet without the element Plain Donut = $listSet4")

  //How to initialize an empty ListSet
  println("\nStep 6: How to initialize an empty ListSet")
  val emptyListSet: ListSet[String] = ListSet.empty[String]
  println(s"Empty ListSet of type String = $emptyListSet")



}
