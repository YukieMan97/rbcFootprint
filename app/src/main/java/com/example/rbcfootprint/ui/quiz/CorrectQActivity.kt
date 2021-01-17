package com.example.rbcfootprint.ui.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.rbcfootprint.R
import com.example.rbcfootprint.ui.mainpage.MainPageActivity

class CorrectQActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_correct_ans2)

        // TODO direct to "are you sure?" layout
        val button = findViewById<ImageButton>(R.id.backButton)
        button.setOnClickListener {
            val intent = Intent(this, MainPageActivity::class.java)
            startActivity(intent)
        }
    }
}