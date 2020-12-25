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
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_student.*

class sign_students : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_student)
        val context = this
        val db = Database(context)
        textView3.setOnClickListener {
            val go_to_reg = Intent(this, MainActivity::class.java)
            startActivity(go_to_reg)
        }
        button.setOnClickListener {
            val go_to_reg= Intent(this, staff_act::class.java)
            startActivity(go_to_reg)
        }

        Login.setOnClickListener {



            if (editTextTextPersonName7.text.toString().isNotEmpty() &&
                editTextTextPersonName4.text.toString().isNotEmpty()
            ) {
                val user = User(editTextTextPersonName.text.toString(), editTextTextPersonName2.text.toString(), editTextTextPersonName7.text.toString(), editTextTextPersonName8.text.toString(), editTextTextPersonName9.text.toString(), "student", editTextTextPersonName4.text.toString())
                //Toast.makeText(context, user.firstname+ " " +user.lastname + " " +user.email + " " + user.course + " " + user.group + " " + user.position + " " + user.password, Toast.LENGTH_SHORT).show()
             sharedPreferences =getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
                db.insertData(user)
                val editor: SharedPreferences.Editor = sharedPreferences.edit()
                editor.putString("email", user.email)
                editor.apply()
                val go_to_reg = Intent(this, student_menu_act::class.java)
                startActivity(go_to_reg)
            }
            else {
                Toast.makeText(context, "Please Fill All Data's", Toast.LENGTH_SHORT).show()
            }

        }
        }
    
}


