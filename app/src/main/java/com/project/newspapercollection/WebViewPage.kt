package com.project.newspapercollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

lateinit var webView: WebView

class WebViewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_page)

        webView = findViewById(R.id.webView)
        webView.loadUrl(intent.getStringExtra("url").toString())
        webView.settings.javaScriptEnabled = true
        webView.settings.builtInZoomControls = true
        webView.webViewClient = WebViewClient()

    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}