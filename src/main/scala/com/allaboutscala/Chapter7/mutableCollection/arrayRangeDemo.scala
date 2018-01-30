package com.allaboutscala.Chapter7.mutableCollection

import Array._

/**
  * Created by paul on 25/01/18.
  */
object arrayRangeDemo {

  def main(args: Array[String]) {
    var myList1 = range(10, 20, 2)
    var myList2 = range(10,20)

    println("\nmyList1 output - Range between 10 and 20 in multiples of 2 are:")
    // Print all the array elements
    for ( x <- myList1 ) {
      print(x + " ")
    }

    println()
    println("\nmyList2 output - Range between 10 and 20 are:")
    for ( x <- myList2 ) {
       print(x + " " )
    }
  }

}
