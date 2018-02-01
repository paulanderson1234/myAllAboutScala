package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object scanRight extends App {

  /* Note - The scanRight method takes an associative binary operator function as parameter and will use it to collapse elements from the collection to create a running total

  The order for traversing the elements in the collection is from right to left and hence the name scanRight

  scanRight allows you to also specify an initial value.

  The scanRight method is a member of TraversableLike trait
  */

  //How to initialize a sequence of numbers
  println("Step 1: How to initialize a sequence of numbers")
  val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
  println(s"Elements of numbers = $numbers")

  //How to create a running total using the scanRight function
  /*Note - calculation method for scanRight:

  scanRight method iterations
  5 + 4 + 3 + 2 + 1 = 15
  5 + 4 + 3 + 2     = 14
  5 + 4 + 3         = 12
  5 + 4             =  9
  5 + 0             =  5
  0                 =  0
  */

  println("\nStep 2: How to create a running total using the scanRight function")
  println("Note - starting with initial value of zero and using wildcard operator")
  val runningTotal: Seq[Int] = numbers.scanRight(0)(_ + _)
  println(s"Running total of all elements in the collection = $runningTotal")

  //How to create a running total using the scanRight function explicitly
  println("\nStep 3: How to create a running total using the scanRight function explicitly")
  println("Note - starting with initial value of zero")
  val runningTotal2: Seq[Int] = numbers.scanRight(0)((a, b) => a + b)
  println(s"Running total of all elements in the collection = $runningTotal2")

}
