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
import kotlinx.android.synthetic.main.activity_student_info.*

class student_info_act : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {

        val context = this
        val db = Database(context)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_info)
        textView3.setOnClickListener{
            val go_to_reg= Intent(this, student_menu_act::class.java)
            startActivity(go_to_reg)
        }

        sharedPreferences =getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        textView6.setText(db.readFirstname(sharedPreferences.getString("email", "").toString() )+ " " + db.readLASTname(sharedPreferences.getString("email", "").toString()))
        textView13.setText("course: " + db.readCOurse(sharedPreferences.getString("email", "").toString()))
        textView14.setText("group: " + db.readGroup(sharedPreferences.getString("email", "").toString()))
        }
    
}


