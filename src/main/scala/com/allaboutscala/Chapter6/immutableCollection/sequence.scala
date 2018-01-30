package com.allaboutscala.Chapter6.immutableCollection

/**
  * Created by paul on 23/01/18.
  */
object sequence extends App {

  //How to initialize a Sequence with 3 elements

  //Note - Sequence is a trait and if you look carefully in the console window for Step 1 above, the elements of the Sequence were rendered into a concrete Immutable List
  println("Step 1: How to initialize a Sequence with 3 elements")
  val seq1: Seq[String] = Seq("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of seq1 = $seq1")

  //How to access elements in Sequence at specific index
  println("\nStep 2: How to access elements in Sequence at specific index")
  println(s"Element at index 0 = ${seq1(0)}")
  println(s"Element at index 1 = ${seq1(1)}")
  println(s"Element at index 2 = ${seq1(2)}")

  //How to add elements to Sequence using :+
  println("\nStep 3: How to add elements to Sequence using :+")
  val seq2: Seq[String] = seq1 :+ "Vanilla Donut"
  println(s"Adding elements to Sequence using :+ = $seq2")

  //How to add two Sequence together using ++
  println("\nStep 4: How to add two Sequence together using ++")
  val seq3: Seq[String] = seq1 ++ Seq[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two sequences together using ++ = $seq3")

  //How to initialize an empty Sequence
  println("\nStep 5: How to initialize an empty Sequence")
  val emptySeq: Seq[String] = Seq.empty[String]
  println(s"Empty Sequence = $emptySeq")

}
