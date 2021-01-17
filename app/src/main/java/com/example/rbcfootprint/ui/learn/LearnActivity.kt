package com.example.rbcfootprint.ui.learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.rbcfootprint.R

class LearnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

        val button = findViewById<Button>(R.id.nextButton)
        button.setOnClickListener{
            val intent = Intent(this, SecondLearnActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.skipButton)
        button2.setOnClickListener{
            val intent = Intent(this, LearnActivity::class.java)
            startActivity(intent)
        }
    }
}