package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object reduceRight extends App {

  /* Note - The reduceRight method takes an associative binary operator function as parameter and will use it to collapse elements from the collection

  The order for traversing the elements in the collection is from right to left and hence the name reduceRight

  reduceRight does not allow you to also specify an initial value

  reduceRight comes with an overhead with elements from the collection being initially reversed - recommended to use reduceLeft as an option

  The reduceRight method is a member of the TraversableOnce trait

  */

  //How to initialize a sequence of donut prices
  println("Step 1: How to initialize a sequence of donut prices")
  val donutPrices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Elements of donutPrices = $donutPrices")

  //How to find the sum of the elements using reduceRight function - recommends sum function
  println("\nStep 2: How to find the sum of the elements using reduceRight function")
  val sum: Double = donutPrices.reduceRight(_ + _)
  println(s"Sum of elements from donutPrices = $sum")

  //How to find the sum of elements using reduceRight function explicitly - recommends sum function
  println("\nStep 3: How to find the sum of elements using reduceRight function explicitly")
  val sum1: Double = donutPrices.reduceRight((a, b) => a + b)
  println(s"Sum of elements from donutPrices by calling reduceRight function explicitly= $sum1")

  //How to find the sum of elements using reduceRight function explicitly - recommends sum function
  println("\nStep 3b: How to find the sum of elements using reduceRight function explicitly - right to left")
  println("Note - no difference in the output where used as a sum")
  val sum2: Double = donutPrices.reduceRight((b, a) => b + a)
  println(s"Sum of elements from donutPrices by calling reduceRight function explicitly= $sum2")

  //How to find the cheapest donut using reduceRight function - recommends min function
  println("\nStep 4: How to find the cheapest donut using reduceRight function - using min operator")
  println(s"Cheapest donut price = ${donutPrices.reduceRight(_ min _)}")

  //How to find the most expensive donut using reduceRight function - recommends max function
  println("\nStep 5: How to find the most expensive donut using reduceRight function - using max operator")
  println(s"Most expensive donut price = ${donutPrices.reduceRight(_ max _)}")

  //How to initialize a Sequence of donuts
  println("\nStep 6: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to concatenate the elements from the sequence using reduceRight function
  println("\nStep 7: How to concatenate the elements from the sequence using reduceRight function")
  println(s"Elements of donuts sequence concatenated = ${donuts.reduceRight((left, right) => left + ", " + right)}")

  //How to concatenate the elements from the sequence using reduceRight function
  println("\nStep 7b: How to concatenate the elements from the sequence using reduceRight function - right to left")
  println("Note - output appears to be the same as left + right configuration for String sequence")
  println(s"Elements of donuts sequence concatenated = ${donuts.reduceRight((right, left) => right + ", " + left)}")

  //How to declare a value function to concatenate donut names
  println("\nStep 8: How to declare a value function to concatenate donut names")
  val concatDonutNames: (String, String) => String = (left, right) => {
    left + ", " + right
  }
  println(s"Value function concatDonutNames = $concatDonutNames")

  //How to declare a value function to concatenate donut names
  println("\nStep 8b: How to declare a value function to concatenate donut names - right to left")
  val concatDonutNamesRightLeft: (String, String) => String = (right, left) => {
    right + ", " + left
  }
  println(s"Value function concatDonutNames = $concatDonutNamesRightLeft")

  //How to pass a function to reduceRight function
  println("\nStep 9: How to pass a function to reduceRight function")
  println(s"Elements of donuts sequence concatenated by passing function to the reduceRight function = ${donuts reduceRight concatDonutNames}")

  //How to pass a function to reduceRight function
  println("\nStep 9b: How to pass a function to reduceRight function - using right to left config")
  println("Note - output appears to be the same as left + right configuration for String sequence")
  println(s"Elements of donuts sequence concatenated by passing function to the reduceRight function = ${donuts reduceRight concatDonutNamesRightLeft}")

  //How to use reduceRightOption to avoid exception if the collection is empty
  println("\nStep 10: How to use reduceRightOption to avoid exception if the collection is empty")
  println(s"Using reduceRightOption will NOT throw any exception = ${Seq.empty[String].reduceRightOption(_ + ", " + _)}")

  //How to use option reduce to avoid exception if the collection is empty
  println("\nStep 11: Exception where reduce right used when the collection is empty")
  println("Returns UnsupportedOperationException: empty.reduceRight")

  //Note - code commented out due to exception error - uncomment to observe returned error
  //  println(s"Using reduce option will NOT throw any exception = ${Seq.empty[String].reduceRight(_ + ", " + _)}")

  //How to initialize a sequence of numbers
  println("\nStep 12: initialize a sequence of integers")
  val numbers: Seq[Int] = Seq(1, 2, 3)
  println(s"Elements of numbers = $numbers")

  /*reduceRight calculation
  ReduceLeft  = (1-(2-3))
              = (1-)(-1)
              = 2
   */

  val numberReduced = numbers.reduceRight(_ - _)
  println(s"Calculation from reduceRight = $numberReduced")

  val sum3: Int = numbers.reduceRight((a, b) => a + b)
  println(s"\nSum using reduceRight((a, b) => a + b) = $sum3")
  val sum4: Int = numbers.reduceRight((b, a) => b + a)
  println(s"\nSum using reduceRight((b, a) => b + a) = $sum4")

}
