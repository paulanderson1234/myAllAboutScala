package com.allaboutscala.Chapter1.intelliJ.tutorial_06

/**
  * Created by paul on 04/01/18.
  */
object HelloWorldWithArguments extends App {

  override def main(args: Array[String]) = {


    println("Hello World With Arguments")

    println("Command line arguments are: ")
    println(args.mkString(", "))
  }
}
