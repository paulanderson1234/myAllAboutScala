package com.allaboutscala.Chapter2.fundamentals.scalaTypeInference

/**
  * Created by paul on 05/01/18.
  */
object Inference extends App {

  println("Step 1: Immutable variable")
  val donutsToBuy: Int = 5
  val donutsToBuyInferred = 6


  println(s"Donuts To Buy specified inference type = $donutsToBuy")
  println(s"Donuts To Buy no specified inference type = $donutsToBuyInferred")

  println("\nStep 2: Scala Types")
  val donutsBoughtToday = 5
  val bigNumberOfDonuts = 100000000L
  val smallNumberOfDonuts = 1
  val priceOfDonut = 2.50
  val donutPrice = 2.50f
  val donutStoreName = "Allaboutscala Donut Store"
  val donutByte = 0xa
  val donutFirstLetter = 'D'
  val nothing = ()

  println(s"Donuts Bought Today - no specified inference type = $donutsBoughtToday")
  println(s"Big Number Of Donuts - no specified inference type = $bigNumberOfDonuts")
  println(s"Small Number Of Donuts - no specified inference type = $smallNumberOfDonuts")
  println(s"Price Of Donut - no specified inference type = $priceOfDonut")
  println(s"Donut price - no specified inference type = $donutPrice")
  println(s"Donut Store - no specified inference type = $donutStoreName")
  println(s"Donut Byte - no specified inference type = $donutByte")
  println(s"Donut First Letter - no specified inference type = $donutFirstLetter")
  println(s"Nothing - no specified inference type = $nothing")

  println("\nStep 3: Using Scala compiler to convert from one data type to another")
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts

  //INT is larger than SHORT therefore no issues encountered
  println(s"Number of donuts - pre change of inference type SHORT = $numberOfDonuts")
  println(s"Minimum donuts to buy - post conversion of inference type INT = $minimumDonutsToBuy")

  println("\nStep 4: User driven conversion from one data type to another ")
  // NB: You cannot convert from an Int to a String
  // val minimumDonutsToSell: String = numberOfDonuts

  //Expected Error identfied due to expression of short doesn't conform to expected type string

  val minimumDonutsToSell: String = numberOfDonuts.toString()
  println(s"Minimum donuts to sell - converted not through inference but using toString to convert SHORT to String = $minimumDonutsToSell ")


}
