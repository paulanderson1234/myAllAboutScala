package com.allaboutscala.Chapter6.immutableCollection

import scala.collection.immutable.Stack

/**
  * Created by paul on 24/01/18.
  */
object stack extends App {

  /**Note  - allows further operations such as push new elements to the top of the Stack and remove or pop elements from the Stack
  IFO (Last In First Out) semantics**/

  /** NOTE - Symbol Stack is deprecated. Stack is an inelegant and potentially poorly-performing wrapper around List. Use List instead: stack push x becomes x :: list; stack.pop is list.tail. **/

  //How to initialize Stack with 3 elements
  println("Step 1: How to initialize Stack with 3 elements")
  val stack1: Stack[String] = Stack("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of stack1 = $stack1")

  //How to initialize a Stack using an Immutable List
  println("\nStep 2: How to initialize a Stack using an Immutable List")
  val stack2: List[String] = List("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Using an Immutable List for stack, elements are = $stack2")

  //Push one element at the top of the stack using :: of Immutable List
  println("\nStep 3: Push one element at the top of the stack using :: of Immutable List")
  val stack3: List[String] = "Vanilla Donut" :: stack2
  println(s"Using an Immutable List for stack, elements after push = $stack3")

  //Push N elements at the top of the stack using :: of Immutable List
  println("\nStep 4: Push N elements at the top of the stack using :: of Immutable List")
  println("Note - pushed in the order provided")
  val stack4: List[String] = "Glazed Donut" :: "Vanilla Donut" :: stack2
  println(s"Using an Immutable List for stack, elements after pushing N elements = $stack4")

  //Push N elements at the top of the stack using :: of Immutable List
  println("\nStep 4b: Push N elements at the top of the stack using :: of Immutable List")
  println("Note - pushed in the order provided")
  val stack5: List[String] = "Vanilla Donut" :: "Glazed Donut" :: stack2
  println(s"Using an Immutable List for stack, elements after pushing N elements = $stack5")

  //Pop element from the Stack using tail function of Immutable List
  println("\nStep 5: Pop element from the Stack using tail function of Immutable List")
  println("This method returns a list consisting of all elements except the first")
  val stack6: List[String] = stack2.tail
  println(s"Using an Immutable List for stack, elements after tail function to simulate Stack pop = $stack6")

  //Pop element from the Stack using tail function of Immutable List
  println("\nStep 5b: Pop element from the Stack using head function of Immutable List")
  println("This method returns a list consisting of the first element in the list")
  val stack7 = stack2.head
  println(s"Using an Immutable List for stack, elements after tail function to simulate Stack pop = $stack7")

  //How to initialize an empty Stack using Immutable List
  println("\nStep 6: How to initialize an empty Stack using Immutable List")
  val emptyStack: List[String] = List.empty[String]
  println(s"Using an Immutable List for stack, the empty stack = $emptyStack")

}
