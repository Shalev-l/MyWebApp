package com.example.shalev.mywebapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebViewr= (WebView) findViewById(R.id.webView);
        myWebViewr.loadUrl("http://www.walla.co.il");
    }
}
