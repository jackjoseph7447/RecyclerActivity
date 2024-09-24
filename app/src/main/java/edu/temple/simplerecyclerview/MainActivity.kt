package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        //TODO Step 4: Provide a RecyclerView.Adapter
        val array = IntArray(10)
        array[0] = 10
        array[1] = 12
        array[2] = 14
        array[3] = 16
        array[4] = 18
        array[5] = 20
        array[6] = 18
        array[7] = 16
        array[8] = 14
        array[9] = 12

        recyclerView.adapter = NumberDisplayAdapter(array)
    }
}