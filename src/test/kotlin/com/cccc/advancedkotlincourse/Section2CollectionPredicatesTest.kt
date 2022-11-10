package com.cccc.advancedkotlincourse

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section2CollectionPredicatesTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section2CollectionPredicates.task1()).isTrue
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section2CollectionPredicates.task2()).isTrue
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section2CollectionPredicates.task3()).isTrue
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section2CollectionPredicates.task4()).isTrue
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section2CollectionPredicates.task5()).isTrue
    }
}