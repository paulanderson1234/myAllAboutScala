package com.allaboutscala.Chapter10.cheatsheetScalaTest

/**
  * Created by paul on 06/02/18.
  */
object recursion extends App {

  /* Note - recursion is a technique in which a function calls itself
  It is therefore possible to replace most loops with a recursion
  It is used extensively in Functional Programming
  By product is that it avoids using 'var' which creates mutation

  Note 2 - there is a limitation on recursion from a Performance perspective due to the number of calls that may need to be made recursively
  Consider using tail recursion to avoid this issue
  */

  println("\nStep 1: Original calculation of the factorial of a number using loop")
  def iFactorial (n: Int): Int = {
    var i = n
    var f = 1
    while (i > 0) {
      f = f * i
      i = i -1
    }
    f
  }

  println(s"Calculation of factorial of 5 = ${iFactorial(5)}")

  /*Note  - Cannot multiply with a zero value hence returning value 1
          - computation is the head (n) multiplied with new head of the tail (iFactorialRecursion(n-1))
          - this cannot be done without making the call for the next head (n) is held in the runtime environment whilst new call is made
          - this continues until termination is reached (i.e. n value = 0)
          - calculatin is dependant on a wait for the new head (first action) BEFORE multiplying with existing head (n = last action)
  */
  println("\nStep 2: Solution to calculation of the factorial using recursive solution")
  def iFactorialRecursion (n: Int): Int = {
    if (n <= 0)
      1
    else
      /*n = last action
       iFactorialRecusrsion(n-1) = first action and waits till this is known before calculation occurs
       */
      n * iFactorialRecursion(n-1)
  }

  println(s"Calculation of factorial of 5 using recursion = ${iFactorialRecursion(5)}")

  /*
  Demonstrate exception occurs with stack trace
  Exception stack consumes some memory and if this is excessive will result in performance issues
  Commented out to avoid compilation errors
  Note if LOOPS were used this stack trace would not be present and you would not have performance issues
  */

  println("\nStep 3: Demonstrate exception error stack for calculation of the factorial using recursive solution")
  println("Note : commented out to avoid compilation errors")
  /*  def iFactorialRecursionException (n: Int): Int = {
      if (n <= 0)
        throw new Exception ("Exception!")
      else
        n * iFactorialRecursionException(n-1)
    }

    println(s"Calculation of factorial of 5 using recursion = ${iFactorialRecursionException(5)}")
  */

}
