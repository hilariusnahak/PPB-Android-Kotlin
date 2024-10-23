package com.dicoding.kotlin

fun main() {

    // STRING

    /*val text = "Kotlin"
    val firstChar = text[0]

    print("First Character of $text is $firstChar")*/

  /*  val text = "Kotlin"
    for (char in text){
        print("$char ")
    }*/

    // Escaped String
    /*val statement = "Kotlin is \"Awesome!\"" // \”: menambah karakter double quote kedalam teks.
    val statement1 = "Kotlin is \tAwesome!" // \t: menambah tab ke dalam teks.
    val statement2 = "Kotlin is \nAwesome!" // \n: membuat baris baru di dalam teks.
    val statement3 = "Kotlin is \'Awesome!" // \’: menambah karakter single quote kedalam teks.
    val statement4 = "Kotlin is \\Awesome!" // \\: menambah karakter backslash kedalam teks.
    println(statement)
    println(statement1)
    println(statement2)
    println(statement3)
    println(statement4)*/

    /*val name = "Unicode test: \u00A9"
    print(name)*/

    // Raw String
/*    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)*/


    // FUNCTIONS
    fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
}
