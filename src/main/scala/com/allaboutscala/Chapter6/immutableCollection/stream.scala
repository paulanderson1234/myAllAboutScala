package com.allaboutscala.Chapter6.immutableCollection


import scala.collection.immutable.Stream.cons

/**
  * Created by paul on 24/01/18.
  */
object stream extends App {

  /**Note -Stream is a similar data structure to a list except that the elements of the Stream will be lazily computer. As a result, you can have infinitely long Streams!**/

  //How to create a Stream with 3 numbers using #::
  /**Note - When we tried to print the elements of the Stream, only the first element of the Stream was printed!
  As mentioned earlier, the elements of Streams are lazily computed**/
  println("Step 1: How to create a Stream with 3 numbers using #::")
  val stream1: Stream[Int] = 1 #:: 2 #:: 3 #:: Stream.empty
  println(s"Elements of stream1 = $stream1")

  //How to create a Stream with 3 numbers using Stream.cons
  /**only the first element of the Stream was printed.
  Stream.cons is commonly known and referred to as the cons operator**/
  println("\nStep 2: How to create a Stream with 3 numbers using Stream.cons")
  val stream2: Stream[Int] = cons(1, cons(2, cons(3, Stream.empty) ) )
  println(s"Elements of stream2 = ${stream2}")

  //How to print all 3 numbers from stream2 using the take function
  /**When we tried to take 10 numbers from the Stream, although it only contained 3 elements, it did not throw any IndexOutOfBoundsException**/

  println("\nStep 3: How to print all 3 numbers from stream2 using the take function")
  print("Take first 3 numbers from stream2 = ")
  stream2.take(3).print

  print("\nTake first 10 numbers from stream2 = ")
  stream2.take(10).print

  //How to define an infinite Stream of numbers using Stream.cons
  println("\n\nStep 4: How to define an infinite Stream of numbers using Stream.cons")
  def inifiniteNumberStream(number: Int): Stream[Int] = Stream.cons(number, inifiniteNumberStream(number + 1))
  print("Take only the first 20 numbers from the infinite number stream = ")
  inifiniteNumberStream(1).take(20).print

  //How to define an infinite stream of numbers using Stream.from
  println("\n\nStep 5: How to define an infinite stream of numbers using Stream.from")
  val stream3: Stream[Int] = Stream.from(1)
  print("Take only the first 20 numbers from the infinite number stream = ")
  stream3.take(20).print

  //How to initialize an empty Stream
  println("\n\nStep 6: How to initialize an empty Stream")
  val emptyStream: Stream[Int] = Stream.empty[Int]
  println(s"Empty Stream = $emptyStream")


}
