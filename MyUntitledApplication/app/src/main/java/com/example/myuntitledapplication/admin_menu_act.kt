package com.example.myuntitledapplication

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_admin_menu.*

class admin_menu_act : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_menu)

        textView16.setOnClickListener {
            val go_to_reg= Intent(this, settings_act::class.java)
            startActivity(go_to_reg)
        }
        textView10.setOnClickListener {
            val go_to_reg= Intent(this, staff_search_act::class.java)
            startActivity(go_to_reg)
        }
        textView15.setOnClickListener {
            val go_to_reg= Intent(this, student_search_act::class.java)
            startActivity(go_to_reg)
        }
        }
    
}


