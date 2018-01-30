package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 12/01/18.
  */
object createTypedFunction extends App {

  //How to define a function which takes a String parameter
  println("Step 1: How to define a function which takes a String parameter")
  def applyDiscount(couponCode: String) {
    println(s"Lookup percentage discount in database for $couponCode")
  }

  //How to define a function which takes a parameter of type Double
  println("\nStep 2: How to define a function which takes a parameter of type Double")
  def applyDiscount(percentageDiscount: Double) {
    println(s"$percentageDiscount discount will be applied")
  }

  //Calling applyDiscount function with String or Double parameter types
  println("\nStep 3: Calling applyDiscount function with String or Double parameter types")
  applyDiscount("COUPON_1234")
  applyDiscount(10)

  //How to define a generic typed function which will specify the type of its parameter
  println("\nStep 4: How to define a generic typed function which will specify the type of its parameter")
  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")

      case d: Double =>
        println(s"$d discount will be applied")

      case _ =>
        println("Unsupported discount type")
    }
  }

  //How to call a function which has typed parameters
  println("\nStep 5: How to call a function which has typed parameters")
  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](10)

  //calling function with unspecified parameter
  //How to call a function which has typed parameters
  println("\nStep 5b: Calling a function which has unspecified typed parameters - INT")
  applyDiscount[String]("COUPON_123")
  applyDiscount[Int](10)



}
