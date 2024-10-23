package com.hilariusnahak.demomenu

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	
	private lateinit var img: ImageView
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		img = findViewById(R.id.img_scan)
		
		img.setOnClickListener {
			startActivity(Intent(this@MainActivity, ScanPresensi::class.java))
		}
	}
}