package com.example.rbcfootprint.ui.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.rbcfootprint.R
import com.example.rbcfootprint.ui.learn.ItemAdapter
import com.example.rbcfootprint.ui.learn.LearnActivity
import com.example.rbcfootprint.ui.mainpage.MainPageActivity

class QuizTipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_tip)

        val button = findViewById<Button>(R.id.nextButton)
        button.setOnClickListener{
            val intent = Intent(this, ItemAdapter::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<ImageButton>(R.id.backButton)
        button2.setOnClickListener{
            val intent = Intent(this, MainPageActivity::class.java)
            startActivity(intent)
        }
    }
}