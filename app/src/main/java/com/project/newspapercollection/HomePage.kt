package com.project.newspapercollection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HomePage : AppCompatActivity() {

    //    lateinit var url: String
    lateinit var btnProthomAlo: ImageButton
    lateinit var btnPratidin: ImageButton
    lateinit var btnIttefak: ImageButton

    fun gotoWebView(url: String) {
        var intent = Intent(applicationContext, WebViewPage::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        btnProthomAlo = findViewById(R.id.btn_prothomalo)
        btnPratidin = findViewById(R.id.btn_pratidin)
        btnIttefak = findViewById(R.id.btn_ittefaq)

        btnProthomAlo.setOnClickListener {
//            url = "https://www.prothomalo.com/"
            gotoWebView("https://www.prothomalo.com/")
        }
        btnPratidin.setOnClickListener {
//            url = "https://www.bd-pratidin.com/"
            gotoWebView("https://www.bd-pratidin.com/")
        }
        btnIttefak.setOnClickListener {
//            url = "https://www.ittefaq.com.bd/"
            gotoWebView("https://www.ittefaq.com.bd/")
        }

    }
}