package com.kjy.kakaomap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kjy.kakaomap.databinding.ActivityMainBinding
import net.daum.mf.map.api.MapView


class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val mapView = MapView(this)
        binding.KakaoView.addView(mapView)

    }


}