package com.example.myalc4challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class about extends AppCompatActivity {
    String url ="https://www.andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new CustomWebViewClient());
        myWebView.loadUrl(url);
    }

    private class CustomWebViewClient extends WebViewClient {

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {

    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
            handler.proceed();
    }

    @Override
    public void onPageFinished(WebView view, String url){

    }
    }

}