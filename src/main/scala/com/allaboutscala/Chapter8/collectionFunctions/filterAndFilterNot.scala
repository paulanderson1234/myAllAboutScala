package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 29/01/18.
  */
object filterAndFilterNot extends App {

  /* Note - The filter method takes a predicate function as its parameter and uses it to select all the elements in the collection which matches the predicate. It will return a new collection with elements that matched the predicate

  The filterNot method is similar to the filter method except that it will create a new collection with elements that do not match the predicate function.

  The filter and filterNot method is a member of the TraversableLike trait.
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut", "Vanilla Donut")
  val donuts2: Seq[String] = Seq("W Donut", "X Donut", "Y Donut", "Z Donut")

  println(s"Elements of donuts = $donuts")

  //How to keep only Plain and Glazed Donuts using the filter method
  println("\nStep 2: How to keep only Plain and Glazed Donuts using the filter method")
  val sequenceWithPlainAndGlazedDonut = donuts.filter { donutName =>
    donutName.contains("Plain") || donutName.contains("Glazed")
  }
  println(s"Sequence with Plain and Glazed donuts only = $sequenceWithPlainAndGlazedDonut")

  //How to keep only Plain and Glazed Donuts using the filter method
  //Note - nothing returned in List where elements not found
  println("\nStep 2b: Filter method - where elements don't exist in sequence")
  val sequenceWithAbc = donuts2.filter { donutName =>
    donutName.contains("A") || donutName.contains("B") || donutName.contains("C")
  }
  println(s"Sequence filter for elements which do not exist = $sequenceWithAbc")

  //How to filter out element Vanilla Donut using the filterNot function
  println("\nStep 3: How to filter out element Vanilla Donut using the filterNot function")
  val sequenceWithoutVanillaDonut = donuts.filterNot(donutName => donutName == "Vanilla Donut" )
  println(s"Sequence without vanilla donut = $sequenceWithoutVanillaDonut")

  //How to filter out element A Donut using the filterNot function - not existing
  //Note - results in all of the List being output where element is not found
  println("\nStep 3b: How to filter out element 'A Donut' using the filterNot function")
  val sequenceWithoutA = donuts2.filterNot(donutName => donutName == "A Donut" )
  println(s"Sequence without 'A' donut = $sequenceWithoutA")

}
