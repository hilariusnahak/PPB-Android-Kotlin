package com.hilariusnahak.uicomponent

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
            val imgAdBtn = findViewById<ImageButton>(R.id.btn_add)
            imgAdBtn.setOnClickListener {
                Toast.makeText(this@MainActivity,"Berhasil Menambah Data", Toast.LENGTH_LONG).show()
            }
        }
    }