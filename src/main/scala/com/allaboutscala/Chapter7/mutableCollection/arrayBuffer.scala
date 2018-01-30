package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.ArrayBuffer

/**
  * Created by paul on 25/01/18.
  */
object arrayBuffer extends App {

  //Note - an ArrayBuffer is a mutable data structure which allows you to access and modify elements at specific index.

  //How to initialize an ArrayBuffer with 3 elements
  println("Step 1: How to initialize an ArrayBuffer with 3 elements")
  val arrayBuffer1: ArrayBuffer[String] = ArrayBuffer("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")

  //How to access elements of an ArrayBuffer at specific index
  println("\nStep 2: How to access elements of an ArrayBuffer at specific index")
  println(s"Element at index 0 = ${arrayBuffer1(0)}")
  println(s"Element at index 1 = ${arrayBuffer1(1)}")
  println(s"Element at index 2 = ${arrayBuffer1(2)}")

  //How to add elements to an ArrayBuffer using +=
  println("\nStep 3: How to add elements to an ArrayBuffer using +=")
  arrayBuffer1 += "Vanilla Donut"
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")
  // NOTE: arrayBuffer1 is mutable and hence we were able to add a new element to it

  //How to add elements from a List to an ArrayBuffer using ++=
  println("\nStep 4: How to add elements from a List to an ArrayBuffer using ++=")
  arrayBuffer1 ++= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")

  //How to remove elements from an ArrayBuffer
  println("\nStep 5: How to remove elements from an ArrayBuffer")
  arrayBuffer1 -= "Plain Donut"
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")

  //How to remove elements of a List from ArrayBuffer using --=
  println("\nStep 6: How to remove elements of a List from ArrayBuffer using --=")
  arrayBuffer1 --= List[String]("Glazed Donut", "Krispy creme")
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")

  //How to initialize an empty ArrayBuffer
  println("\nStep 7: How to initialize an empty ArrayBuffer")
  val emptyArrayBuffer: ArrayBuffer[String] = ArrayBuffer.empty[String]
  println(s"Empty array buffer = $emptyArrayBuffer")




}
