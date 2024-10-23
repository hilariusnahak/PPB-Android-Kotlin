package com.hilariusnahak.googlemaps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

internal class MainActivity : AppCompatActivity(), OnMapReadyCallback {
	
	private lateinit var mMap: GoogleMap
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		val mapFragment = supportFragmentManager
			.findFragmentById(R.id.map) as SupportMapFragment
		mapFragment.getMapAsync(this)
	}
	
	override fun onMapReady(googleMap: GoogleMap) {
		mMap = googleMap
		val jogja = LatLng(-7.76165586395051, 110.40912843467936)
		mMap.addMarker(MarkerOptions()
			.position(jogja)
			.title("UPN Veteran"))
		mMap.moveCamera(CameraUpdateFactory.newLatLng(jogja))
	}
}