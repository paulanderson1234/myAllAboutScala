package com.allaboutscala.Chapter2.fundamentals.enumerations

/**
  * Created by paul on 09/01/18.
  */
object Enumerations extends App {


  //How to create an Enumeration
  println("Step 1: How to create an enumeration")
  object Donut extends Enumeration {
    type Donut = Value

    val Glazed      = Value("Glazed")
    val Strawberry  = Value("Strawberry")
    val Plain       = Value("Plain")
    val Vanilla     = Value("Vanilla")
  }

  //How to print the String value of the enumeration
  println("\nStep 2: How to print the String value of the enumeration")
  println(s"Vanilla Donut string value = ${Donut.Vanilla}")

  //How to print the id of the enumeration
  println("\nStep 3: How to print the id of the enumeration")
  println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")

  //How to print all the values listed in Enumeration
  println("\nStep 4: How to print all the values listed in Enumeration")
  println(s"Donut types = ${Donut.values}")

  //How to pattern match on enumeration values
  println("\nStep 5: How to pattern match on enumeration values")
  Donut.values.foreach {
    case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favourite donut = $d")
    case _ => None
  }

  //How to change the default ordering of enumeration values
  println("\nStep 6: How to change the default ordering of enumeration values")
  object DonutTaste extends Enumeration{
    type DonutTaste = Value

    val Tasty       = Value(0, "Tasty")
    val VeryTasty   = Value(1, "Very Tasty")
    val Ok          = Value(-1, "Ok")
  }

  println(s"Donut taste values = ${DonutTaste.values}")
  println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")
  println(s"Donut taste of Tasty id = ${DonutTaste.Tasty.id}")
  println(s"Donut taste of Very Tasty id = ${DonutTaste.VeryTasty.id}")


}
