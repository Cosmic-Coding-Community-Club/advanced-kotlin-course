package com.cccc.advancedkotlincourse

object Section1CollectionOperations {
    
    private val users = getUserList()
    
    // NOTE: In these exercises using always operators of collections
    // Also use only "users" to do these exercises
    // e.g.: .map   .filter   .foreach   .last    .first   ...
    
    
    // Return first user of list
    fun task1() = users
        .first()
    
    // Return first user of list that contains the Smith surname
    fun task2() = users
        .first { it.surname.contains("Smith") }
    
    // Return last user of list
    fun task3() = users
        .last()
    
    // Return three first users of list
    fun task4() = users
        .take(3)
    
    // Return 3 lists with users grouping in pairs in order of original list
    fun task5() = users
        .chunked(2)
    
    // Returns a list of users that have more than 30 years old
    fun task6() = users
        .filter { it.age > 30 }
        .toList()
    
    // Returns a list of the pretty info text of each user with next style:
    // "id[1001] - John T. Brown 21yo (171.4) - 455, avenue High, Gallington - car[yes]"
    fun task7() = users.map {
        "id[${it.id}] - ${it.name} ${it.surname} ${it.age}yo (${it.height}) " +
            "- ${it.address} - car[${if (it.hasVehicle) "yes" else "no"}]"
    }.toList()
    
    // Returns a list of height of users
    fun task8() = users
        .map { it.height }
        .toList()
    
    // Returns a map with name as key and age as value
    fun task9() = users
        .associateBy({ it.name }, { it.age })
    
    // Returns a map with "name surname" as key and age as value
    fun task10() = users
        .associateBy({ "${it.name} ${it.surname}" }, { it.age })
    
    // Returns the height sum rounded to integer of all user that have a car
    fun task11() = users
        .filter { it.hasVehicle }
        .sumOf { it.height.toDouble() }
        .toInt()
    
    //Return the name length average rounded to integer of all users
    fun task12() = users
        .map { it.name.length }
        .average().toInt()
    
    //Return the max age of users list
    fun task13() = users
        .maxOf { it.age }
    
    //Return map with address as key and entire user as value
    fun task14() = users
        .associateBy { it.address }
    
    // Return two list of users: first list with the users that have car
    // and second list with users that not have car
    fun task15() = users
        .partition { it.hasVehicle }
    
    // Return a map with The user Counters of users have car and the users that not have car
    // and second list with users that not have car
    fun task16() = users
        .groupingBy { it.hasVehicle }.eachCount()
    
    // Return the sum of age plus height of all users
    fun task17() = users
        .fold(0) { _, user -> (user.age + user.height).toInt() }
    
    //return all users list ordered by age ascending
    fun task18() = users
        .sortedBy { it.age }
    
    //return all users list ordered by height descending
    fun task19() = users
        .sortedByDescending { it.height }
    
    
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