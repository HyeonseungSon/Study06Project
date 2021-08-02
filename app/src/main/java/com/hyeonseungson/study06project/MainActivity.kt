package com.hyeonseungson.study06project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        checkButton.setOnClickListener {


            val name : String? = nameText.text.toString()
            val age : Int? = ageText.text.toString().toInt()
            val contents : String? = contents.text.toString()

            Toast.makeText(this, "name : ${name}\nage : ${age}\ncontents : ${contents}", Toast.LENGTH_SHORT).show()
        }

        closeButton.setOnClickListener {
            System.exit(0);
        }

    }
}
