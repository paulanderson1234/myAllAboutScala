package com.allaboutscala.Chapter2.fundamentals.interpolation

/**
  * Created by paul on 04/01/18.
  */
object Donut extends App {

  println("Step 1: Using String interpolation to print a variable")
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")

  println("\nStep 2: Using String interpolation on object properties")
  case class Donut(name: String, tasteLevel: String)
  val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")

  println("\nStep 3: Using String interpolation to evaluate expressions")
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}")

  println("\nStep 4: Using String interpolation for formatting text")
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")

  println("\nStep 5: Using f interpolation to format numbers")
  val donutPrice: Double = 2.50
  println(s"Donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice%.2f")

  println("\nStep 6: Using raw interpolation")
  println(raw"Favorite donut\t$donutName")

  println("\nStep 7: Using f interpolation to format numbers add 11 to parameter for actual number of spaces required for prefix")
  println("This is outputting 1 space using parameter %12s")
  val companyName: String = "FooBar, Inc"
  val res1 = f"$companyName%12s"
  println(res1)

  println("\nStep 7b: Using f interpolation to format numbers add upto a number of spaces ")
  println("This is outputting 9 spaces using parameter %30s eg 30 minus 21 chars")
  val companyName2: String = "FooBarAmend, IncAmend" //21 chars
  val res2 = f"$companyName2%30s"
  println(res2)

  println("\nStep 7c: Using f interpolation to format numbers add spaces ")
  println("This is outputting 9 spaces using parameter %30s eg 25 minus 16 chars")
  val companyName3: String = "FooBarAmend, Inc" //16 chars
  val res3 = f"$companyName3%25s"
  println(res3)

  //attempt to output the parameter dynamically but outputs the calculated value as string

  val len: Int = 11
  val text1 = "hello"
  val text2 = "hello there"
  val text3 = "hello there. good innit"

  println("\nStep 8: Using f interpolation to format numbers add upto 10 spaces ")
  println("This is outputting 9 spaces using parameter %30s eg 30 minus 21 chars")

//  val textLength = text1.length + len
//  val textRes1 = f"$text1%${textLength}s"

  val textRes1 = f"$text1${text1.length + len}s"
  println(textRes1)


}
