package com.allaboutscala.Chapter2.fundamentals.variableAndTypes

/**
  * Created by paul on 09/01/18.
  */
object VariablesAndTypes extends App {

  //immutable variables
  val donutsToBuy: Int = 5

  //will not compile resulting in reassignment to variable error
  //  donutsToBuy = 10

  //mutabe variables
  var favoriteDonut: String = "Glazed Donut"
  favoriteDonut = "Vanilla Donut"

  //lazy initialisation
  lazy val donutService = "initialize some donut service"

  //supported types
  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()

  //Delare variable with no initialisation
  var leastFavoriteDonut: String = _
  leastFavoriteDonut = "Plain Donut"



}
