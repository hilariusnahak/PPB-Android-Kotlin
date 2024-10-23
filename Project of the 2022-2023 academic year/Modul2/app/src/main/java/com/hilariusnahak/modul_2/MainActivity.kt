package com.hilariusnahak.modul_2

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		var et_username = findViewById<EditText>(R.id.et_username)
		var et_password = findViewById<EditText>(R.id.et_password)
		var btn_reset = findViewById<Button>(R.id.btn_reset)
		var btn_submit = findViewById<Button>(R.id.btn_submit)
		
		btn_reset.setOnClickListener {
			et_username.setText(" ")
			et_password.setText(" ")
			Toast.makeText(this@MainActivity, "Bersihkan Data", Toast.LENGTH_LONG) .show()
		}
		
		btn_submit.setOnClickListener {
			val username = et_username.text
			val password = et_password.text
			
			AlertDialog.Builder(this)
				.setTitle("Login")
				.setMessage("Anda Berhasil Login")
				.setPositiveButton("Ya", DialogInterface.OnClickListener { dialogInterface, i ->
					val intent = Intent(this, Activity_Two::class.java)
					startActivity(intent)
				})
				.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
					Toast.makeText(this, "Jalankan perintah ketika user memilih tombol No", Toast.LENGTH_LONG) .show()
				})
				.show()
		}
	}
}