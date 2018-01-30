package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.ListBuffer

/**
  * Created by paul on 25/01/18.
  */
object listBuffer extends App {

  //Note - a ListBuffer is resizable similar to an ArrayBuffer, except that it uses a Linked List as its internal data structure.

  //How to initialize a ListBuffer with 3 elements
  println("Step 1: How to initialize a ListBuffer with 3 elements")
  val listBuffer1: ListBuffer[String] = ListBuffer("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of listBuffer1 = $listBuffer1")

  //How to access elements at specific index in a ListBuffer
  println("\nStep 2: How to access elements at specific index in a ListBuffer")
  println(s"Element at index 0 = ${listBuffer1(0)}")
  println(s"Element at index 1 = ${listBuffer1(1)}")
  println(s"Element at index 2 = ${listBuffer1(2)}")

  //How to add elements to a ListBuffer using +=
  println("\nStep 3: How to add elements to a ListBuffer using +=")
  listBuffer1 += "Vanilla Donut"
  println(s"Elements of listBuffer1 = $listBuffer1")

  //How to add elements from a List to a ListBuffer using ++=
  println("\nStep 4: How to add elements from a List to a ListBuffer using ++=")
  listBuffer1 ++= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of listBuffer1 = $listBuffer1")

  //How to remove elements from a ListBuffer
  println("\nStep 5: How to remove elements from a ListBuffer")
  listBuffer1 -= "Plain Donut"
  println(s"Elements of listBuffer1 = $listBuffer1")

  //How to remove elements from a List to a ListBuffer using --=
  println("\nStep 6: How to remove elements from a List to a ListBuffer using --=")
  listBuffer1 --= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of listBuffer1 = $listBuffer1")

  //How to initialize an empty ListBuffer
  println("\nStep 7: How to initialize an empty ListBuffer")
  val emptyListBuffer: ListBuffer[String] = ListBuffer.empty[String]
  println(s"Empty list buffer = $emptyListBuffer")

}
