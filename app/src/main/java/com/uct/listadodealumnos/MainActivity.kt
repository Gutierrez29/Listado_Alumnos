package com.uct.listadodealumnos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val masinfoButton = findViewById<Button>(R.id.masinfo)


        masinfoButton.setOnClickListener {
            val intent = Intent(this, inicioActivity::class.java)
            startActivity(intent)
        }
    }
}
