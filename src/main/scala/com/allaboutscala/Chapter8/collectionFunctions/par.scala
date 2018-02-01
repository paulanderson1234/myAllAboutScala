package com.allaboutscala.Chapter8.collectionFunctions

import scala.collection.parallel.ParSeq

/**
  * Created by paul on 31/01/18.
  */
object par extends App {

  /* Note - The par method on collection provides a very easy high level API to allow computation to run in parallel to take advantage of multi-core processing. When you call the par method on a collection, it will copy all the elements into an equivalent Scala Parallel Collection

  The par method is a member of the Parallelizable trait
  */

  //How to initialize an Immutable Sequence of various donut flavours
  println("Step 1: How to initialize an Immutable Sequence of various donut flavours")
  val donutFlavours: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donutFlavours immutable sequence = $donutFlavours")

  //Convert the Immutable donut flavours Sequence into Parallel Collection
  println("\nStep 2: Convert the Immutable donut flavours Sequence into Parallel Collection")
  val donutFlavoursParallel: ParSeq[String] = donutFlavours.par

  //How to use Scala Parallel Collection
  //Note - appending donut to each substituted element from the list of donut flavours
  println("\nStep 3: How to use Scala Parallel Collection")
  val donuts: ParSeq[String] = donutFlavoursParallel.map(d => s"$d donut")
  println(s"Elements of donuts parallel collection = $donuts")

  //

}
