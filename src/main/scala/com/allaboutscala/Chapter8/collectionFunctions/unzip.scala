package com.allaboutscala.Chapter8.collectionFunctions

/**
  * Created by paul on 01/02/18.
  */
object unzip extends App {

   /* Note - unzip is used to take sequence of Tuple2 values and create 2 resulting lists

   The first list should contain the first element of each Tuple
   The second list should contain the second element from each tuple

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
  println(s"Paired up donuts (Savoury/Sweet) = $donutsSavourySweet")

  //How to pair the elements from each List using the zip function
  println("\nStep 3: How to pair Lists of donuts using zip function - donutsSweetSavoury")
  val donutsSweetSavoury = donutsSweet zip donutsSavoury
  println(s"Paired up donuts (Sweet/Savoury) = $donutsSweetSavoury")

  //How to unzip the collection List created on Step 2
  println("\nStep 4: How to unzip List of donutsSavourySweet using unzip function")
  val donutsSavourySweetUnzip = donutsSavourySweet.unzip
  println(s"Unzipped donutsSavourySweet back into 2 Lists = $donutsSavourySweetUnzip")

  //How to unzip the collection List created on Step 3
  println("\nStep 5: How to unzip List of donutsSweetSavoury using unzip function")
  val donutsSweetSavouryUnzip = donutsSweetSavoury.unzip
  println(s"Unzipped donutsSweetSavoury back into 2 Lists= $donutsSweetSavouryUnzip")

}
