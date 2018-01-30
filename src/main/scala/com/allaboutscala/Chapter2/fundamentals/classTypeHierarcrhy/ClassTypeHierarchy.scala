package com.allaboutscala.Chapter2.fundamentals.classTypeHierarcrhy

/**
  * Created by paul on 09/01/18.
  */
object ClassTypeHierarchy extends App {

  //Declare a variable of type Any
  println("Step 1: Declare a variable of type Any")
  val favoriteDonut: Any = "Glazed Donut"
  println(s"favoriteDonut of type Any = $favoriteDonut")

  //Declare a variable of type AnyRef
  println("\nStep 2: Declare a variable of type AnyRef")
  val donutName: AnyRef = "Glazed Donut"
  println(s"donutName of type AnyRef = $donutName")

  //Declare a variable of type AnyVal
  println("\nStep 3: Declare a variable of type AnyVal")
  val donutPrice: AnyVal = 2.50
  println(s"donutPrice of type AnyVal = $donutPrice")


}
