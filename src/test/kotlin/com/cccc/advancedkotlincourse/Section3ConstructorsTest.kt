package com.cccc.advancedkotlincourse

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.reflect.full.memberProperties


class Section3ConstructorsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        val instanceToCheck = Section3Constructors.task1()
        assertThat(instanceToCheck)
            .isInstanceOf(Class.forName("com.cccc.advancedkotlincourse.creations.ChemicalElement"))
        assertThat(instanceToCheck.javaClass.kotlin.constructors).hasSize(1)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters).hasSize(2)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[0].type.classifier)
            .isEqualTo(String::class)
        assertThat(existsMember(instanceToCheck, "symbol")).isFalse
        assertThat(existsMember(instanceToCheck, "atomicNumber")).isFalse
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[1].type.classifier)
            .isEqualTo(Int::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        val instanceToCheck = Section3Constructors.task2()
        assertThat(instanceToCheck)
            .isInstanceOf(Class.forName("com.cccc.advancedkotlincourse.creations.Tree"))
        assertThat(instanceToCheck.javaClass.kotlin.constructors).hasSize(1)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters).hasSize(2)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[0].type.classifier)
            .isEqualTo(String::class)
        assertThat(instanceToCheck.javaClass.kotlin.memberProperties.first { it.name == "type" }.getter).isNotNull
        assertThat(instanceToCheck.javaClass.kotlin.memberProperties.first { it.name == "height" }.getter).isNotNull
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[1].type.classifier)
            .isEqualTo(Int::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        val instanceToCheck = Section3Constructors.task3()
        assertThat(instanceToCheck)
            .isInstanceOf(Class.forName("com.cccc.advancedkotlincourse.creations.Car"))
        assertThat(instanceToCheck.javaClass.kotlin.constructors).hasSize(2)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters).hasSize(2)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(1).parameters).hasSize(1)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[0].type.classifier)
            .isEqualTo(String::class)
        assertThat(existsMember(instanceToCheck, "color")).isTrue
        assertThat(existsMember(instanceToCheck, "price")).isFalse
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[1].type.classifier)
            .isEqualTo(Float::class)
    }
    
    private fun existsMember(instanceToCheck: Any, name: String): Boolean {
        return instanceToCheck.javaClass.kotlin
            .memberProperties
            .any { it.name == name }
    }
}