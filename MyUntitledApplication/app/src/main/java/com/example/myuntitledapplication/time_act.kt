package com.example.myuntitledapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_your_time.*

class time_act : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_time)
            textView3.setOnClickListener{
                val go_to_reg= Intent(this, student_menu_act::class.java)
                startActivity(go_to_reg)
            }

        sharedPreferences =getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        Signup.setOnClickListener {
            var day = editTextTextPersonName3.text.toString() + "." + editTextTextPersonName5.text.toString() +"."+editTextTextEmailAddress2.text.toString()+" "+editTextNumber3.text.toString() + ":" +editTextNumber4.text.toString()+":"+editTextTextPersonName6.text.toString()
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("inputday", day)
            editor.apply()
        }
        Login.setOnClickListener {
            var day = editTextTextPersonName3.text.toString() + "." + editTextTextPersonName5.text.toString() +"."+editTextTextEmailAddress2.text.toString()+" "+editTextNumber3.text.toString() + ":" +editTextNumber4.text.toString()+":"+editTextTextPersonName6.text.toString()
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("outputday", day)
            editor.apply()
        }
        }
    
}


