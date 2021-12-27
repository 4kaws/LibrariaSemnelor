package com.example.librariasemnelor
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActivityBtn: Button = findViewById(R.id.secondActivityBtn)

        secondActivityBtn.setOnClickListener() {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val thirdActivityBtn: Button = findViewById(R.id.thirdActivityBtn)

        thirdActivityBtn.setOnClickListener() {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)

        }
    }
}
