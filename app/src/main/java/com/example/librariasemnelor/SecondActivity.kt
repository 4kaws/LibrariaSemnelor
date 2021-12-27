package com.example.librariasemnelor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button
import android.widget.ListView;


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val actionBar = supportActionBar

        if(actionBar != null){
            actionBar.title = "Meniu principal"

            actionBar.setDisplayHomeAsUpEnabled(true)
        }

    }

}