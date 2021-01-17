package com.example.rbcfootprint.ui.learn

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.rbcfootprint.R

class ItemAdapter : AppCompatActivity() {

    class Entry(private var course:String, private var desc:String, private var image: Int) {

        fun getCourse(): String {
            return course
        }

        fun getDescription(): String {
            return desc
        }

        fun getImage(): Int {
            return image
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
                val img = view?.findViewById<ImageView>(R.id.icon) as ImageView
                val nameTxt = view.findViewById<TextView>(R.id.courseNameView) as TextView
                val propTxt = view.findViewById<TextView>(R.id.descView) as TextView

                //BIND data to TextView and ImageVoew
                nameTxt.text = quote.getCourse()
                propTxt.text = quote.getDescription()
                img.setImageResource(quote.getImage())

                //handle itemclicks for the ListView
                view.setOnClickListener { Toast.makeText(c, quote.getCourse(), Toast.LENGTH_SHORT).show() }

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

                var quotet = Entry("Climate Change" , "Some course description here." ,R.drawable.climate)
                quotes.add(quotet)

                var quote2 = Entry("Climate Change" ,"Some course description here."  ,R.drawable.climate)
                quotes.add(quote2)

                var quote3 = Entry("Climate Change" , "Some course description here." , R.drawable.climate)
                quotes.add(quote3)

                var quote4 = Entry("Climate Change", "Some course description here.", R.drawable.climate)
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