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
import kotlinx.android.synthetic.main.activity_password.*

class pass_act : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
        textView3.setOnClickListener {
            val go_to_reg = Intent(this, login_act::class.java)
            startActivity(go_to_reg)
        }

        Login.setOnClickListener {
            val context = this
            val db = Database(context)

            sharedPreferences =getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
                Toast.makeText(context, "Excellent", Toast.LENGTH_SHORT).show()
                val editor: SharedPreferences.Editor = sharedPreferences.edit()
                editor.putString("email", editTextTextEmailAddress.text.toString())
                editor.apply()
                if(db.readPosition(editTextTextEmailAddress.text.toString())=="student") {
                    val go_to_reg = Intent(this, student_menu_act::class.java)
                    startActivity(go_to_reg)
                }
                else if(db.readPosition(editTextTextEmailAddress.text.toString())=="admin"){
                    val go_to_reg = Intent(this, admin_menu_act::class.java)
                    startActivity(go_to_reg)
                }
                else{
                    val go_to_reg = Intent(this, teacher_menu_act::class.java)
                    startActivity(go_to_reg)
                }

        }
        }
    
}


