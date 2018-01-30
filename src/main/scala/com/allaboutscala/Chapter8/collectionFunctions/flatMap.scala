package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object flatMap extends App {

  /* Note - The flatMap method takes a predicate function, applies it to every element in the collection. It then returns a new collection by using the elements returned by the predicate function

   The flatMap method is essentially a combination of the map method being run first followed by the flatten method

   The flatMap method is a member of the TraversableLike trait but there are specialized versions of the flatMap methods for given collection types
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts1: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts1 = $donuts1")

  //How to initialize another Sequence of donuts
  println("\nStep 2: How to initialize another Sequence of donuts")
  val donuts2: Seq[String] = Seq("Vanilla Donut", "Glazed Donut")
  println(s"Elements of donuts2 = $donuts2")

  //How to create a List of donuts initialized using the two Sequences from Step 1 and Step 2
  //Note - results in List containing two inner lists
  println("\nStep 3: How to create a List of donuts initialized using the two Sequences from Step 1 and Step 2")
  val listDonuts: List[Seq[String]] = List(donuts1, donuts2)
  println(s"Elements of listDonuts = $listDonuts")

  //How to return a single list of donut using the flatMap function
  println("\nStep 4: How to return a single list of donut using the flatMap function")
  val listDonutsFromFlatMap: List[String] = listDonuts.flatMap(seq => seq)
  println(s"Elements of listDonutsFromFlatMap as a flatMap as a single list = $listDonutsFromFlatMap")

  //How to return a single list of donut using the flatMap function
  println("\nStep 4b: How to return a single list of donut using the flatten function")
  val listDonutsFromFlatten: List[String] = listDonuts.flatten
  println(s"Elements of listDonutsFromFlatMap as a flatMap as a single list = $listDonutsFromFlatten")

}
