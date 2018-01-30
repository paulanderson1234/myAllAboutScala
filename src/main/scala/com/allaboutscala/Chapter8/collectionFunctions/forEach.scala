package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 30/01/18.
  */
object forEach extends App {

  /* Note - The foreach method takes a function as parameter and applies it to every element in the collection. As an example, you can use foreach method to loop through all elements in a collection.

  The foreach method is a member of the IterableLike trait.
  */

  //How to initialize a Sequence of donuts
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  //How to loop through all the elements in the sequence using the foreach function
  println("\nStep 2: How to loop through all the elements in the sequence using the foreach function")
  donuts.foreach(println(_))

  //How to loop through and access all the elements in the sequence using the foreach function
  println("\nStep 3: How to loop through and access all the elements in the sequence using the foreach function")
  donuts.foreach(donutName => println(s"donutName = $donutName"))

  //How to declare a value function to format a donut names into upper case format
  println("\nStep 4: How to declare a value function to format a donut names into upper case format")
  val uppercase: (String) => String = (s) => {
    val upper = s.toUpperCase
    println(upper)
    upper
  }
  println(s"Value function formatting donut names to uppercase = $uppercase")

  //How to format all donuts to uppercase using value function from Step 4
  println("\nStep 5: How to format all donuts to uppercase using value function from Step 4")
  donuts.foreach(uppercase)

}
