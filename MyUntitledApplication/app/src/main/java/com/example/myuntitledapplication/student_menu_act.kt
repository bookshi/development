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
import kotlinx.android.synthetic.main.activity_student_menu.*
import kotlinx.android.synthetic.main.activity_student_menu.textView16

class student_menu_act : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_menu)

        sharedPreferences =getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val context = this
        val db = Database(context)
        var name=db.readFirstname(sharedPreferences.getString("email", "").toString())+" " + db.readLASTname(sharedPreferences.getString("email", "").toString())
        textView6.setText(name)
        textView16.setOnClickListener {
            val go_to_reg= Intent(this, settings_act::class.java)
            startActivity(go_to_reg)
        }

        textView17.setOnClickListener {
            val go_to_reg= Intent(this, help_act::class.java)
            startActivity(go_to_reg)
        }

        textView18.setOnClickListener {
            val go_to_reg= Intent(this, student_info_act::class.java)
            startActivity(go_to_reg)
        }
        textView10.setOnClickListener {
            val go_to_reg= Intent(this, time_act::class.java)
            startActivity(go_to_reg)
        }
        textView15.setOnClickListener {
            val go_to_reg= Intent(this, history_act::class.java)
            startActivity(go_to_reg)
        }

        }
    
}


