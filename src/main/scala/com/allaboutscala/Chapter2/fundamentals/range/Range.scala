package com.allaboutscala.Chapter2.fundamentals.range

/**
  * Created by paul on 09/01/18.
  */
object Range extends App {

  //Original from tutorial
  println("Step 1: Create a simple numeric range from 1 to 5 inclusive")
  val from1To5orig = 1 to 5
  println(s"Range from 1 to 5 inclusive = $from1To5orig")

  //Original from tutorial using simple for loop
  println("Step 1b: simple for with range")
  for (i <- 1 to 5) println(i)

  //output val x as Range
  val x :Range = 1 to 5
  println("range defined as value x")
  println(x)

  //using filters to extract certain instances
  val rr = Seq(5,4,3,1,5)
  val ggggg = rr.filter(p => p > 3 && p < 5)
  println("filtering from original sequence to new value")
  println(ggggg)

  val zz = Seq("sip", "pop", "coin")
  val rrr = zz.filter(_.contains("p"))
  println("filtering with wildcards - contains 'p'")
  println(rrr)


  val tt = Seq("sip", "pop", "coin")
  val tttt = zz.filter(p => p.contains("p"))
  println("filtering with temp variable p - contains 'p'")
  println(tttt)

  // add a y
  val mapped = tttt.map(_ + "y")
  println("appending value to instance using map")
  println(mapped)


  val from1Untilpp5 = 1 until 5
  println(s"Range from 1 until 5 where 5 is excluded = $from1Untilpp5")

  println("Step 1: Create a simple numeric range from 1 to 5 inclusive as array")
  val from1To5 = (1 to 5).toArray
  println(from1To5.length)
  from1To5.foreach(println(_))

  println("Step 1: Create a simple numeric range from 1 to 5 inclusive as list")
  val from1To5List = (1 to 5).toList
  println(from1To5List.length)
  from1To5List.foreach(println(_))

  // Create a range from 10 to 20.
  // ... Step is 3 after each element.
  val range = 10.to(20).by(3)
  println(range)

  // Use toList to convert a range to a list.
  val list = range.toList
  println(list)


  println("\nStep 2: Create a numeric range from 1 to 5 but excluding the last integer number 5")
  val from1Until5 = 1 until 5
  println(s"Range from 1 until 5 where 5 is excluded = $from1Until5")

  println("\nStep 3: Create a numeric range from 0 to 10 but increment with multiples of 2")
  val from0To10By2 = 0 to 10 by 2
  println(s"Range from 0 to 10 with multiples of 2 = $from0To10By2")

  //Step 3 as a loop
  println("\nStep 3b: Create a numeric range from 0 to 10 but increment with multiples of 2 as a loop")
  for (from0To10By2loop <- 0 to 10 by 2)
  {println(s"Range from 0 to 10 with multiples of 2 = $from0To10By2loop")}

  println("\nStep 4: Create an alphabetical range to represent letter a to z")
  val alphabetRangeFromAToZ = 'a' to 'z'
  println(s"Range of alphabets from a to z = $alphabetRangeFromAToZ")

  println(s"\nStep 5: Character ranges with user specified increment as List")
  val alphabetRangeFromAToZBy2 = ('a' to 'z' by 2).toList
  println(s"List of every other alphabet = $alphabetRangeFromAToZBy2")

  println(s"\nStep 5b: Character ranges with user specified increment as Set")
  val alphabetRangeFromAToZBy2Set = ('a' to 'z' by 2).toSet
  println(s"Set of every other alphabet = $alphabetRangeFromAToZBy2Set")



  println("\nStep 6: Storing our ranges into collections")
  val listFrom1To5 = (1 to 5).toList
  println(s"Range to list = ${listFrom1To5.mkString(" ")}")

  val setFrom1To5 = (1 to 5).toSet
  println(s"Range to set = ${setFrom1To5.mkString(" ")}")

  val sequenceFrom1To5 = (1 to 5).toSeq
  println(s"Range to sequence = ${sequenceFrom1To5.mkString(" ")}")

  val arrayFrom1To5 = (1 to 5).toArray
  println(s"Range to array = `${arrayFrom1To5.mkString(" ")}")



  println("\nStep 6b: Storing our ranges into collections with delimiter other than space")
  val listFrom1To5Del = (1 to 5).toList
  println(s"Range to list = ${listFrom1To5Del.mkString("#")}")

  val setFrom1To5Del = (1 to 5).toSet
  println(s"Range to set = ${setFrom1To5Del.mkString("*")}")

  val sequenceFrom1To5Del = (1 to 5).toSeq
  println(s"Range to sequence = ${sequenceFrom1To5Del.mkString("|")}")

  val arrayFrom1To5Del = (1 to 5).toArray
  println(s"Range to array = `${arrayFrom1To5Del.mkString("/")}")


  println("\nStep 6c: Storing our ranges into collections using foreach")
  val listFrom1To5Fe = (1 to 5).toList
  listFrom1To5Fe.foreach(print(_))

  println()

  val setFrom1To5Fe = (1 to 5).toSet
  setFrom1To5Fe.foreach(print(_))

  println()

  val sequenceFrom1To5Fe = (1 to 5).toSeq
  sequenceFrom1To5Fe.mkString("#").foreach(print(_))

  println()

  val arrayFrom1To5Fe = (1 to 5).toArray
  arrayFrom1To5Fe.mkString(" ").foreach(print(_))

}
