package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 18/01/18.
  */
object createTypedClass extends App {

  //How to define an abstract class called Donut
  println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name: String) {

    def printName: Unit

  }

  //Note - Any class which extends the abstract class Donut will have to provide an implementation for the printName method

  //How to extend abstract class Donut and define a case class called VanillaDonut
  println("\nStep 2: How to extend abstract class Donut and define a case class called VanillaDonut")
  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  //NOte - we did not have to create a Companion Object for the VanillaDonut case class because the case class will automatically provide a companion object

  //How to extend abstract class Donut and define another case class of Donut called GlazedDonut
  println("\nStep 3: How to extend abstract class Donut and define another case class called GlazedDonut")
  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  //Note - we did not have to create a Companion Object for the GlazedDonut class.

  //How to instantiate Donut objects
  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  //Note - Since VanillaDonut and GlazedDonut are sub-classes of the base class Donut, they both have access to the printName method

  //How to define a ShoppingCart type class which expects Donut types
  println("\nStep 5: How to define a ShoppingCart type class which expects Donut types")
  class ShoppingCart[D <: Donut](donuts: Seq[D]) {

    def printCartItems: Unit = donuts.foreach(_.printName)

  }

  //Note - With the notation [D <: Donut], we are restricting only Donut types to be passed-through to the ShoppingCart class

  //How to create instances or objects of ShoppingCart class
  println("\nStep 6: How to create instances or objects of ShoppingCart class")
  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  shoppingCart.printCartItems

  //How to create instances or objects of ShoppingCart class
    //  println("\nStep 7: How to create instances or objects of ShoppingCart class - compilation error")
    //  val shoppingCart2: ShoppingCart[Donut] = new ShoppingCart[String](Seq[String](vanillaDonut))
    //  shoppingCart.printCartItems
    //
    //  val shoppingCart3: ShoppingCart[Donut] = new ShoppingCart[String](Seq("Vanilla Donut"))

}
