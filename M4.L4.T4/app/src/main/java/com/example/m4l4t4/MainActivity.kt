package com.example.m4l4t4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var tv_home:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        tv_home = findViewById<TextView>(R.id.detail1)
        val b_detailForObject = findViewById<Button>(R.id.button1)
        b_detailForObject.setOnClickListener {
            val user = User("Yahya Mahmudiy",18)
            openDetailActivity(user)
        }
    }

    var detaillauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()) { result ->
        if(result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            val text = data!!.getSerializableExtra("result")
            tv_home.text = text.toString()
        }
    }

    fun openDetailActivity(user:User){
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("user",user)
        detaillauncher.launch(intent)
    }
}