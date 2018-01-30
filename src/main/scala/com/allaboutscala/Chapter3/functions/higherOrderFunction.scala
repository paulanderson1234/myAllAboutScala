package com.allaboutscala.Chapter3.functions

/**
  * Created by paul on 15/01/18.
  */
object higherOrderFunction extends App {

  //How to define a function with a callback parameter
  println("Step 1: How to define a function with a callback parameter")
  def printReport(sendEmailCallback: () => Unit) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback()
  }

  //How to call a function which has a callback parameter
  println("\nStep 2: How to call a function which has a callback parameter")
  printReport(() =>
    println("Sending email ... finished")
  )

  //How to call a function without providing its callback parameter
  println("\nStep 3: How to call a function without providing its callback parameter")

  // You will get compile time error
  // printReport()

  // Not that elegant
  printReport(() => {})

  //How to define a function with an Option callback
  println("\nStep 4: How to define a function Function with an Option callback")
  def printReportWithOptionCallback(sendEmailCallback: Option[() => Unit] = None) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback.map(callback => callback())
  }

  //How to call a function without providing its callback parameter
  println("\nStep 5: How to call a function without providing its callback parameter")
  // more elegant
  printReportWithOptionCallback()

  //How to call a function with Option callback parameter
  println("\nStep 6: How to call a function with Option callback parameter")
  printReportWithOptionCallback(Some(() =>
    println("Sending email wrapped in Some() ... finished")
  ))

}
