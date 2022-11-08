package com.cccc.advancedkotlincourse

import com.cccc.advancedkotlincourse.Section1CollectionOperations.getUserList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section1CollectionOperationsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section1CollectionOperations.task1())
            .isEqualTo(getUserById(1001))
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section1CollectionOperations.task2())
            .isEqualTo(getUserById(1002))
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section1CollectionOperations.task3())
            .isEqualTo(getUserById(1006))
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section1CollectionOperations.task4())
            .contains(getUserById(1001), getUserById(1002), getUserById(1003))
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section1CollectionOperations.task5())
            .isEqualTo(
                listOf(
                    listOf(getUserById(1001), getUserById(1002)),
                    listOf(getUserById(1003), getUserById(1004)),
                    listOf(getUserById(1005), getUserById(1006))
                )
            )
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        assertThat(Section1CollectionOperations.task6())
            .hasSize(3)
            .containsAll(listOf(getUserById(1002), getUserById(1003), getUserById(1005)))
    }
    
    
    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        assertThat(Section1CollectionOperations.task7())
            .hasSize(6)
            .contains(
                "id[1001] - John T. Brown 21yo (171.4) - 455, avenue High, Gallington - car[yes]",
                "id[1002] - Mathew G. Smith 37yo (173.45) - 12 1-1, street old caravan, Traxton - car[no]",
                "id[1003] - Mark J. Jones 49yo (184.2) - 745, street riverside, Blackstone - car[yes]",
                "id[1004] - Charlotte Town Miller 26yo (167.5) - mi 1.1, road to Kellis, Michantown - car[yes]",
                "id[1005] - Rose X. Johnson 35yo (172.8) - 54 3-b, street middleTown, Hardstreet - car[no]",
                "id[1006] - Michael William Mcleod 30yo (165.4) - 2175, 5th avenue, NewVillage - car[yes]",
            )
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask8() {
        assertThat(Section1CollectionOperations.task8())
            .hasSize(6)
            .containsAll(listOf(171.4f, 173.45f, 184.2f, 167.5f, 167.5f, 165.4f))
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask9() {
        assertThat(Section1CollectionOperations.task9())
            .hasSize(6)
            .containsEntry("John", 21)
            .containsEntry("Mathew", 37)
            .containsEntry("Mark", 49)
            .containsEntry("Charlotte", 26)
            .containsEntry("Rose", 35)
            .containsEntry("Michael", 30)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask10() {
        assertThat(Section1CollectionOperations.task10())
            .hasSize(6)
            .containsEntry("John T. Brown", 21)
            .containsEntry("Mathew G. Smith", 37)
            .containsEntry("Mark J. Jones", 49)
            .containsEntry("Charlotte Town Miller", 26)
            .containsEntry("Rose X. Johnson", 35)
            .containsEntry("Michael William Mcleod", 30)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask11() {
        assertThat(Section1CollectionOperations.task11())
            .isEqualTo((171.4f + 184.2f + 167.5f + 165.4f).toInt())
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask12() {
        assertThat(Section1CollectionOperations.task12())
            .isEqualTo(5)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask13() {
        assertThat(Section1CollectionOperations.task13())
            .isEqualTo(49)
    }
    
    
    @Test
    fun shouldReturnGreenWhenCheckTask14() {
        assertThat(Section1CollectionOperations.task14())
            .isEqualTo(getUserList().associateBy { it.address })
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask15() {
        assertThat(Section1CollectionOperations.task15())
            .isEqualTo(
                Pair(
                    listOf(
                        getUserById(1001), getUserById(1003),
                        getUserById(1004), getUserById(1006)
                    ),
                    listOf(getUserById(1002), getUserById(1005))
                )
            )
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask16() {
        assertThat(Section1CollectionOperations.task16())
            .hasSize(2)
            .containsEntry(false, 2)
            .containsEntry(true, 4)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask17() {
        assertThat(Section1CollectionOperations.task17())
            .isEqualTo(195)
        
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask18() {
        assertThat(Section1CollectionOperations.task18())
            .containsSequence(
                listOf(
                    getUserById(1001), getUserById(1004),
                    getUserById(1006), getUserById(1005),
                    getUserById(1002), getUserById(1003)
                )
            )
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask19() {
        assertThat(Section1CollectionOperations.task19())
            .containsSequence(
                listOf(
                    getUserById(1003), getUserById(1002),
                    getUserById(1005), getUserById(1001),
                    getUserById(1004), getUserById(1006)
                )
            )
    }
    
    private fun getUserById(userId: Long) = getUserList()
        .first { userId == it.id }
}