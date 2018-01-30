package com.allaboutscala.Chapter7.mutableCollection

import scala.collection.mutable.PriorityQueue

/**
  * Created by paul on 25/01/18.
  */
object priorityQueue extends App {

  /**Note - a PriorityQueue is similar to a queue data structure except that elements added to the queue are associated with a priority. This priority is then used to determine which elements get dequeued or removed from the queue. **/

  //How to declare a case class to represent Donut object
  println("Step 1: How to declare a case class to represent Donut object")
  case class Donut(name: String, price: Double)

  //How to declare a function which defines the ordering of a PriorityQueue of Donut objects
  println("\nStep 2: How to declare a function which defines the ordering of a PriorityQueue of Donut objects")
  def donutOrder(d: Donut) = d.price

  //How to declare a function which defines the ordering of a PriorityQueue of Donut objects
  //Orders by lowest value element
  println("\nStep 2b: How to declare a function which defines the reverse ordering of a PriorityQueue of Donut objects")
  def donutReverseOrder(d: Donut): Double = -d.price

  //How to initialize a PriorityQueue of Donut objects and specify the Ordering
  println("\nStep 3: How to initialize a PriorityQueue of Donut objects and specify the Ordering")
  val priorityQueue1: PriorityQueue[Donut] = PriorityQueue(
    Donut("Plain Donut", 1.50),
    Donut("Strawberry Donut", 2.0),
    Donut("Chocolate Donut", 2.50))(Ordering.by(donutOrder))
  println(s"Elements of priorityQueue1 = $priorityQueue1")

  //How to initialize a PriorityQueue of Donut objects and specify the Ordering in reverse
  println("\nStep 3b: How to initialize a PriorityQueue of Donut objects and specify the Ordering in reverse")
  val priorityQueue2: PriorityQueue[Donut] = PriorityQueue(
    Donut("Chilli Donut", 1.50),
    Donut("Pepper Donut", 2.0),
    Donut("Basil Donut", 2.50))(Ordering.by(donutReverseOrder))
  println(s"Elements of priorityQueue2 = $priorityQueue2")

  //How to add an element to PriorityQueue using enqueue function
  println("\nStep 4: How to add an element to PriorityQueue using enqueue function")
  priorityQueue1.enqueue(Donut("Vanilla Donut", 1.0))
  println(s"Elements of priorityQueue1 after enqueue function is called = $priorityQueue1")

  //How to add an element to PriorityQueue using +=
  println("\nStep 5: How to add an element to PriorityQueue using +=")
  priorityQueue1 += Donut("Krispy Kreme Donut", 1.0)
  println(s"Elements of priorityQueue1 after enqueue function is called = $priorityQueue1")

  //How to remove an element from PriorityQueue using the dequeue function
  println("\nStep 6: How to remove an element from PriorityQueue using the dequeue function")
  println("Note - The donut element with the highest price in the queue was the first one that was removed")
  val donutDequeued: Donut = priorityQueue1.dequeue()
  println(s"Donut element dequeued = $donutDequeued")
  println(s"Elements of priorityQueue1 after dequeued function is called = $priorityQueue1")

  //How to remove an element from PriorityQueue using the dequeue function
  //uses different ordering method -d.price via priorityQueue2
  println("\nStep 6b: How to remove an element from PriorityQueue using the dequeue function")
  println("Note - The donut element with the lowest price in the queue was the first one that was removed")
  val donutDequeued2: Donut = priorityQueue2.dequeue()
  println(s"Donut element dequeued = $donutDequeued2")
  println(s"Elements of priorityQueue2 after dequeued function is called = $priorityQueue2")

  //How to initialize an empty PriorityQueue
  println("\nStep 7: How to initialize an empty PriorityQueue")
  val emptyPriorityQueue: PriorityQueue[String] = PriorityQueue.empty[String]
  println(s"Empty emptyPriorityQueue = $emptyPriorityQueue")

}
