package com.allaboutscala.Chapter2.fundamentals.whileAndDo

/**
  * Created by paul on 09/01/18.
  *
  * Note - within most functional programming languages it is not wise to use 'var' as it enters the realms of mutation
  * Where possible you should strive to use 'val' which are immutable
  *
  * In addition any use of loops should look to use Recursion to mitigate use of vars - See Chapter 10 (recursion) for example
  */
object WhileAndDoLoops extends App {

  println("Step 1: How to use while loop in Scala")
  var numberOfDonutsToBake = 10
  while (numberOfDonutsToBake > 0) {
    println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
    numberOfDonutsToBake -= 1
  }

  println("\nStep 2: How to use do while loop in Scala")
  var numberOfDonutsBaked = 0
  do {
    numberOfDonutsBaked += 1
    println(s"Number of donuts baked = $numberOfDonutsBaked")
  } while (numberOfDonutsBaked < 5)

}
