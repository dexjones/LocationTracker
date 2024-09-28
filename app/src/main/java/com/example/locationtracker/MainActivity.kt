package com.example.locationtracker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Launch MapsActivity
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)

        finish()
    }
}
