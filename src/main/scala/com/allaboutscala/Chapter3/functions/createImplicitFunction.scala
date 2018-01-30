package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 12/01/18.
  */
object createImplicitFunction extends App {

  //How to create a wrapper String class which will extend the String type
  println("Step 1: How to create a wrapper String class which will extend the String type")
  class DonutString(s: String) {

    def isFavoriteDonut: Boolean = s == "Glazed Donut"

  }

  //How to create an implicit function to convert a String to the wrapper String class
  //It is a good practice to encapsulate your implicit functions and values into an Object or a Package Object.
  println("\nStep 2: How to create an implicit function to convert a String to the wrapper String class")
  object DonutConverstions {

    implicit def stringToDonutString(s: String) = new DonutString(s)
  }


  //How to import the String conversion so that it is in scope
  println("\nStep 3: How to import the String conversion so that it is in scope")
  import DonutConverstions._

  //How to create String values
  println("\nStep 4: How to create String values")
  val glazedDonut = "Glazed Donut"
  val vanillaDonut = "Vanilla Donut"

  //How to access the custom String function called isFavaoriteDonut
  println("\nStep 5: How to access the custom String function called isFavoriteDonut")
  println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
  println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")

}
