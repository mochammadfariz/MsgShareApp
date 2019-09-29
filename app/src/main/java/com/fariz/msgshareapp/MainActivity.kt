package com.fariz.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()
        }

        btnNextAct.setOnClickListener {
            val message : String = getMessage.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        }
    }
}
