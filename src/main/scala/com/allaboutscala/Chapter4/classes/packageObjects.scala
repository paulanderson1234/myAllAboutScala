package com.allaboutscala.Chapter4.classes

import com.allaboutscala.Chapter4.four.{DateTime, Donut}

/**
  * Created by paul on 17/01/18.
  */
object packageObjects extends App {

  //How to add JodaTime dependency in build.sbt
  println("\nStep 1: How to add JodaTime dependency in build.sbt")
    //  libraryDependencies ++= Seq(
    //    "joda-time" % "joda-time" % "2.9.3",
    //    "org.joda" % "joda-convert" % "1.8"
    //  )

  //How to define a case class to represent a Donut object in a package object
  //Before we can declare a case class inside a Package Object you must first create it! In IntelliJ's Project window, right click on a given package which in our case is the package named four and select New-> Package Object.

  //Created under Chapter4 - four

  //How to create instances or objects for the Donut case class from package object
  //Package Object created, we can now create a new Scala Application named PackageObject_Tutorial and instantiate a Donut object without having to add any import statements.

  println("\nStep 5: How to create instances or objects for the Donut case class from package object")
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  println(s"Vanilla donut name = ${vanillaDonut.name}")
  println(s"Vanilla donut price = ${vanillaDonut.price}")
  println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")
  println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")

  //How to create new JodaTime instance using DateTime alias from package object
  println("\nStep 6: How to create new JodaTime instance using DateTime alias from package object")
  val today = new DateTime()
  println(s"today = $today, datetime class = ${today.getClass}")




}
