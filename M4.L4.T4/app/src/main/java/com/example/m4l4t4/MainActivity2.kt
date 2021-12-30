package com.example.m4l4t4

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    val TAG = MainActivity2::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initViews()
    }

    fun backToFinsih(member:Member) {
        val returnIntent = Intent()//(this, MainActivity::class.java)
        returnIntent.putExtra("result",member)
        setResult(RESULT_OK,returnIntent)
        finish()
        //startActivity(returnIntent)
    }

    fun initViews(){
        var obj_detail = findViewById<TextView>(R.id.detail2)
        val b_btn = findViewById<Button>(R.id.button2)
        b_btn.setOnClickListener {
            val member = Member("Falonchi Pistonchi",20)
            backToFinsih(member)
        }

        var user = intent.getSerializableExtra("user")
        Log.d(TAG,user.toString())

        obj_detail.text = user.toString()
    }
}