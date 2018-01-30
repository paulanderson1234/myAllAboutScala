package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 17/01/18.
  */
object caseClasses extends App {

  //How to define a case class to represent a Donut object
  println("Step 1: How to define a case class to represent a Donut object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  //How to create instances or objects for the Donut case class
  println("\nStep 2: How to create instances or objects for the Donut case class")
  val vanillaDonut: Donut = Donut("Vanilla Donut", 1.50)
  val glazedDonut: Donut = Donut("Glazed Donut", 2.0)
  println(s"Vanilla Donut = $vanillaDonut")
  println(s"Glazed Donut = $glazedDonut")

  //How to access fields of the Donut object
  println("\nStep 3: How to access fields of the Donut object")
  println(s"Vanilla Donut name field = ${vanillaDonut.name}")
  println(s"Vanilla Donut price field = ${vanillaDonut.price}")
  println(s"Vanilla Donut productCode field = ${vanillaDonut.productCode}")

  //How to modify or update fields of the Donut object
  println("\nStep 4: How to modify or update fields of the Donut object - proving fields are immutable")
  // vanillaDonut.name = "vanilla donut" // compiler error. fields are immutable by default.

  //How to define the hashCode and equals method for Donut object
  println("\nStep 5: How to define the hashCode and equals method for Donut object")
  val shoppingCart: Map[Donut, Int] = Map(vanillaDonut -> 4, glazedDonut -> 3)
  println(s"All items in shopping cart = ${shoppingCart}")
  println(s"Quantity of vanilla donuts in shopping cart = ${shoppingCart(vanillaDonut)}")
  println(s"Quantity of glazed donuts in shopping cart = ${shoppingCart(glazedDonut)}")

  //TIPS
  println("\nTIP: How to create a new object of Donut by using the copy() method of the case class")
  val chocolateVanillaDonut: Donut = vanillaDonut.copy(name = "Chocolate And Vanilla Donut", price = 5.0)
  println(s"Chocolate And Vanilla Donut = $chocolateVanillaDonut")

  //Using case class to update using copy function
  case class Person (forename:String, surname:String)
  val dd = Person("Steve", "Jones")
  val surnameUpdate = dd.copy(surname = "Smith")
  println(surnameUpdate)

}
