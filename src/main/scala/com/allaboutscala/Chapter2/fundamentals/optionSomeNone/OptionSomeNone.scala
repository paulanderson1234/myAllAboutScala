package com.allaboutscala.Chapter2.fundamentals.optionSomeNone

/**
  * Created by paul on 09/01/18.
  */
object OptionSomeNone extends App {

  //May lead to NullPointerExceptions and should be discouraged

  println("Step 1: How to use Option and None - a basic example")
  val glazedDonutTaste: Option[String] = Some("Very Tasty")
  println(s"Glazed Donut taste = ${glazedDonutTaste.get}")

  //Use of None set for Option
  println("\nStep 2: How to use Option and None - a basic example")
  val glazedDonutName: Option[String] = None
  println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")

  //Using pattern matching with Option
  println("\nStep 3: How to use Pattern Matching with Option")
  glazedDonutName match {
    case Some(name) => println(s"Received donut name = $name")
    case None       => println(s"No donut name was found!")
  }

  //Tips
  println("\nTip 1: Filter None using map function")
  glazedDonutTaste.map(taste => println(s"glazedDonutTaste = $taste"))
  glazedDonutName.map(name => println(s"glazedDonutName = $name"))

  println("\nTip 1b: Filter None using map function with IntelliJ syntax correction")
  glazedDonutTaste.foreach(taste => println(s"glazedDonutTaste = $taste"))
  //glazedDonutName not printed as value is None
  glazedDonutName.foreach(name => println(s"glazedDonutName = $name"))

}
