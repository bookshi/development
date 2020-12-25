package com.example.myuntitledapplication

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_student_search.*

class student_search_act : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val context = this
        val db = Database(context)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_search)
        textView3.setOnClickListener{
            val go_to_reg= Intent(this, teacher_menu_act::class.java)
            startActivity(go_to_reg)
        }
        Login.setOnClickListener {
            var name = editTextTextPersonName5.text.toString()
            Toast.makeText(context, db.readPosition(name), Toast.LENGTH_SHORT).show()
        }
        }
    
}


