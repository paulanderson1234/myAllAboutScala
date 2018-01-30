package com.allaboutscala.Chapter4.classes

/**
  * Created by paul on 17/01/18.
  */
object implicitClass extends App {

  //How to define a case class to represent a Donut object
  println("Step 1: How to define a case class to represent a Donut object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  //How to create instances or objects for the Donut case class
  println("\nStep 2: How to create instances or objects for the Donut case class")
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  println(s"Vanilla donut name = ${vanillaDonut.name}")
  println(s"Vanilla donut price = ${vanillaDonut.price}")
  println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")

  //How to define an implicit class to augment or extend the Donut object with a uuid field
  println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
  object DonutImplicits {
    implicit class AugmentedDonut(donut: Donut) {
      //In real life you probably would not hardcode the uuid value using donut.productCode.getOrElse(12345)
      def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
    }
  }

  //How to import and use the implicit class AugmentedDonut from Step 3
  println("\nStep 4: How to import and use the implicit class AugmentedDonut from Step 3")
  //The vanilla donut object now has access the uuid method - also known as the extension method
  import DonutImplicits._
  println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")

}
