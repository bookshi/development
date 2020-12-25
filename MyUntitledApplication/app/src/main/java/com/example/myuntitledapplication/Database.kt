package com.example.myuntitledapplication

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
val DATABASENAME = "MY_DATABASE121"
val TABLENAME = "Userses"
val COL_FIRSTNAME = "firstname"
val COL_LASTNAME = "lastname"
val COL_EMAIL = "email"
val COL_COURSE = "course"
val COL_GROUP = "groupss"
val COL_POSITION = "position"
val COL_PASSWORD = "password"
val COL_ID = "id"

class Database(var context: Context) : SQLiteOpenHelper(context, DATABASENAME, null,
    1) {

        override fun onCreate(db: SQLiteDatabase?) {
            val createTable = "CREATE TABLE " + TABLENAME + " (" + COL_ID +
                    " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_FIRSTNAME +
                    " text, "+ COL_LASTNAME + " text, " + COL_EMAIL + " text, " + COL_COURSE + " text, " + COL_GROUP + " text, " + COL_POSITION + " text, " + COL_PASSWORD + " text)"
            db?.execSQL(createTable)
        }
        override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
            TODO("Not yet implemented")
        }
        fun insertData(user: User) {

            val database = this.writableDatabase
            val contentValues = ContentValues()

           contentValues.put(COL_FIRSTNAME, user.firstname)
            contentValues.put(COL_LASTNAME, user.lastname)
            contentValues.put(COL_EMAIL, user.email)
            contentValues.put(COL_COURSE, user.course)
            contentValues.put(COL_GROUP, user.group)
            contentValues.put(COL_POSITION, user.position)
            contentValues.put(COL_PASSWORD, user.password)
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            val result = database.insert(TABLENAME, null, contentValues)
            if (result == (0).toLong()) {
                Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
            }
        }



        @SuppressLint("Recycle")
        fun readPassword(email: String): String {
            val db = this.readableDatabase
            var st = ""
            val query = "Select * from " + TABLENAME + " where " + COL_EMAIL + " = \'" + email+"\'"
            val result = db.rawQuery(query, null)
            if (result.moveToFirst()) {
                st=result.getString(result.getColumnIndex(COL_PASSWORD))
            }
            result.close()
            return st
        }

    @SuppressLint("Recycle")
    fun readPosition(name: String): String {
        val db = this.readableDatabase
        var st = ""
        val query = "Select * from " + TABLENAME + " where " + COL_FIRSTNAME + "|| \' \' ||" + COL_LASTNAME + " = \'" + name+"\'"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            st=result.getString(result.getColumnIndex(COL_POSITION))
        }
        result.close()
        return st
    }
    @SuppressLint("Recycle")
    fun readPosition1(email: String): String {
        val db = this.readableDatabase
        var st = ""
        val query = "Select * from " + TABLENAME + " where " + COL_EMAIL + " = \'" + email+"\'"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            st=result.getString(result.getColumnIndex(COL_POSITION))
        }
        result.close()
        return st
    }

    @SuppressLint("Recycle")
    fun readFirstname(email: String): String {
        val db = this.readableDatabase
        var st = ""
        val query = "Select * from " + TABLENAME + " where " + COL_EMAIL + " = \'" + email+"\'"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            st=result.getString(result.getColumnIndex(COL_FIRSTNAME))
        }
        result.close()
        return st
    }
    @SuppressLint("Recycle")
    fun readLASTname(email: String): String {
        val db = this.readableDatabase
        var st = ""
        val query = "Select * from " + TABLENAME + " where " + COL_EMAIL + " = \'" + email+"\'"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            st=result.getString(result.getColumnIndex(COL_LASTNAME))
        }
        result.close()
        return st
    }

    @SuppressLint("Recycle")
    fun readCOurse(email: String): String {
        val db = this.readableDatabase
        var st = ""
        val query = "Select * from " + TABLENAME + " where " + COL_EMAIL + " = \'" + email+"\'"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            st=result.getString(result.getColumnIndex(COL_COURSE))
        }
        result.close()
        return st
    }
    @SuppressLint("Recycle")
    fun readGroup(email: String): String {
        val db = this.readableDatabase
        var st = ""
        val query = "Select * from " + TABLENAME + " where " + COL_EMAIL + " = \'" + email+"\'"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()) {
            st=result.getString(result.getColumnIndex(COL_GROUP))
        }
        result.close()
        return st
    }

    }
