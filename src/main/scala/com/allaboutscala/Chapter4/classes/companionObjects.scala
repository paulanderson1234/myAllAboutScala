package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 17/01/18.
  */
object companionObjects extends App {

  //How to define a simple class to represent a Donut object
  println("Step 1: How to define a simple class to represent a Donut object")
  class Donut(name: String, productCode: Long){

    def print = println(s"Donut name = $name, productCode = $productCode")

  }

  //How to declare a companion object for the Donut class
  println("\nStep 2: How to declare a companion object for the Donut class")
  object Donut {

    def apply(name: String, productCode: Long): Donut = {
      new Donut(name, productCode)
    }

  }

  //How to create instances of the Donut class using the companion object - create instances of class without need to use 'new'
  println("\nStep 3: How to create instances of the Donut class using the companion object")
  val glazedDonut = Donut("Glazed Donut", 1111)
  val vanillaDonut = Donut("Vanilla Donut", 2222)

  //How to call the print function for each of the donut object
  println("\nStep 4: How to call function on each Donut object")
  glazedDonut.print
  vanillaDonut.print



}
