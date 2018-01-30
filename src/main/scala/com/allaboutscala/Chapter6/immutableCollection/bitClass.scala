package com.allaboutscala.Chapter6.immutableCollection

import scala.collection.immutable.BitSet

/**
  * Created by paul on 24/01/18.
  */
object bitClass extends App {

  /**Note - BitSet also allows you to store unique elements with no repeatable values
  BitSet represents a collection of small integers as the bits of a larger integer.**/

  //How to initialize a BitSet with 3 elements
  println("Step 1: How to initialize a BitSet with 3 elements")
  val bitSet1: BitSet = BitSet(3, 2, 0)
  println(s"Elements of bitSet1 = $bitSet1")

  //How to check specific elements in BitSet
  println("\nStep 2: How to check specific elements in BitSet - returns true")
  println(s"Element 0 = ${bitSet1(0)}")
  println(s"Element 2 = ${bitSet1(2)}")
  println(s"Element 3 = ${bitSet1(3)}")

  //How to check specific elements NOT in BitSet
  println("\nStep 2: How to check specific elements NOT in BitSet - returns false")
  println(s"Element 4 = ${bitSet1(4)}")

  //How to add elements in BitSet using +
  println("\nStep 3: How to add elements in BitSet using +")
  println("Note - only distinct entries are added - ordered numerically")
  val bitSet2: BitSet = bitSet1 + 13 + 13
  println(s"Adding elements to BitSet using + = $bitSet2")
  // NOTE: we only have one 13 element and not two as BitSet is distinct

  //How to add two BitSets together using ++
  println("\nStep 4: How to add two BitSets together using ++")
  val bitSet3: BitSet = bitSet1 ++ BitSet(13, 14, 15, 16, 17)
  println(s"Add two BitSets together using ++ = $bitSet3")

  //How to remove element in BitSet using -
  println("\nStep 5: How to remove element in BitSet using -")
  val bitSet4: BitSet = bitSet1 - 0
  println(s"BitSet without element 0 = $bitSet4")

  //How to find the intersection between two BitSets using &
  println("\nStep 6: How to find the intersection between two BitSets using &")
  println("Note - finds common elements in both sets and returns in numerical order")
  val bitSet5: BitSet = BitSet(0, 2, 4)
  println(s"Intersection of bitSet1 and bitSet5 = ${bitSet1 & bitSet5}")

  //How to find the difference between two BitSets using &~
  println("\nStep 7: How to find the difference between two BitSets using &~")
  println("Note - finds elements from Set1 that do not exist in Set5")
  println(s"Difference of bitSet1 and bitSet5 = ${bitSet1 &~ bitSet5}")

  //How to find the difference between two BitSets using &~
  println("\nStep 7b: How to find the difference between two BitSets using &~")
  println("Note - finds elements from Set5 that do not exist in Set1")
  println(s"Difference of bitSet5 and bitSet1 = ${bitSet5 &~ bitSet1}")

  //How to initialize an empty BitSet
  println("\nStep 8: How to initialize an empty BitSet")
  val emptyBitSet: BitSet = BitSet.empty
  println(s"Empty BitSet = $emptyBitSet")

}
