package com.example.iteradmin.returnfrom_intent

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val i=intent
        i.putExtra("name","aamin")
        setResult(Activity.RESULT_OK,i)
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==100 && resultCode== Activity.RESULT_OK){
            val text=findViewById<TextView>(R.id.text)
            text.setText(data?.getStringArrayExtra("name"))
            Toast.makeText(applicationContext,"success",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(applicationContext,"failed",Toast.LENGTH_LONG).show()
        }
    }
}


