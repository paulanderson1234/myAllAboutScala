package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 17/01/18.
  */
object classesAndObjects extends App {

  //How to define a simple class to represent a Donut object
  class Donut(name: String, productCode: Long) {

    def print = println(s"Donut name = $name, productCode = $productCode")

  }

  //How to create instances of Donut class
  println("\nStep 2: How to create instances of Donut class")
  val glazedDonut = new Donut("Glazed Donut", 1111)
  val vanillaDonut = new Donut("Vanilla Donut", 2222)

  //How to call the print function for each of the donut object
  println("\nStep 3: How to call the print function for each of the donut object")
  glazedDonut.print
  vanillaDonut.print

  //How to access the properties of class Donut
  //you will encounter a compilation error if attempting to access particular properties - see Case Class to provide accessors

  println("\nStep 4: How to access the properties of class Donut")
//  glazedDonut.name // compilation error
//  glazedDonut.productCode //compilation error

}
