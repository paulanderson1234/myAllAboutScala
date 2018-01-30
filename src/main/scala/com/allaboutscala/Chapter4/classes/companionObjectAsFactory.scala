package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 17/01/18.
  */
object companionObjectAsFactory extends App {

  //How to define a simple class to represent a Donut object
  println("Step 1: How to define a simple class to represent a Donut object")
  class Donut(name: String, productCode: Option[Long] = None){

    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}")

  }

  //How to declare class hierarchy through inheritance using extends keyword
  println("\nStep 2: How to declare class hierarchy through inheritance using extends keyword")
  class GlazedDonut(name: String) extends Donut(name)

  class VanillaDonut(name: String) extends Donut(name)

  //How to declare apply method of companion object as a factory
  println("\nStep 3: How to declare apply method of companion object as a factory")
  object Donut {

    def apply(name: String): Donut = {
      name match {
        case "Glazed Donut" => new GlazedDonut(name)
        case "Vanilla Donut" => new VanillaDonut(name)
        case _ => new Donut(name)
      }
    }

  }

  //How to call apply method of companion object which is a factory
  println("\nStep 4: How to call apply method of companion object which is a factory")
  val glazedDonut = Donut("Glazed Donut")
  println(s"The class type of glazedDonut = ${glazedDonut.getClass}")
  glazedDonut.print

  val vanillaDonut = Donut("Vanilla Donut")
  println(s"The class type of vanillaDonut = ${vanillaDonut.getClass}")
  vanillaDonut.print


}
