package com.example.iteradmin.returnfrom_intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t1=findViewById<TextView>(R.id.text)
        val button=findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val i=Intent(applicationContext,Main2Activity::class.java)
            startActivityForResult(i,100)
        }
    }
}
