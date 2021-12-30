package com.example.m4l4t2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewsForObject()
    }

    fun initViewsForObject(){
        val b_detailForObject = findViewById<Button>(R.id.button2)
        b_detailForObject.setOnClickListener {
            val user = User("Yahya Mahmudiy",18)
            openDetailActivityforObject(user)
        }
    }
    fun openDetailActivityforObject(user:User){
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("user",user)
        startActivity(intent)
    }
}