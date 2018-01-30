package com.allaboutscala.Chapter4

/**
  * Created by paul on 18/01/18.
  */
package object four {

  //How to define a case class to represent a Donut object in a package object
  println("Step 2: How to define a case class to represent a Donut object in a package object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  //How to define an implicit class to augment or extend the Donut object with a uuid field
  println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
  implicit class AugmentedDonut(donut: Donut) {
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
  }

  //How to alias JodaTime to a DateTime type
  println("\nStep 4: How to alias JodaTime to a DateTime type")
  type DateTime = org.joda.time.DateTime

}
