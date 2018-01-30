package com.allaboutscala.Chapter5.traitsAndDI

/**
  * Created by paul on 22/01/18.
  */
object extendMultipleTraits extends App {

  //Create a trait which will define the methods for a data access layer
  println("Step 1: Create a trait with type which will define the methods for a data access layer")
  trait DonutShoppingCartDao[A] {

    def add(donut: A): Long

    def update(donut: A): Boolean

    def search(donut: A): A

    def delete(donut: A): Boolean

  }

  //Create a second trait which will define the methods for checking donut inventory
  println("\nStep 2: Create a second trait which will define the methods for checking donut inventory")
  trait DonutInventoryService[A] {

    def checkStockQuantity(donut: A): Int

  }

  //Create a DonutShoppingCart class which extends multiple traits namely trait DonutShoppingCartDao and trait DonutInventoryService
  println("\nStep 3: Create a DonutShoppingCart class which extends multiple traits namely trait DonutShoppingCartDao and trait DonutInventoryService")
  class DonutShoppingCart[A] extends DonutShoppingCartDao[A] with DonutInventoryService[A] {

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

    override def checkStockQuantity(donut: A): Int = {
      println(s"DonutShoppingCart-> checkStockQuantity method -> donut: $donut")
      10
    }
  }

  //Create an instance of DonutShoppingCart and call the add, update, search and delete methods
  println("\nStep 4: Create an instance of DonutShoppingCart and call the add, update, search and delete methods")
  val donutShoppingCart: DonutShoppingCart[String] = new DonutShoppingCart[String]()
  donutShoppingCart.add("Vanilla Donut")
  donutShoppingCart.update("Vanilla Donut")
  donutShoppingCart.search("Vanilla Donut")
  donutShoppingCart.delete("Vanilla Donut")

  //Call the checkStockQuantity method which was inherited from trait DonutInventoryService
  println("\nStep 5: Call the checkStockQuantity method which was inherited from trait DonutInventoryService")
  donutShoppingCart.checkStockQuantity("Vanilla Donut")

}
