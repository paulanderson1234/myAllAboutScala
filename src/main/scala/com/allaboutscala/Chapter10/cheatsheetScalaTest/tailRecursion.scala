package com.allaboutscala.Chapter10.cheatsheetScalaTest

/**
  * Created by paul on 06/02/18.
  */
object tailRecursion extends App {

  /*

  Note - The tail recursion method is a function call performed as the last action
  Thi means that your recursive call should be the last operation in your function

  Recursion guidelines:
  (1) Identify the list
  (2) Implement the termination condition
  (3) Compute the head and recurs with the tail

 */

  val donutNumbers: Seq[Int] = Seq(5,4,3,2,1,0)
  println(s"\nStep 1: Sequence of donutNumbers = $donutNumbers")

  val donutNumbersHead = donutNumbers.head
  println(s"head of the sequence = $donutNumbersHead")

  val donutNumbersTail = donutNumbers.tail
  println(s"tail of the sequence = $donutNumbersTail")

  val newDonutNumbers: Seq[Int] = donutNumbers.drop(1)
  println(s"\nStep 2: Sequence of newDonutNumbers after removing head = $newDonutNumbers")


  val newdonutNumbersHead = newDonutNumbers.head
  println(s"new head of the sequence = $newdonutNumbersHead")

  val newdonutNumbersTail = newDonutNumbers.tail
  println(s"new tail of the sequence = $newdonutNumbersTail")


  //Example of recursion using tail recursion based on example in recursion
  //f: is now the termination condition of 1 and recursive factorial is the last action called
  //Scala compiler optimizes function internally by converting it to a standard loop
  println("\nStep 3: Solution to calculation of the factorial using recursive solution")
  def iFactorialRecursion (n: Int, f: Int): Int = {
    if (n <= 0)
      f
    else
      iFactorialRecursion(n-1, n*f)
  }

  println(s"Calculation of factorial of 5 using recursion = ${iFactorialRecursion(5,1)}")

  //Example of recursion using tail recursion based on example in recursion with only ONE input parameter
  println("\nStep 4: Solution to calculation of the factorial using recursive solution taking ONE parameter")

  def wrappedFactorial (i: Int): Int = {
    println("You called Factorial for " + i)
    def iFactorialR(n: Int, f: Int): Int = {
      if (n <= 0)
        f
      else
        iFactorialR(n - 1, n * f)
    }
    iFactorialR(i,1)
  }

  println(s"Calculation of factorial of 5 using recursion with ONE parameter = ${wrappedFactorial(5)}")


  //Demonstrate exception occurs with stack trace - outputs only one instance of iFactorialException
  //Commented out to avoid compilation errors
  println("\nStep 5: Demonstrate exception error stack for calculation of the factorial using recursive solution")
  println("Note : Commented out to avoid compilation errors")
  /*  def iFactorialRecursionException (n: Int, f: Int): Int = {
    if (n <= 0)
      throw new Exception ("Exception!")
    else
      iFactorialRecursionException(n-1, n*f)
  }

  println(s"Calculation of factorial of 5 using recursion = ${iFactorialRecursionException(5,1)}")
  */

}
