package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 17/01/18.
  */
object partialFunctionTrait extends App {

  //Review of Pattern Matching in Scala
  println("Step 1: Review of Pattern Matching in Scala")
  val donut = "Glazed Donut"
  val tasteLevel = donut match {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Taste level of $donut = $tasteLevel")

  //How to define a Partial Function named isVeryTasty
  println("\nStep 2: How to define a Partial Function named isVeryTasty")
  val isVeryTasty: PartialFunction[String, String] = {
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
  }

  //How to call the Partial Function named isVeryTasty
  println("\nStep 3: How to call the Partial Function named isVeryTasty")
  println(s"Calling partial function isVeryTasty = ${isVeryTasty("Glazed Donut")}")

  //creates a scala.MatchError if partial function does not contain a case which matches the input such as tha outlined below
    //  println(s"Calling partial function isVeryTasty = ${isVeryTasty("Misc Donut")}")

  //How to define PartialFunction named isTasty and unknownTaste
  println("\nStep 4: How to define PartialFunction named isTasty and unknownTaste")
  val isTasty: PartialFunction[String, String] = {
    case "Plain Donut" => "Tasty"
  }

  val unknownTaste: PartialFunction[String, String] = {
    case donut @ _ => s"Unknown taste for donut = $donut"
  }

  //How to compose PartialFunction using orElse
  println("\nStep 5: How to compose PartialFunction using orElse")
  val donutTaste = isVeryTasty orElse isTasty orElse unknownTaste
  println(donutTaste("Glazed Donut"))
  println(donutTaste("Plain Donut"))
  println(donutTaste("Chocolate Donut"))





}
