package com.chhabi.week6assignment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.chhabi.week6assignment.R


class AboutusFragment : Fragment() {
    lateinit var webview: WebView
    val url="https://softwarica.edu.np/"



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_aboutus, container, false)
        webview=view.findViewById(R.id.webView)
        webview.webViewClient = WebViewClient()
        webview.settings.javaScriptEnabled = true
        webview.loadUrl(url)
        return view
    }
    companion object{
        fun newInstance():AboutusFragment=AboutusFragment()
    }


    }
