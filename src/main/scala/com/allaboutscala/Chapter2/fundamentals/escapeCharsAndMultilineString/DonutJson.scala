package com.allaboutscala.Chapter2.fundamentals.escapeCharsAndMultilineString

/**
  * Created by paul on 05/01/18.
  */
object DonutJson extends App {

  // compilation issue relating to use of double quotes
//    println("Step 1: How to escape a Json String")
//    val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"
//    println(s"donutJson = $donutJson")

    println("\nStep 2: Using backslash to escpae quotes")
    val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
    println(s"donutJson2 = $donutJson2")

    println("\nStep 3: Using triple quotes \"\"\" to escape characters")
    val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
    println(s"donutJson3 = $donutJson3")

    println("\nStep 4: Creating multi-line text using stripMargin")
    val donutJson4: String =
        """
          |{
          |"donut_name":"Glazed Donut",
          |"taste_level":"Very Tasty",
          |"price":2.50
          |}
          """
          .stripMargin
      println(s"donutJson4 = $donutJson4")

    println("\nTip: stripMargin using a different character")
    val donutJson5: String =
      """
        #{
        #"donut_name":"Glazed Donut",
        #"taste_level":"Very Tasty",
        #"price":2.50
        #}
      """ .stripMargin('#')
    println(s"donutJson5 = $donutJson5")


}
