package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 01/02/18.
  */
object zip extends App {

  /* Note - zip is used to take elements from 2 separate collections and pair them up in a new collection
   */

  //How to initialize a List of donuts
  println("\nStep 1: How to initialize Lists of donuts")
  val donutsSavoury: Seq[String] = List("Bacon Donut", "Cheese Donut", "Ham Donut", "Egg Donut")
  val donutsSweet: Seq[String] = List("Maple Donut", "Honey Donut", "Treacle Donut", "Iced Donut")
  println(s"Elements of donutsSavoury = $donutsSavoury")
  println(s"Elements of donutsSweet = $donutsSweet")

  //How to pair the elements from each List using the zip function
  println("\nStep 2: How to pair Lists of donuts using zip function - donutsSavourySweet")
  val donutsSavourySweet = donutsSavoury zip donutsSweet
  println(s"Paired up donuts = $donutsSavourySweet")

  //How to pair the elements from each List using the zip function
  println("\nStep 3: How to pair Lists of donuts using zip function - donutsSweetSavoury")
  val donutsSweetSavoury = donutsSweet zip donutsSavoury
  println(s"Paired up donuts = $donutsSweetSavoury")

}


