package com.allaboutscala.Chapter10.cheatsheetScalaTest

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.io.Source

/**
  * Created by paul on 02/02/18.
  */

object cheatsheetScalaTest extends App {

  /** Convert Java collection to Scala collection **/

  // Step 1: Import converters
  import scala.collection.JavaConverters._

  // Step 2: Assume you have a Java Map
  val donutJavaMap: java.util.Map[String, Double] = new java.util.HashMap[String, Double]()
  donutJavaMap.put("Plain Donut", 2.50)
  donutJavaMap.put("Vanilla Donut", 3.50)

  // Step 3: Convert the Java Map by calling .asScala
  val donutScalaMap = donutJavaMap.asScala
  val donutScalaMap2 = donutJavaMap.asScala


  // Step 4: You now have a Scala Map (recommends use of key or keySet)
  val pricePlainDonut = donutScalaMap("Plain Donut")
  val setDonuts = donutScalaMap.map(_._1).toSet

  // Step 4b: You now have a Scala Map (using keySet)
  val pricePlainDonut2 = donutScalaMap2("Vanilla Donut")
  val setDonuts2 = donutScalaMap2.keySet




  /**Add line break or separator for given platform **/

  val lineBreak = scala.compat.Platform.EOL
  println(s"\nAdd Line Break:")
  println(s"First line $lineBreak second line")




  /** Convert multi-line string to single line **/

  // Step 1: Define an implicit class to strip out line endings
  implicit class StringConversion(str: String) {

    def inline(): String = str.replaceAll(scala.compat.Platform.EOL," ")

  }

  // Step 2: Create a multi-line string
  val multilineStr =
    """
      |Plain Donut
      |Vanilla Donut
    """.stripMargin

  println(s"\nMulti-line output only = $multilineStr")

  println("\nConvert multi-line to single:")
  println(s"Multi-line as single line = ${multilineStr.inline()}")




  /** Int division in Scala and return a float which keeps the decimal values: **/

  val donutQuantity: Int = 10
  val donutTotalCost: Int = 25
  //Note - You have to be explicit and call .toFloat
  val donutPrice = donutTotalCost.toFloat / donutQuantity
  println(s"Cost of one donut = $donutPrice")




  /** Check the value of an Option **/
  Some(5).contains(5)




  /** Cannot find an implicit ExecutionContext **/

  // Step 1: Need to import scala.concurrent.Future
  // Step 2: Need to import scala.concurrent.ExecutionContext.Implicits.global

  val future: Future[Int] = Future {
    // some long running operation
    1
  }




  /** Function to read a file and return a String of its contents **/

  //// Step 1: Need to import scala.io.Source
  def readFile(file: String): String = {
    Source
      .fromInputStream(getClass.getResourceAsStream(file))
      .getLines
      .mkString("\n")
  }




  /** Create enum using sealed trait **/

  sealed trait Donut
  case object Vanilla extends Donut
  case object Chocolate extends Donut
  case object Plain extends Donut

  def isValidDonut(donut: Donut) = {
    donut match {
      case Vanilla | Chocolate | Plain => println("Valid donut")
      case _ => println("Unknown donut!")
    }
  }





}
