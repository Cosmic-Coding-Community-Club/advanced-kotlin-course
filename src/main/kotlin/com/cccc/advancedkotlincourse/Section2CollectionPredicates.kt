package com.cccc.advancedkotlincourse

object Section2CollectionPredicates {
    
    private val numbers = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
    
    // Return the boolean result in this function if the list of numbers meets the condition:
    // Exists some number with value "two"
    fun task1() = numbers.any { it == "two" }
    
    // Return the boolean result in this function if the list of numbers meets the condition:
    // Not exists any number with value "eleven"
    fun task2() = numbers.none { it == "eleven" }
    
    // Return the boolean result in this function if the list of numbers meets the condition:
    // All elements are at least 3 characters long
    fun task3() = numbers.all { it.length >= 3 }
    
    // Return the boolean result in this function if the list of numbers meets the condition:
    // Exists some number with contains 'f' character
    fun task4() = numbers.any { it.contains("f") }
    
    // Return the boolean result in this function if the list of numbers meets the condition:
    // Not exists any number that has more than 10 characters
    fun task5() = numbers.none { it.length > 10 }
}