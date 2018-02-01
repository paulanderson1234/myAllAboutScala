package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object scanLeft extends App {

  /*Note - The scanLeft method takes an associative binary operator function as parameter and will use it to collapse elements from the collection to create a running total

  The order for traversing the elements in the collection is from left to right and hence the name scanLeft

  scanLeft allows you to also specify an initial value

  The scanLeft method is a member of TraversableLike trait
  */

  //How to initialize a sequence of numbers
  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")

  //How to create a running total using the scanLeft function
  println("\nStep 2: How to create a running total using the scanLeft function")
  println("Note - starting with initial value of zero and using wildcard operator")
  val runningTotal: Seq[Int] = numbers.scanLeft(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")

  //How to create a running total using the scanLeft function explicitly
  println("\nStep 3: How to create a running total using the scanLeft function explicitly")
  println("Note - starting with initial value of zero")
  val runningTotal2: Seq[Int] = numbers.scanLeft(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")

}
