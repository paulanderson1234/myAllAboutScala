package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object reduce extends App {

  /* Note - The reduce method takes an associative binary operator function as parameter and will use it to collapse elements from the collection

  Unlike the fold method, reduce does not allow you to also specify an initial value

  The reduce method is a member of the TraversableOnce trait

  */

  //How to initialize a sequence of donut prices
  println("Step 1: How to initialize a sequence of donut prices")
  val donutPrices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Elements of donutPrices = $donutPrices")

  //How to find the sum of the elements using reduce function - recommends sum function
  println("\nStep 2: How to find the sum of the elements using reduce function - using wildcard operator")
  val sum: Double = donutPrices.reduce(_ + _)
  println(s"Sum of elements from donutPrices = $sum")

  //How to find the sum of elements using reduce function explicitly - recommends sum function
  println("\nStep 3: How to find the sum of elements using reduce function explicitly")
  val sum1: Double = donutPrices.reduce((a, b) => a + b)
  println(s"Sum of elements from donutPrices by calling reduce function explicitly= $sum1")

  //How to find the cheapest donut using reduce function - recommends min function
  println("\nStep 4: How to find the cheapest donut using reduce function - using min operator")
  println(s"Cheapest donut price = ${donutPrices.reduce(_ min _)}")

  //How to find the most expensive donut using reduce function - recommends max function
  println("\nStep 5: How to find the most expensive donut using reduce function - using max operator")
  println(s"Most expensive donut price = ${donutPrices.reduce(_ max _)}")

  //How to initialize a Sequence of donuts
  println("\nStep 6: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to concatenate the elements from the sequence using reduce function
  println("\nStep 7: How to concatenate the elements from the sequence using reduce function")
  println(s"Elements of donuts sequence concatenated = ${donuts.reduce((left, right) => left + ", " + right)}")

  //How to declare a value function to concatenate donut names
  println("\nStep 8: How to declare a value function to concatenate donut names")
  val concatDonutNames: (String, String) => String = (left, right) => {
    left + ", " + right
  }
  println(s"Value function concatDonutNames = $concatDonutNames")

  //How to pass a function to reduce function
  println("\nStep 9: How to pass a function to reduce function")
  println(s"Elements of donuts sequence concatenated by passing function to the reduce function = ${donuts reduce concatDonutNames}")

  //How to use option reduce to avoid exception if the collection is empty
  println("\nStep 10: How to use option reduce to avoid exception if the collection is empty")
  println(s"Using reduce option will NOT throw any exception = ${Seq.empty[String].reduceOption(_ + ", " + _)}")

  //How to use option reduce to avoid exception if the collection is empty
  println("\nStep 11: Exception where reduce used when the collection is empty")
  println("Returns UnsupportedOperationException: empty.reduceLeft")

  //Note - code commented out due to exception error - uncomment to observe returned error
  //  println(s"Using reduce option will NOT throw any exception = ${Seq.empty[String].reduce(_ + ", " + _)}")

}
