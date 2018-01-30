package com.allaboutscala.Chapter6.immutableCollection

import scala.collection.immutable.Queue


/**
  * Created by paul on 23/01/18.
  */
object queue extends App {

  //How to initialize a Queue with 3 elements
  //The Queues elements are in First In First Out order (FIFO)
  println("Step 1: How to initialize a Queue with 3 elements")
  val queue1: Queue[String] = Queue("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of queue1 = $queue1")

  //How to access elements at specific index in a Queue
  println("\nStep 2: How to access elements at specific index in a Queue")
  println(s"Element at index 0 = ${queue1(0)}")
  println(s"Element at index 1 = ${queue1(1)}")
  println(s"Element at index 2 = ${queue1(2)}")

  //How to add elements in a Queue using :+
  println("\nStep 3: How to add elements in a Queue using :+")
  val queue2: Queue[String] = queue1 :+ "Glazed Donut"
  println(s"Elements of queue2 = $queue2")

  //How to add elements in Queue using enqueue function
  println("\nStep 4: How to add elements in Queue using enqueue function")
  val enqueue: Queue[String] = queue1.enqueue("Vanilla Donut")
  println(s"Enqueue element Vanilla Donut onto queue1 = $enqueue")

  //How to take the first element from the Queue using dequeue function

  //Calling dequeue returns a Tuple2 with the last element that was inserted to the Queue and the remaining elements of the queue
  println("\nStep 5: How to take the first element from the Queue using dequeue function")
  val dequeue: (String, Queue[String]) = queue1.dequeue
  println(s"First element dequeue = ${dequeue._1}")
  println(s"First element removed with output in form of queue = $dequeue")
  println(s"Remaining elements after dequeue - outputting Queue[String] = ${dequeue._2}")


  //How to add two Queues together using ++
  println("\nStep 6: How to add two Queues together using ++")
  val queue3: Queue[String] = queue1 ++ Queue[String]("Glazed Donut", "Vanilla Donut")
  println(s"Elements in queue3 = $queue3")

  //How to initialize an empty Queue
  println("\nStep 7: How to initialize an empty Queue")
  val emptyQueue: Queue[String] = Queue.empty[String]
  println(s"Empty Queue = $emptyQueue")

}
