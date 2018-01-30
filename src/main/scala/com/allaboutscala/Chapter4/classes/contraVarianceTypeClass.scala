package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 22/01/18.
  */
object contraVarianceTypeClass extends App {

  //How to define an abstract class called Donut
  println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name: String) {

    def printName: Unit

  }

  //How to extend abstract class Donut and define a case class called VanillaDonut
  println("\nStep 2: How to extend abstract class Donut and define a case class called VanillaDonut")
  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  //How to extend abstract class Donut and define another case class of Donut called GlazedDonut
  println("\nStep 3: How to extend abstract class Donut and define another case class called GlazedDonut")
  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  //How to instantiate Donut objects
  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  //How to define a ShoppingCart type class which expects Donut types
  println("\nStep 5: How to define a ShoppingCart type class which expects Donut types")
  class ShoppingCart[D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }

  //How to create instances or objects of ShoppingCart class
  println("\nStep 6: How to create instances or objects of ShoppingCart class")
  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  shoppingCart.printCartItems

  //How to enable contra-variance on ShoppingCart

  //enabled contra-variance of type Donuts using the notation [-D <: Donut]
  //  In other words, you can now have a ShoppingCart of type VainllaDonut ShoppingCart[VanillaDonut] reference ShoppingCart of type Donut ShoppingCart2[Donut]
  //
  println(s"\nStep 7: How to enable contra-variance on ShoppingCart")
  class ShoppingCart2[-D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }

  //enabled contra-variance of type Donuts using the notation [-D <: Donut]
  //  In other words, you can now have a ShoppingCart of type VainllaDonut ShoppingCart[VanillaDonut] reference ShoppingCart of type Donut ShoppingCart2[Donut]

  val shoppingCart2: ShoppingCart2[VanillaDonut] = new ShoppingCart2[Donut](Seq(glazedDonut))
  shoppingCart2.printCartItems

}
