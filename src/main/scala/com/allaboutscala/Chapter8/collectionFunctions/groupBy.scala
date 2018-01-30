package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 30/01/18.
  */
object groupBy extends App {

  /* Note - The groupBy method takes a predicate function as its parameter and uses it to group elements by key and values into a Map collection.

  The groupBy method is a member of the TraversableLike trait.
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to group elements in a sequence using the groupBy function
  println("\nStep 2: How to group elements in a sequence using the groupBy function")
  val donutsGroup: Map[Char, Seq[String]] = donuts.groupBy(_.charAt(0))
  println(s"Group elements in the donut sequence by the first letter of the donut name = $donutsGroup")

  //How to create a case class to represent Donut objects
  println("\nStep 3: How to create a case class to represent Donut objects")
  case class Donut(name: String, price: Double)

  //How to create a Sequence of type Donut
  println("\nStep 4: How to create a Sequence of type Donut")
  val donuts2: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts2 = $donuts2")

  //How to group case classes donut objects by the name property
  println(s"\nStep 5: How to group case classes donut objects by the name property")
  val donutsGroup2: Map[String, Seq[Donut]] = donuts2.groupBy(_.name)
  println(s"Group element in the sequence of type Donut grouped by the donut name = $donutsGroup2")

  //

}
