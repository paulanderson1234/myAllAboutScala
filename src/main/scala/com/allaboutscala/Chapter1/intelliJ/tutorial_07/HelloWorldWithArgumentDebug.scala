package com.allaboutscala.Chapter1.intelliJ.tutorial_07

/**
  * Created by paul on 04/01/18.
  */
object HelloWorldWithArgumentDebug extends App {

  override def main(args: Array[String]) = {

    println("Hello World With Arguments Debug")

    println("Command line arguments are: ")
    println(args.mkString(", "))

  }
}
