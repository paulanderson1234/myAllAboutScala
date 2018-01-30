package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object flatten extends App {

  /* Note - The flatten method will collapse the elements of a collection to create a single collection with elements of the same type.

  The flatten method is a member of the GenericTraversableTemplate trait but there are specialized versions of the flatten methods for given collection types.

   */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts1: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts1 = $donuts1")

  //How to initialize another Sequence of donuts
  println("\nStep 2: How to initialize another Sequence of donuts")
  val donuts2: Seq[String] = Seq("Vanilla", "Glazed")
  println(s"Elements of donuts2 = $donuts2")

  //How to create a List of donuts initialized using the two Sequences from Step 1 and Step 2
  println("\nStep 3: How to create a List of donuts initialized using the two Sequences from Step 1 and Step 2")
  val listDonuts: List[Seq[String]] = List(donuts1, donuts2)
  println(s"Elements of listDonuts = $listDonuts")

  //How to return a single list of donut using the flatten function
  println("\nStep 4: How to return a single list of donut using the flatten function")
  val listDonutsFromFlatten: List[String] = listDonuts.flatten
  println(s"Elements of listDonutsFromFlatten = $listDonutsFromFlatten")

  //How to append the word Donut to each element of listDonuts using flatten and map functions
  println("\nStep 5: How to append the word Donut to each element of listDonuts using flatten and map functions")
  val listDonutsFromFlatten2: List[String] = listDonuts.flatten.map(_ + " Donut")
  println(s"Elements of listDonutsFromFlatten2 = $listDonutsFromFlatten2")

}
