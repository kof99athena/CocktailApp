package com.athena.cocktailproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.athena.cocktailproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.webView.webViewClient = WebViewClient()
        binding.webView.webChromeClient = WebChromeClient()
        binding.webView.settings.javaScriptEnabled= true


        binding.webView.loadUrl("http://mrhicock.dothome.co.kr/")

    }

    override fun onBackPressed() {
        if(binding.webView.canGoBack()) binding.webView.goBack()
        else super.onBackPressed() //뒤로 갈게 없으면 온백프레스해서 액티비티화면으로 넘어간다.
        //여기를해야 뒤로갈때 상세페이지를 단계적으로뒤로가게한다.
    }

}
