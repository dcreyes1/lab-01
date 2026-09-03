package com.example.petshop

class Sad(date: String): Mood(date){
    override fun feeling(): String{
        return "frowning"
    }
}