package com.example.petshop

class Happy(date: String): Mood(date){
    override fun feeling(): String{
        return "smiling"
    }
}