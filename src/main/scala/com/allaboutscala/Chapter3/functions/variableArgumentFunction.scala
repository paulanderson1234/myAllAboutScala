package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 12/01/18.
  */
object variableArgumentFunction extends App {

  //How to define function which takes variable number of arguments
  def printReport(names: String*) {
    println(s"""Donut Report = ${names.mkString(", ")}""")
  }

  //How to call function which takes variable number of String arguments
  println("\nStep 2: How to call function which takes variable number of String arguments")
  printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport("Chocolate Donut")

  //How to pass a List to a function with variable number of arguments
  println("\nStep 3: How to pass a List to a function with variable number of arguments")
  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  //Compilation errors if you try and print report with syntax below
  //printReport(listDonuts)


  //you will need to use a special syntax called type ascription as follows
  printReport(listDonuts: _*)

  //How to pass a Sequence to a function with variable number of arguments
  println("\nStep 4: How to pass a Sequence to a function with variable number of arguments")
  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")
  printReport(seqDonuts: _*)

  //How to pass an Array to a function with variable number of arguments
  println("\nStep 5: How to pass an Array to a function with variable number of arguments")
  val arrDonuts: Array[String] = Array("Coconut Donut")

  //Calling printReport() function by passing it the arrDonuts value which is a Array of type String will give you a compiler error!
  //  printReport(arrDonuts)

  //correcting by using type ascription
  printReport(arrDonuts: _*)

}
