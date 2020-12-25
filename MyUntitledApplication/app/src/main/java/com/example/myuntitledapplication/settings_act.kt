package com.example.myuntitledapplication

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_settings.*

class settings_act : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        textView3.setOnClickListener{
            val go_to_reg= Intent(this, student_menu_act::class.java)
            startActivity(go_to_reg)
        }
        Login.setOnClickListener {
            val go_to_reg= Intent(this, MainActivity::class.java)
            startActivity(go_to_reg)
        }
        }
    
}


