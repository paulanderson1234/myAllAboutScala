val numberOfDonuts = 2
val numberOfDonutsVal = 3

/*basic pattern matching principle*/

numberOfDonuts match{
  case 1 => "Just the one"
  case 2 => "For you and a friend?"
  case _ => "sorry - didn't catch that"

}

/*pattern matching with value*/

numberOfDonutsVal match{
  case value if value <2 => "Watching the weight today then?"
  case value if value >= 2 => "You have a craving for donuts"
  case _ => "value not defined"
}


/*pattern matching with a function*/

def aFunction(arg: Any): Any = {
  arg match {
    case value: Int if value <= 1 => value -1
    case value: Int => value +2
    case char: Char => char
    case _ => "Donuts"
  }
}


aFunction(0)
aFunction(4)
aFunction('D')
aFunction("donut")