package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object foldLeft extends App {

  /* Note - The foldLeft method takes an associative binary operator function as parameter and will use it to collapse elements from the collection

  The order for traversing the elements in the collection is from left to right and hence the name foldLeft

  The foldLeft method allows you to also specify an initial value

  Using foldLeft is fundamental in recursive function and will help you prevent stack-overflow exceptions

  The foldLeft method is a member of the TraversableOnce trait

  There are two arguments to foldLeft, separated into two parameter sequences: the base starting value of the accumulator (0 in this case), and   the function to be executed for each list element. The current accumulator value is submitted as the first argument to the function, and      the next element in the list is submitted as the second argument. After each function execution, the result is submitted as the accumulator   value to the next iteration. Once the entire list has been traversed, the final accumulator result is returned as the result of the entire    folding operation.

    scala> val list = List(4,8,15,16,23,42)
    scala> list.foldLeft(0) { (sum,element) => sum+element } //can be written as scala> list.foldLeft(0) (_+_)
    res: Int = 108

   */

  //How to initialize a sequence of donut prices
  println("Step 1: How to initialize a sequence of donut prices")
  val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Donut prices = $prices")

  //How to sum all the donut prices using foldLeft function
  println("\nStep 2: How to sum all the donut prices using foldLeft function")
  println("Note - passing into foldLeft method initial Double of 0.0")
  val sum = prices.foldLeft(0.0)(_ + _)
  println(s"Sum = $sum")

  //How to initialize a Sequence of donuts
  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts = $donuts")

  //How to create a String of all donuts using foldLeft function
  println("\nStep 4: How to create a String of all donuts using foldLeft function")
  println(s"All donuts = ${donuts.foldLeft("")((a, b) => a + b + " Donut ")}")

  //How to declare a value function to create the donut string
  println("\nStep 5: How to declare a value function to create the donut string")
  val concatDonuts: (String, String) => String = (a, b) => a + b + " Donut "
  println(s"Value function concatDonuts = $concatDonuts")

  //How to create a String of all donuts using value function from Step 5 and foldLeft function
  println("\nStep 6: How to create a String of all donuts using value function from Step 5 and foldLeft function")
  println(s"All donuts = ${donuts.foldLeft("")(concatDonuts)}")

}
