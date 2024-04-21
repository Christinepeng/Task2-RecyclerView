package com.example.task2

import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel() {
    private val userList: List<User> = listOf(
        User("Alice", 25),
        User("Bob", 30),
        User("Charlie", 28),
        User("David", 33),
        User("Emily", 27),
        User("Frank", 35),
        User("Grace", 32),
        User("Henry", 29),
        User("Ivy", 31),
        User("Jack", 26),
        User("Kate", 34),
        User("Leo", 28),
        User("Mia", 30),
        User("Noah", 29),
        User("Olivia", 26),
        User("Peter", 32),
        User("Quinn", 31),
        User("Ryan", 27),
        User("Sophia", 33),
        User("Thomas", 28),
        User("Uma", 30),
        User("Vincent", 25),
        User("Wendy", 29),
        User("Xander", 34),
        User("Yvonne", 31),
        User("Zack", 27),
        User("Aaron", 32),
        User("Bella", 26),
        User("Caleb", 29),
        User("Diana", 33),
        User("Ethan", 28),
        User("Fiona", 30),
        User("George", 31),
        User("Hannah", 27),
        User("Ian", 34),
        User("Jasmine", 29),
        User("Kevin", 25),
        User("Lily", 31),
        User("Michael", 28),
        User("Natalie", 30),
        User("Oscar", 26),
        User("Paige", 32),
        User("Quincy", 27),
        User("Rachel", 33),
        User("Samuel", 29),
        User("Tina", 31),
        User("Uriel", 28),
        User("Violet", 30),
        User("William", 26),
        User("Xena", 32),
        User("Yara", 27),
        User("Zoe", 34)
    )

    fun getUsers(): List<User> {
        return userList
    }
}