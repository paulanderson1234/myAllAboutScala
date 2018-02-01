package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object sortBy extends App {

  /* Note - The sortBy method takes a predicate function and will use it to sort the elements in the collection.

  The sortBy method is a member of SeqLike trait
  */

  //How to create a case class to represent Donut objects
  println("\nStep 1: How to create a case class to represent Donut objects")
  case class Donut(name: String, price: Double)

  //How to create a Sequence of type Donut
  println("\nStep 2: How to create a Sequence of type Donut")
  val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts = $donuts")

  //How to sort a sequence of case class objects using the sortBy function
  println("\nStep 3: How to sort a sequence of case class objects using the sortBy function")
  println(s"Sort a sequence of case class objects of type Donut, sorted by price = ${donuts.sortBy(donut => donut.price)}")

  //How to sort a sequence of case class objects using the sortBy function in reverse
  println("\nStep 3b: How to sort a sequence of case class objects using the sortBy function in reverse order")
  println(s"Sort a sequence of case class objects of type Donut, sorted by reverse price = ${donuts.sortBy(donut => donut.price).reverse}")

}
