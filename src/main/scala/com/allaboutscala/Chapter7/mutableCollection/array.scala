package com.allaboutscala.Chapter7.mutableCollection

/**
  * Created by paul on 25/01/18.
  */
object array extends App {

  //Note - an Array is a mutable data structure of fixed length. It also allows you to access and modify elements at specific index

  //How to initialize a String Array with 3 elements
  println("Step 1: How to initialize a String Array with 3 elements")
  val array1: Array[String] = Array("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of array1 = ${array1.mkString(", ")}")

  //How to access elements at specific index in an Array
  println("\nStep 2: How to access elements at specific index in an Array")
  println(s"Element at index 0 = ${array1(0)}")
  println(s"Element at index 1 = ${array1(1)}")
  println(s"Element at index 2 = ${array1(2)}")

  //How to initialize an Array by specifying it's capacity
  println("\nStep 3: How to initialize an Array by specifying it's capacity")
  val array2: Array[String] = new Array(3)
  array2(0) = "Plain Donut"
  array2(1) = "Strawberry Donut"
  array2(2) = "Chocolate Donut"
  println(s"Elements of array2 = ${array2.mkString(", ")}")

  //How to create a 2D Array (2 dimension array)
  println("\nStep 4: How to create a 2D Array (2 dimension array)")
  val rows = 2
  val columns = 2
  val array3: Array[Array[String]] = Array.ofDim[String](rows,columns)
  array3(0)(0) = "Plain"
  array3(0)(1) = "Donut"
  array3(1)(0) = "Strawberry"
  array3(1)(1) = "Donut"
  println(s"Elements of 2 dimensional array = ${array3.deep.toList}")

  //How to create 3D Array (3 Dimension Array) using Array.ofDim() method
  println("\nStep 5: How to create 3D Array (3 Dimension Array) using Array.ofDim() method")
  val array4: Array[Array[String]] = Array.ofDim[String](3,3)
  println(s"Elements of 3 dimensional array = ${array4.deep.toList}")

  //How to create an Array using tabulate function
  println("\nStep 6: How to create an Array using tabulate function")
  val array5: Array[Int] = Array.tabulate(5)(_ + 1)
  println(s"Array of 5 columns = ${array5.toList}")

  //How to create dimensional Arrays using tabulate function
  println("\nStep 7: How to create dimensional Arrays using tabulate function")
  val row1 = 1
  val column3 = 3
  val arrayOfOneRowAndThreeColumns = Array.tabulate(row1, column3)( (row, column) => row + column )
  println(s"Array with 1 row and 3 columns = ${arrayOfOneRowAndThreeColumns.deep.toString}")

  val row2 = 2
  val arrayOfTwoRowsAndThreeColumns = Array.tabulate(row2, column3)( (row, column) => row + column )
  println(s"Array with 2 rows and 3 columns = ${arrayOfTwoRowsAndThreeColumns.deep.toString}")

  val row3 = 3
  val column4 = 4
  val arrayOfThreeRowsAndFourColumns = Array.tabulate(row3, column4)( (row, column) => row + column )
  println(s"Array with 3 rows and 4 columns = ${arrayOfThreeRowsAndFourColumns.deep.toString}")

  //How to create Array using Range
  println("\nStep 8: How to create Array using Range")
  val rangeArray: Array[Int] = (1 to 10).toArray[Int]
  println(s"Array using Range from 1 to 10 = ${rangeArray.mkString(", ")}")

  //How to copy an Array using Array.copy
  println("\nStep 9: How to copy an Array using Array.copy")
  val copyOfRangeArray: Array[Int] = new Array(rangeArray.size)
  Array.copy(rangeArray, 0, copyOfRangeArray, 0, rangeArray.size)
  println(s"copy of range array with elements from rangeArray = ${copyOfRangeArray.mkString(", ")}")

  //How to clone an Array
  println("\nStep 10: How to clone an Array")
  val clonedRangeArray = rangeArray.clone
  clonedRangeArray(0) = 10 // update index 0 to value 10
  println(s"clonedRangeArray = ${clonedRangeArray.mkString(", ")}")
  println(s"original range array still unchanged = ${rangeArray.mkString(", ")}")

  //How to iterate over an Array using for comprehension
  println("\nStep 11: How to iterate over an Array using for comprehension")
  for(d <- array1){
    println(s"d = $d")
  }

  //How to merge two Arrays using Array.concat
  println("\nStep 12: How to merge two Arrays using Array.concat")
  val moreDonutsArray: Array[String] = Array("Vanilla Donut","Glazed Donut")
  val mergedDonutArray: Array[String] = Array.concat(array1, moreDonutsArray)
  println(s"Merged Array of donuts = ${mergedDonutArray.mkString(", ")}")

  //How to check if two Arrays are equal
  println("\nStep 13: How to check if two Arrays are equal")
  val arrayToCompare = Array[String]("Plain Donut","Strawberry Donut","Chocolate Donut")

  println(s"using == ${array1 == moreDonutsArray}") // prints false

  println(s"using == ${array1 == arrayToCompare}") // ALSO prints false ??? what ... be careful

  println(s"using sameElement function = ${array1 sameElements arrayToCompare}") // NOW this works and returns true!

  //How to check if two Arrays are equal using deep function and ==
  println("\nStep 14: How to check if two Arrays are equal using deep function and == ")
  println(s"using deep function = ${array1.deep == arrayToCompare.deep}")

  //3 Dimensional array example
  println("\nStep 15: 3 dimensional array example ")

  val x, y, z = 3
  val a = Array.ofDim[Int](x,y,z)
  for {
    i <- 0 until x
    j <- 0 until y
    k <- 0 until z
  }
  println(s"($i)($j)($k) = ${a(i)(j)(k)}")



}
