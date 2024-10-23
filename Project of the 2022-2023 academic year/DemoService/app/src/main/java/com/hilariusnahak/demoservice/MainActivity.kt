package com.hilariusnahak.demoservice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	
	lateinit var wifiSwitch: Switch
	lateinit var wifiManager: WifiManager
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		title = "KotlinApp"
		wifiSwitch = findViewById(R.id.wifiSwitch)
		wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
		wifiSwitch.setOnCheckedChangeListener { _, isChecked ->
			if (isChecked) {
				wifiManager.isWifiEnabled = true
				wifiSwitch.text = "Wifi Hidup"
			} else {
				wifiManager.isWifiEnabled = false
				wifiSwitch.text = "Wifi Mati"
			}
		}
	}
	
	override fun onStart() {
		super.onStart()
		val intentFilter = IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION)
		registerReceiver(wifiStateReceiver, intentFilter)
	}
	
	override fun onStop() {
		super.onStop()
		unregisterReceiver(wifiStateReceiver)
	}
	
	private val wifiStateReceiver : BroadcastReceiver = object : BroadcastReceiver () {
		override fun onReceive(context: Context, intent: Intent) {
			when(intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN)) {
				WifiManager.WIFI_STATE_ENABLED -> {
					wifiSwitch.isChecked = true
					wifiSwitch.text = "Hidup"
					Toast.makeText(this@MainActivity, "Wife is on", Toast.LENGTH_SHORT).show()
				}
				WifiManager.WIFI_STATE_DISABLED -> {
					wifiSwitch.isChecked = false
					wifiSwitch.text = "Mati"
					Toast.makeText(this@MainActivity, "Wifi is off", Toast.LENGTH_SHORT).show()
				}
			}
		}
	}
}