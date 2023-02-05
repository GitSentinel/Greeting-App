package com.jacinthmahanta.greetingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var f_name:String
    lateinit var l_name:String
    lateinit var output:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name1 = findViewById<EditText>(R.id.fname)
        val name2 = findViewById<EditText>(R.id.lname)

    //    f_name=name1.toString()
    //    l_name=name2.toString()

        output=findViewById<TextView>(R.id.output)

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener{
            output.text="Hello "+name1.text.toString()+name2.text.toString()
        }

    }
}