package com.example.studyapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var intent1: Intent
    lateinit var intent2:Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setTitle("Main page")

        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)

        button.setOnClickListener {
             intent1=Intent(this,MainActivity2::class.java)
            startActivity(intent1)
        }

        button2.setOnClickListener {
             intent2=Intent(this,MainActivity3::class.java)
            startActivity(intent2)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> {
                 startActivity(intent1)
                return true
            }
            R.id.item2 -> {
                startActivity(intent2)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}