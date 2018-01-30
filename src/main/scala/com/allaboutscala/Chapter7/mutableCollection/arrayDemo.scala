package com.allaboutscala.Chapter7.mutableCollection

/**
  * Created by paul on 25/01/18.
  */
object arrayDemo {
  def main(args: Array[String]) {
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    println("\nPrinting all the array elements in myList")
    for ( x <- myList ) {
      println( x )
    }

    // Summing all elements
    var total = 0.0;

    for ( i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("\nSum total of all the values in myList is " + total);

    // Finding the largest element
    var max = myList(0);

    for ( i <- 1 to (myList.length - 1) ) {
      if (myList(i) > max) max = myList(i);
    }

    println("\nThe largest value (Max) in myList is " + max);
  }
}
