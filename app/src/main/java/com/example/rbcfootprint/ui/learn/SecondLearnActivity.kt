package com.example.rbcfootprint.ui.learn

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.example.rbcfootprint.R
import com.example.rbcfootprint.ui.mainpage.MainPageActivity

class SecondLearnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn2)

        val button = findViewById<Button>(R.id.nextButton)
        button.setOnClickListener{
            val intent = Intent(this, ThirdLearnActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.skipButton)
        button2.setOnClickListener{
            val intent = Intent(this, ItemAdapter::class.java)
            startActivity(intent)
        }
    }
}