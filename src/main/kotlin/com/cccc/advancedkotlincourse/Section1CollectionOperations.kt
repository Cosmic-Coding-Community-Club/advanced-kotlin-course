package com.cccc.advancedkotlincourse

object Section1CollectionOperations {
    
    private val users = getUserList()
    
    // NOTE: In these exercises just must use operators of collections
    // e.g.: .map   .filter   .foreach   .last    .first   ...
    
    
    // Returns a list of the pretty info text of each user with next style:
    // "id[1001] - John T. Brown 21yo (171.4) - 455, avenue High, Gallington - car[yes]"
    fun task1() = listOf<Any>()
    
    // Returns a list of users that have more than 30 years old
    fun task2() = listOf<Any>()
    
    // Returns a list of height of users
    fun task3() = listOf<Any>()
    
    // Returns a map with name as key and age as value
    fun task4() = mapOf<Any,Any>()
    
    // Returns a map with "name surname" as key and age as value
    fun task5() = mapOf<Any,Any>()
    
    // Returns the height sum rounded to integer of all user that have a car
    fun task6() = listOf<Any>()
    
    //Return the name length average rounded to integer of all users
    fun task7() = listOf<Any>()
    
    //Return map with address as key and entire user as value
    fun task8() = listOf<Any>()
    
    // Return two list of users: first list with the users that have car
    // and second list with users that not have car
    fun task9() = listOf<Any>()
    
    // Return a map with The user Counters of users have car and the users that not have car
    // and second list with users that not have car
    fun task10() = mapOf<Any,Any>()
    
    // Return the sum of age plus height of all users
    fun task11() = Any()
    
    
    data class User(
        val id: Long,
        val name: String,
        val surname: String,
        val age: Int,
        val address: String,
        val height: Float,
        val hasVehicle: Boolean
    )
    
    
    fun getUserList(): List<User> {
        return listOf(
            User(
                id = 1001,
                name = "John",
                surname = "T. Brown",
                age = 21,
                address = "455, avenue High, Gallington",
                height = 171.4f,
                hasVehicle = true
            ),
            User(
                id = 1002,
                name = "Mathew",
                surname = "G. Smith",
                age = 37,
                address = "12 1-1, street old caravan, Traxton",
                height = 173.45f,
                hasVehicle = false
            ),
            User(
                id = 1003,
                name = "Mark",
                surname = "J. Jones",
                age = 49,
                address = "745, street riverside, Blackstone",
                height = 184.2f,
                hasVehicle = true
            ),
            User(
                id = 1004,
                name = "Charlotte",
                surname = "Town Miller",
                age = 26,
                address = "mi 1.1, road to Kellis, Michantown",
                height = 167.5f,
                hasVehicle = true
            ),
            User(
                id = 1005,
                name = "Rose",
                surname = "X. Johnson",
                age = 35,
                address = "54 3-b, street middleTown, Hardstreet",
                height = 172.8f,
                hasVehicle = false
            ),
            User(
                id = 1006,
                name = "Michael",
                surname = "William Mcleod",
                age = 30,
                address = "2175, 5th avenue, NewVillage",
                height = 165.4f,
                hasVehicle = true
            )
        )
    }
}