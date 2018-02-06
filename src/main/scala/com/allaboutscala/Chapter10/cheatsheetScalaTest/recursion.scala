package com.allaboutscala.Chapter10.cheatsheetScalaTest

/**
  * Created by paul on 06/02/18.
  */
object recursion extends App {

  /* Note - recursion is a technique in which a function calls itself
  It is therefore possible to replace most loops with a recursion
  It is used extensively in Functional Programming

  By product is that it avoids using 'var' which creates mutation
  */

  println("\nOriginal calculation of the factorial of a number using loop")
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

  println("\nSolution to calculation of the factorial using recursive solution")
  def iFactorialRecursion (n: Int): Int = {
    if (n <= 0)
      1
    else
      n * iFactorialRecursion(n-1)
  }

  println(s"Calculation of factorial of 5 using recursion = ${iFactorialRecursion(5)}")
}
