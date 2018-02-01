package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 30/01/18.
  */
object mkString extends App {

  /* Note - The mkString method will help you create a String representation of collection elements by iterating through the collection

  The mkString method has an overloaded method which allows you to provide a delimiter to separate each element in the collection.
  Furthermore, there is another overloaded method to also specify any prefix and postfix literal to be preprended or appended to the String representation

  The mkString method is a member of the TraversableOnce trait

  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to concatenate the elements of a sequence into a String using mkString function
  println("\nStep 2: How to concatenate the elements of a sequence into a String using mkString function")
  //Note - takes each donuts sequence entry and appends string between each element as a separator
  val donutsAsString: String = donuts.mkString(" and ")
  println(s"Donuts elements using mkString function = $donutsAsString")

  //How to concatenate the elements of a Sequence into a String using mkString and specifying prefix and suffix
  println("\nStep 3: How to concatenate the elements of a sequence into a String using mkString and specifying prefix and suffix")
  //Note - Prefix (start), Separator (sep), Suffix (end) defined in TraversableOnce trait
  val donutsWithPrefixAndSuffix: String = donuts.mkString("My favorite donuts namely ", " and ", " are very tasty!")
  println(s"$donutsWithPrefixAndSuffix")

}
