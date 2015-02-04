package com.example.naveen.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    RelativeLayout HomePage;
    Button btn;
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HomePage=(RelativeLayout) findViewById(R.id.HomePage);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
           @Override
         public void onClick(View view){
              /* Uri uri = Uri.parse("http://naveen-watsonservicetest.mybluemix.net/");
               Intent intent = new Intent(Intent.ACTION_VIEW, uri);
               startActivity(intent);
           */
               btn.setEnabled(false);
               myWebView = (WebView) findViewById(R.id.webview);
               myWebView.loadUrl("http://naveen-watsonservicetest.mybluemix.net/");
           }
        });
    }

}
