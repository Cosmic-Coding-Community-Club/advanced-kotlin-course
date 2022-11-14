package com.cccc.advancedkotlincourse

import com.cccc.advancedkotlincourse.creations.Car
import com.cccc.advancedkotlincourse.creations.ChemicalElement
import com.cccc.advancedkotlincourse.creations.Tree

object Section3Constructors {
    
    // Create inside "creations" package a new class called "ChemicalElement" with next default constructor:
    // First parameter (only constructor parameter, not class property) named "symbol" type of String
    // Second parameter (only constructor parameter, not class property) named "atomicNumber" type of Int
    // Return one instance of new class in this function
    fun task1(): Any {
        return ChemicalElement("au", 79)
    }
    
    // Create inside "creations" package a new class called "Tree" with next default constructor:
    // First mutable property parameter named "type" type of String
    // Second immutable property parameter named "height" type of Int
    // Return one instance of new class in this function
    fun task2(): Any {
        return Tree("Palm", 19)
    }
    
    // Create inside "creations" packages a new class named "Car" with two constructors:
    // First constructor with immutable property parameter named "color" type of String
    // Secondary constructor with parameter named "price" type of float
    // Return one instance of this class using secondary constructor in this function
    fun task3(): Any {
        return Car("red", 5420.50f)
    }
}