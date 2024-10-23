package com.hilariusnahak.demointent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class IntenKeduaActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_inten_kedua)
		
		var btnIntenDua = findViewById(R.id.btn_inten2) as Button
		
		btnIntenDua.setOnClickListener {
			startActivity(Intent(this, MainActivity::class.java))
		}
	}
}