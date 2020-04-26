package com.hanseltritama.webviewsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.my_webview);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        // To display URL
//        webView.loadUrl("https://www.google.com");

        // To display HTML
        webView.loadData("<html><body><h1>Hello!</h1><p>Hehehehe</p></body></html>", "text/html", "UTF-8");

    }
}
