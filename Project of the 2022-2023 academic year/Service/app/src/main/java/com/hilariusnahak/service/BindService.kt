package com.hilariusnahak.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log

class BindService : Service () {
	
	override fun onBind(intent: Intent?): IBinder? {
		return localBinder()
	}
	
	inner class localBinder : Binder () {
		fun getBindServiceInstance () : BindService {
			return this@BindService
		}
	}
	
	fun test () {
		Log.d(Companion.TAG, "Hallo : ini merupakan service Android")
	}
	
	companion object {
		private const val TAG = "BindService"
	}
}