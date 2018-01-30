package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 18/01/18.
  */
object covarianceTypeClass extends App {

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

  //Note - we did not have to create a Companion Object for the VanillaDonut case class because the case class will automatically provide a companion object

  //How to extend abstract class Donut and define another case class of Donut called GlazedDonut
  println("\nStep 3: How to extend abstract class Donut and define another case class called GlazedDonut")
  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  //How to instantiate Donut objects
  //Note - Donut objects, one using the VanillaDonut class and the other one using the GlazedDonut class. Note that we are specifying the type for both vanillaDonut and glazedDonut to be of base type Donut

  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  //Note - VanillaDonut and GlazedDonut are sub-classes of the base class Donut, they both have access to the printName method

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

  //Note - you will get a compiler error if you tried to create ShoppingCart of type String
    //val shoppingCart2: ShoppingCart[Donut] = new ShoppingCart[String](Seq("Vanilla Donut"))

  //Note - what if you need to create a ShoppingCart of type VanillaDonut? You will get a compiler error for a ShoppingCart of type VanillaDonut
    //val shoppingCart: ShoppingCart[Donut] = new ShoppingCart[VanillaDonut](Seq(vanillaDonut))

  //How to enable covariance on ShoppingCart

  //Note - enabled covariance of type Donuts using the notation [+D <: Donut] - now create instances of ShoppingCart of type Donut or sub-types of Donuts such as VanillaDonut


  println(s"\nStep 7: How to enable covariance on ShoppingCart")
  class ShoppingCart3[+D <: Donut](donuts: Seq[D]) {

    //println(donuts.size)


    def printCartItems: Unit = donuts.foreach(_.printName)


  }

  //Note - amended from original code in example due to compilation issues
  //  Error:(94, 81) type mismatch;
  //  found   : com.allaboutscala.Chapter4.classes.covarianceTypeClass.Donut
  //  required: com.allaboutscala.Chapter4.classes.covarianceTypeClass.VanillaDonut
  //  val shoppingCart3: ShoppingCart3[Donut] = new ShoppingCart3[VanillaDonut](Seq(vanillaDonut))

  //  val shoppingCart3: ShoppingCart3[Donut] = new ShoppingCart3[VanillaDonut](Seq(vanillaDonut))
  //  shoppingCart3.printCartItems


  //Amended code to cover tutorial where VanillaDonut is created as a sub class of Donut
  val vanDs = Seq(new VanillaDonut("vanilla"), new VanillaDonut("van-ill-a"), new VanillaDonut("v-a-n-i-l-l-a"))
//  val vanDs = Seq(new VanillaDonut("vanilla"))
  val shoppingCart3 = new ShoppingCart3[VanillaDonut](vanDs)
  shoppingCart3.printCartItems

}
