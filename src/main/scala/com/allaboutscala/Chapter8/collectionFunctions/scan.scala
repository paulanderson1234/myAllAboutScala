package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object scan extends App {

  /* Note - The scan method takes an associative binary operator function as parameter and will use it to collapse elements from the collection to create a running total from each element

  scan allows you to also specify an initial value

  The scan method is a member of TraversableLike trait
  */

  //How to initialize a sequence of numbers
  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")

  //How to create a running total using the scan function
  /* Note - calculation:
  Scan method iterations
  0 + 1             =  1
  1 + 2             =  3
  1 + 2 + 3         =  6
  1 + 2 + 3 + 4     = 10
  1 + 2 + 3 + 4 + 5 = 15
   */

  println("\nStep 2: How to create a running total using the scan function - starting from initial value of zero")
  val runningTotal: Seq[Int] = numbers.scan(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")

  //How to create a running total using the scan function explicitly
  println("\nStep 3: How to create a running total using the scan function explicitly - starting from initial value of zero")
  val runningTotal2: Seq[Int] = numbers.scan(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")

}
