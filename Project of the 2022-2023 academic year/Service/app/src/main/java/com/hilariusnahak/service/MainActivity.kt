package com.hilariusnahak.service

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		val button = findViewById(R.id.sendBtn) as Button
		button.setOnClickListener {
			val intent = Intent (MainActivity@this, BindService::class.java)
			bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE)
		}
	}
	
	val serviceConnection : ServiceConnection = object : ServiceConnection {
		override fun onServiceConnected(name: ComponentName, iBinder: IBinder) {
			val localBinder : BindService.localBinder = iBinder as BindService.localBinder
			val service : BindService = localBinder.getBindServiceInstance()
			service.test()
		}
		
		override fun onServiceDisconnected(name: ComponentName?) {
			Log.d(TAG, "onServiceDisconnection: ")
		}
	}
	
	companion object {
		private const val TAG = "MainActivity"
	}
}