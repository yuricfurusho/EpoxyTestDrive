package com.example.epoxytestdrive

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.epoxy.EpoxyRecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: EpoxyRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.epoxy_recycler_view)

    }
}
