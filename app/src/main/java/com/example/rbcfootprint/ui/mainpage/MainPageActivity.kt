package com.example.rbcfootprint.ui.mainpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.rbcfootprint.R
import com.example.rbcfootprint.ui.learn.LearnActivity

class MainPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.learn)
        button.setOnClickListener{
            val intent = Intent(this, LearnActivity::class.java)
            startActivity(intent)
        }
    }


}