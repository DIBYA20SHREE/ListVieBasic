package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView= findViewById<ListView>(R.id.ListView)
        val String= resources.getStringArray(R.array.ListView)


        val AdapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, String)
        listView.adapter = AdapterForMyListView

        listView.setOnItemClickListener { parent, view, position, id ->
            val text= " Clicked on item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

        }
    }
}