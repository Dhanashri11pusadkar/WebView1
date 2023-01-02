package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    WebView webView;
            ImageButton btn_search,btn_google,btn_yt,btn_java,btn_android;
            EditText et_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webview);
        btn_search=findViewById(R.id.btn_search);
        btn_google = findViewById(R.id.btn_google);
        btn_yt = findViewById(R.id.btn_youtube);
        btn_java = findViewById(R.id.btn_java);
        btn_android = findViewById(R.id.btn_android);
        et_url = findViewById(R.id.et_url);
    }

    public void loadData(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_search:{}break;
            case R.id.btn_google: {
                webView.loadUrl("https://www.google.com/");
            }break;
            case R.id.btn_youtube:{
                webView.loadUrl("https://www.youtube.com/");
            }break;
            case R.id.btn_java:{
                webView.loadUrl("https://www.javatpoint.com/java-tutorial");
            }break;
            case R.id.btn_android:{
                webView.loadUrl("https://developer.android.com/");
            }break;


            }
    }
}