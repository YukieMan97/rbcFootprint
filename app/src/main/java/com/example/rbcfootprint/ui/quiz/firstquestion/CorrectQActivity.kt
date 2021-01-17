package com.example.rbcfootprint.ui.quiz.firstquestion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.rbcfootprint.R
import com.example.rbcfootprint.ui.learn.ItemAdapter
import com.example.rbcfootprint.ui.mainpage.MainPageActivity

class CorrectQActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_correct_ans2)

        val button = findViewById<Button>(R.id.backButton)
        button.setOnClickListener {
            val intent = Intent(this, ItemAdapter::class.java)
            startActivity(intent)
        }
    }
}