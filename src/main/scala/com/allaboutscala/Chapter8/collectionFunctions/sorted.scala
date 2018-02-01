package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object sorted extends App {

  /* Note - The sorted method will return a new collection with elements sorted by their natural order.

  The sorted method is a member of SeqLike trait
  */

  //How to initialize donut prices
  println("Step 1: How to initialize donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
  println(s"Elements of prices = $prices")

  //How to sort a sequence of type Double using the sorted function
  println("\nStep 2: How to sort a sequence of type Double using the sorted function")
  println("Note - sorted into natural order which is numerically ascending in this example")
  println(s"Sort a sequence of type Double by their natural ordering = ${prices.sorted}")

  //How to initialize a Sequence of donuts
  println("\nStep 3: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to sort a sequence of type String using the sorted function
  println("\nStep 4: How to sort a sequence of type String using the sorted function")
  println("Note - sorted into natural order which is alphabetically in this example")
  println(s"Sort a sequence of type String by their natural ordering = ${donuts.sorted}")

}
