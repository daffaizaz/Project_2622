package com.example.project_2622

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //intent explisit
        //instance
        val btnlogin:Button= findViewById(R.id.buttonLogin)
        val txtusername:EditText = findViewById()
        //even btn Login click
        btnlogin.setOnClickListener {
            //validate
            if (textUsername.text.toString).equals("daffa") && textPassword.text.toString()
                .equals("1")) {
        //callhome activity
            val intentHome = Intent (packagecontext:
        }
    }
}