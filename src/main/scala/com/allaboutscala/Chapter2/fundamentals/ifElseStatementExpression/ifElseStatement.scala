package com.allaboutscala.Chapter2.fundamentals.ifElseStatementExpression

/**
  * Created by paul on 08/01/18.
  */
object ifElseStatement extends App {

  override def main(args: Array[String]) = {

    println("Step 1: Using if clause as a statement")
    val numberOfPeople = 20
    val numberOfPeopleTest2 = 9
    val numberOfPeopleTest3 = 0
    val donutsPerPerson = 2

    if (numberOfPeople > 10)
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")

    println(s"\nStep 2: Using if and else clause as a statement")
    val defaultDonutsToBuy = 8

    if (numberOfPeopleTest2 > 10)
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    else
      println(s"Number of donuts to buy = $defaultDonutsToBuy")

    println("\nStep 3: Using if, else if, and else clause as a statement")
    if (numberOfPeopleTest3 > 10) {
      println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
    } else if (numberOfPeopleTest3 == 0) {
      println("Number of people is zero.")
      println("No need to buy donuts.")
    } else {
      println(s"Number of donuts to buy = $defaultDonutsToBuy")
    }

    println("\nStep 4: Using if and else clause as expression")
    val numberOfDonutsToBuy = if (numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
    println(s"Number of donuts to buy = $numberOfDonutsToBuy")

  }
}
