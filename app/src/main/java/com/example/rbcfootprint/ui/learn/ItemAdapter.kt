package com.example.rbcfootprint.ui.learn

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.rbcfootprint.R
import com.example.rbcfootprint.ui.quiz.QuizQuestionActivity

class ItemAdapter : AppCompatActivity() {

    class Entry(private var course:String, private var desc:String, private var image: Int, private var points:String) {

        fun getCourse(): String {
            return course
        }

        fun getDescription(): String {
            return desc
        }

        fun getImage(): Int {
            return image
        }

        fun getPoints(): String {
            return points
        }
    }

        class CustomAdapter(private var c: Context, private var course: ArrayList<Entry>) : BaseAdapter() {
            override fun getCount(): Int { return course.size }

            override fun getItem(i: Int): Any { return course[i] }

            override fun getItemId(i: Int): Long { return i.toLong() }

            override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
                var view = view
                if (view == null) {
                    //inflate layout resource if its null
                    view = LayoutInflater.from(c).inflate(R.layout.listview_layout, viewGroup, false)
                }
                //get current quote
                val quote = this.getItem(i) as Entry

                //reference textviews and imageviews from our layout
                val img = view?.findViewById<ImageButton>(R.id.accButton) as ImageButton
                val nameTxt = view.findViewById<TextView>(R.id.courseNameView) as TextView
                val propTxt = view.findViewById<TextView>(R.id.descView) as TextView
                val pointTxt = view.findViewById<TextView>(R.id.pointView) as TextView

                //BIND data to TextView and ImageVoew
                nameTxt.text = quote.getCourse()
                propTxt.text = quote.getDescription()
                img.setImageResource(quote.getImage())
                pointTxt.text = quote.getPoints()

                //handle itemclicks for the ListView
                view.setOnClickListener {
                    Toast.makeText(c, quote.getCourse(), Toast.LENGTH_SHORT).show()
                }

                return view
            }
        }

        //Main Activity Instance Fields.
        private lateinit var adapter: CustomAdapter
        private lateinit var myListView: ListView

        // our data source
        private val data: ArrayList<Entry>
            get() {
                val quotes = ArrayList<Entry>()

                var quote3 = Entry("Recycling" , "Some course description here." , R.drawable.recycling, "20 pts")
                quotes.add(quote3)

                var quote2 = Entry("Fast Fashion" ,"Some course description here."  ,R.drawable.fast_fashion, "100 pts")
                quotes.add(quote2)

                var quotet = Entry("Climate Change" , "Some course description here." ,R.drawable.climate, "40 pts")
                quotes.add(quotet)

                var quote4 = Entry("Renewable Energy", "Some course description here.", R.drawable.energy, "50 pts")
                quotes.add(quote4)

                return quotes
            }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.available_activities)

            myListView = findViewById(R.id.myListView) as ListView

            //instantiate and set adapter
            adapter = CustomAdapter(this, data)
            myListView.adapter = adapter
        }
}