package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 18/01/18.
  */
object classInheritance extends App {

  //How to define an abstract class called Donut
  println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name: String) {

    def printName: Unit

  }

  //Any class which extends the abstract class Donut will have to provide an implementation for the printName method.

  //How to extend abstract class Donut and define a sub-class of Donut called VanillaDonut
  println("\nStep 2: How to extend abstract class Donut and define a sub-class of Donut called VanillaDonut")
  class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  object VanillaDonut {

    def apply(name: String): Donut = {
      new VanillaDonut(name)
    }

  }

  //How to extend abstract class Donut and define another sub-class of Donut called GlazedDonut
  println("\nStep 3: How to extend abstract class Donut and define another sub-class of Donut called GlazedDonut")
  class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  object GlazedDonut {

    def apply(name: String): Donut = {
      new GlazedDonut(name)
    }

  }

  //How to instantiate Donut objects
  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

}
