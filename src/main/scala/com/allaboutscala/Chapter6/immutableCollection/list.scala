package com.allaboutscala.Chapter6.immutableCollection

/**
  * Created by paul on 22/01/18.
  */
object list extends App {

  //How to initialize an immutable List with 3 elements
  println("Step 1: How to initialize an immutable List with 3 elements")
  val list1: List[String] = List("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of list1 = $list1")

  //How to access elements of immutable List at specific index
  println("\nStep 2: How to access elements of immutable List at specific index")
  println(s"Element at index 0 = ${list1(0)}")
  println(s"Element at index 1 = ${list1(1)}")
  println(s"Element at index 2 = ${list1(2)}")

  //How to append elements at the end of immutable List using :+
  println("\nStep 3: How to append elements at the end of immutable List using :+")
  val list2: List[String] = list1 :+ "Vanilla Donut"
  println(s"Append elements at the end using :+ = $list2")

  //list 2
  println(s"List2: Element at index 0 = ${list2(0)}")
  println(s"List2: Element at index 1 = ${list2(1)}")
  println(s"List2: Element at index 2 = ${list2(2)}")

  //added new element to list 2
  println(s"List2: Element at index 3 = ${list2(3)}")

  //How to prepend elements at the front of immutable List using +:
  println("\nStep 4: How to prepend elements at the front of immutable List using +:")
  val list3: List[String] = "Vanilla Donut" +: list1
  println(s"Prepend elements at the front using +: = $list3")

  //list 3
  println(s"List3: Element at index 0 = ${list3(0)}")
  println(s"List3: Element at index 1 = ${list3(1)}")
  println(s"List3: Element at index 2 = ${list3(2)}")
  println(s"List3: Element at index 3 = ${list3(3)}")

  //How to add two immutable lists together using ::

  println("\nStep 5: How to add two immutable lists together using ::")
  val list4: List[Any] = list1 :: list2
  println(s"Add two lists together using :: = $list4")

  //list 4
  println(s"List4: Element at index 0 = ${list4(0)}")
  println(s"List4: Element at index 1 = ${list4(1)}")
  println(s"List4: Element at index 2 = ${list4(2)}")
  println(s"List4: Element at index 3 = ${list4(3)}")
  println(s"List4: Element at index 4 = ${list4(4)}")

  //How to add two immutable Lists together using :::

  println("\nStep 6: How to add two immutable Lists together using :::")
  val list5: List[String] = list1 ::: list2
  println(s"Add two lists together using ::: = $list5")

  //list 5
  println(s"List5: Element at index 0 = ${list5(0)}")
  println(s"List5: Element at index 1 = ${list5(1)}")
  println(s"List5: Element at index 2 = ${list5(2)}")
  println(s"List5: Element at index 3 = ${list5(3)}")
  println(s"List5: Element at index 4 = ${list5(4)}")
  println(s"List5: Element at index 5 = ${list5(5)}")
  println(s"List5: Element at index 6 = ${list5(6)}")

  //How to initialize an empty immutable List
  println("\nStep 7: How to initialize an empty immutable List")
  val emptyList: List[String] = List.empty[String]
  println(s"Empty list = $emptyList")



}
