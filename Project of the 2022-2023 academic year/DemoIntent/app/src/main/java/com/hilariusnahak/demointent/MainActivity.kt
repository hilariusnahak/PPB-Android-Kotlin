package com.hilariusnahak.demointent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	
	private lateinit var btnInten: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		btnInten = findViewById(R.id.btn_inten1)
		btnInten.setOnClickListener {
			startActivity(Intent(this, IntenKeduaActivity::class.java))
		}
	}
}