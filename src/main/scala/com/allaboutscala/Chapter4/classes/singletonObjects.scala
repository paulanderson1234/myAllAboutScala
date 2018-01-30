package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 17/01/18.
  */
object singletonObjects extends App {

  //How to declare a Singleton Object
  println("Step 1: How to declare a Singleton Object")
  object DonutShoppingCartCalculator {

  }

  //How to define a global field
  println("Step 1: How to declare global field in a Singleton Object")
  object DonutShoppingCartCalculator2 {

    println("\nStep 2: How to define a global field")
    val discount: Double = 0.01
  }

  //How to define utility function called calculateTotalCost
  println("Step 1: How to declare a definition in a Singleton Object")
  object DonutShoppingCartCalculator3 {

    println("Step 2: How to define a global field  for step 5")
    val discount: Double = 0.01

    println("Step 3: How to define utility function called calculateTotalCost for step 5")
    def calculateTotalCost(donuts: List[String]): Double = {
      // calculate the cost of donuts
      return 1
    }
  }

  //How to call global discount field from Step 2
  println("\nStep 4: How to call global discount field from Step 2")
  println(s"Global discount = ${DonutShoppingCartCalculator2.discount}")

  //How to call the utility function calculateTotalCost from Step 3
  println("\nStep 5: How to call the utility function calculateTotalCost from Step 3")
  println(s"Call to calculateTotalCost function = ${DonutShoppingCartCalculator3.calculateTotalCost(List())}")

}
