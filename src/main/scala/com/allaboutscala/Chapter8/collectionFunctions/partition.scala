package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 31/01/18.
  */
object partition extends App {

  /* Note - The partition method takes a predicate function as its parameter and will use it to return two collections: one collection with elements that satisfied the predicate function and another collection with elements that did not match the predicate function.

  The partition method is a member of the TraversableLike trait
  */

  //How to initialize a sequence which contains donut names and prices
  //Note - passed in entry that is not String or Double but an Integer
  println("Step 1: How to initialize a sequence which contains donut names and prices")
  val donutNamesAndPrices: Seq[Any] = Seq("Plain Donut", 1.5, "Strawberry Donut", 2.0, "Glazed Donut", 2.5, 5)
  println(s"Elements of donutNamesAndPrices = $donutNamesAndPrices")

  //How to split the sequence by the element types using partition function
  /*Note - example of using partition to pattern match
   All elements are either type String or Double and so when each is passed in you will get either an entry in
   true or false List effectively.

   eg
   Plain Donut = String > true list
   1.5         = NOT String and moves to case price ... am I a type Double ...yes > false list
   5           = NOT String and NOT Double ... am I an Integer ... yes > false list

    */
  println("\nStep 2: How to split the sequence by the element types using partition function")
  val namesAndPrices: (Seq[Any], Seq[Any]) = donutNamesAndPrices.partition {
    case name: String => true
    case price: Double => false
    case int: Int => false
  }
  println(s"Elements of namesAndPrices = $namesAndPrices")

  //How to access the donut String sequence from Step 2 - uses Tuple created in order to output detail
  println("\nStep 3: How to access the donut String sequence from Step 2")
  println(s"Donut names = ${namesAndPrices._1}")

  //How to access the donut prices sequence from Step 2 - uses Tuple created in order to output detail
  println("\nStep 4: How to access the donut prices sequence from Step 2")
  println(s"Donut prices = ${namesAndPrices._2}")

  //How to extract the pair returned by partition function
  //Note - uses extractor to convert the tuples created above into useful names instead of instance _1 and _2
  println("\nStep 5: How to extract the pair returned by partition function")
  val (donutNames, donutPrices) = donutNamesAndPrices.partition {
    case name: String => true
    case _ => false
  }
  println(s"donutNames = $donutNames")
  println(s"donutPrices = $donutPrices")

}
