package com.allaboutscala.Chapter5.traitsAndDI

/**
  * Created by paul on 22/01/18.
  */
object traitWithTypeParams extends App {

  //Create a trait which will define the methods for a data access layer
  println("Step 1: Create a trait with type which will define the methods for a data access layer")
  trait DonutShoppingCartDao[A] {

    def add(donut: A): Long

    def update(donut: A): Boolean

    def search(donut: A): A

    def delete(donut: A): Boolean

  }

  //Create a DonutShoppingCart class of type A which extends the trait from Step 1 and implements its methods

  //Since DonutShoppingCartDao expects a type parameter we've also define a type class DonutShoppingCart with a type parameter using the syntax DonutShoppingCart[A]

  println("\nStep 2: Create a DonutShoppingCart class of type A which extends the trait from Step 1 and implements its methods")
  class DonutShoppingCart[A] extends DonutShoppingCartDao[A] {

    override def add(donut: A): Long = {
      println(s"DonutShoppingCart-> add method -> donut: $donut")
      1
    }

    override def update(donut: A): Boolean = {
      println(s"DonutShoppingCart-> update method -> donut: $donut")
      true
    }

    override def search(donut: A): A = {
      println(s"DonutShoppingCart-> search method -> donut: $donut")
      donut
    }

    override def delete(donut: A): Boolean = {
      println(s"DonutShoppingCart-> delete method -> donut: $donut")
      true
    }
  }

  //Create an instance of DonutShoppingCart of type String and call the add, update, search and delete methods
  println("\nStep 3: Create an instance of DonutShoppingCart of type String and call the add, update, search and delete methods")
  val donutShoppingCart1: DonutShoppingCart[String] = new DonutShoppingCart[String]()
  donutShoppingCart1.add("Vanilla Donut")
  donutShoppingCart1.update("Vanilla Donut")
  donutShoppingCart1.search("Vanilla Donut")
  donutShoppingCart1.delete("Vanilla Donut")

  //Create an instance of DonutShoppingCart of type String and assign its type to the trait DonutShoppingCartDao

  // Note - you have to specify a type of String using the syntax DonutShoppingCartDao[String] because trait DonutShoppingCartDao[A] expects a type parameter

  println("\nStep 4: Create an instance of DonutShoppingCart of type String and assign its type to the trait DonutShoppingCartDao")
  val donutShoppingCart2: DonutShoppingCartDao[String] = new DonutShoppingCart[String]()
  donutShoppingCart2.add("Vanilla Donut")
  donutShoppingCart2.update("Vanilla Donut")
  donutShoppingCart2.search("Vanilla Donut")
  donutShoppingCart2.delete("Vanilla Donut")



}
