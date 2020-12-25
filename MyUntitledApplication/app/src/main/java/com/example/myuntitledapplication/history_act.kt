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
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_your_history.*
import kotlinx.android.synthetic.main.activity_your_history.Login
import kotlinx.android.synthetic.main.activity_your_history.textView3

class history_act : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_history)
        textView3.setOnClickListener{
            val go_to_reg= Intent(this, student_menu_act::class.java)
            startActivity(go_to_reg)
        }

        sharedPreferences =getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        editTextTextPersonName3.setText(sharedPreferences.getString("inputday", "").toString())
        editTextTextPersonName5.setText(sharedPreferences.getString("outputday", "").toString())

        Login.setOnClickListener {
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("inputday", "EMPTY")
            editor.putString("outputday", "EMPTY")
            editor.apply()
            editTextTextPersonName3.setText("EMPTY")
            editTextTextPersonName5.setText("EMPTY")
        }
        }
    
}


