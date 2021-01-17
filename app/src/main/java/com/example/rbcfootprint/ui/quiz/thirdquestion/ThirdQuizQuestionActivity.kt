package com.example.rbcfootprint.ui.quiz.thirdquestion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.rbcfootprint.R

class ThirdQuizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question3)

        // potential answers
        val answer1 = findViewById<Button>(R.id.answer1)
        val answer2 = findViewById<Button>(R.id.answer2)
        val answer3 = findViewById<Button>(R.id.answer3)
        val answer4 = findViewById<Button>(R.id.answer4)

//        // correct answer
//        answer2.setOnClickListener{
//            val intent = Intent(this, CorrectQActivity::class.java)
//            startActivity(intent)
//        }
//
//        // wrong answers
//        answer1.setOnClickListener{
//            val intent = Intent(this, FirstWrongQActivity::class.java)
//            startActivity(intent)
//        }
//        answer3.setOnClickListener{
//            val intent = Intent(this, ThirdWrongQActivity::class.java)
//            startActivity(intent)
//        }
//        answer4.setOnClickListener{
//            val intent = Intent(this, FourthWrongQActivity::class.java)
//            startActivity(intent)
//        }
    }
}