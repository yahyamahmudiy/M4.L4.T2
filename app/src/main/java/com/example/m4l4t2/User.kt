package com.example.m4l4t2

import java.io.Serializable

class User(var name:String,var age:Int): Serializable {
    override fun toString(): String {
        return "Name = $name,\n" +
                "Age = $age"
    }
}