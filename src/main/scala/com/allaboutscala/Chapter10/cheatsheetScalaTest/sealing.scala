package com.allaboutscala.Chapter10.cheatsheetScalaTest

object sealing extends App {

//  object Donuts {

    println("\nStep 1: construct sealed trait for Donut with 2 case classes: Sweet and Savoury")
    sealed trait Donut

      case class Sweet(flavour: String) extends Donut

      case class Savoury(flavour: String) extends Donut

    /*Note - compiler will verify if there is a missing case clause and can be verified if you
    comment one of the case clauses out and run sbt compile*

    ~/src/main/scala/com/allaboutscala/Chapter10/cheatsheetScalaTest/sealing.scala:10: match may not be exhaustive./

    */

    println("\nStep 2: pattern matching to distinguish different cases of donuts ")
      def donutType(donut: Donut): String =
        donut match {
          case Sweet(flavour) => flavour
          case Savoury(flavour) => flavour
      }

    println("\nStep 3: Set up some flavours - maple as Sweet and chilli as Savoury")
    val mapleDonut: Donut = Sweet("maple")
    val chilliDonut: Donut = Savoury("chilli")

  println("\nStep 4: Output by passing in a sweet and a savoury type donut:")
  println(s"A Sweet donut is: ${donutType(mapleDonut)}")
  println(s"A Savoury donut is: ${donutType(chilliDonut)}")

  println("\nFurther example containing differing elements")

  println("\nStep 1: trait of music symbol created with 2 classes: Note or Rest")
  sealed trait Symbol
  case class Note(name: String, duration: String, octave: Int) extends Symbol
  case class Rest(duration: String) extends Symbol

  println("\nStep 2: values set for symbols")
  val symbol1: Symbol = Note("C", "Quarter", 3)
  val symbol2: Symbol = Rest("Whole")
  println(s"Symbol1 is: $symbol1")
  println(s"Symbol2 is: $symbol2")

  println("\nStep 3: pattern matching for symbol duration for each case: Note and Rest")
  def symbolDuration(symbol: Symbol): String =
    symbol match {
      case Note(name, duration, octave) => duration
      case Rest(duration) => duration
    }

  println(s"\nStep 4: output the duration for symbol1 = ${symbolDuration(symbol1)}")
  println(s"\nStep 5: output the duration for symbol2 = ${symbolDuration(symbol2)}")

}