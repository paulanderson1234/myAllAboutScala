package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 18/01/18.
  */
object extendCaseClassInheritance extends App {

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

  //Note - Unlike the previous tutorial on Class Inheritance, we did not have to create a Companion Object for the VanillaDonut case class because the case class will automatically provide a companion object

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

}
