package com.hilariusnahak.demofirebase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		val db = Firebase
		val user: MutableMap<String, Any> = HashMap()
		user["world1"] = "Hi"
		user["world1"] = "Janabavers"
		user["world1"] = "I'm Ian!! :)"
	}
}