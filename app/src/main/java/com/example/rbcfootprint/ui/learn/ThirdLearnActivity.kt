package com.example.rbcfootprint.ui.learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.rbcfootprint.R
import com.example.rbcfootprint.ui.quiz.QuizTipActivity

class ThirdLearnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn3)


        val button = findViewById<Button>(R.id.startButton)
        button.setOnClickListener{
            val intent = Intent(this, QuizTipActivity::class.java)
            startActivity(intent)
        }
    }
}