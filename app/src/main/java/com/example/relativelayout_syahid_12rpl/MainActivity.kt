package com.example.relativelayout_syahid_12rpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSpinnerDay()
        setSpinnerTime()
    }

    fun setSpinnerDay(){
        val Spinnerday:Spinner = findViewById(R.id.spinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.day_array,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item
        ).also {
            it.setDropDownViewResource(
                androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item)
            Spinnerday.adapter = it
        }
    }
    fun setSpinnerTime(){
        val Spinnerday2:Spinner = findViewById(R.id.spinner2)

        ArrayAdapter.createFromResource(
            this,
            R.array.time_array,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item
        ).also {
            it.setDropDownViewResource(
                androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item)
            Spinnerday2.adapter = it
        }
    }
}