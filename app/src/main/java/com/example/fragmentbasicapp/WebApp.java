package com.example.fragmentbasicapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class WebApp extends AppCompatActivity {

    Button webbtn1, webbtn2;
            WebView simpleWebView;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_3);
        webbtn1=findViewById(R.id.loadWebPage);
        webbtn2=findViewById(R.id.loadFromStaticHtml);
simpleWebView=findViewById(R.id.simpleWebView);
        webbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // define static html text
                String customHtml = "<html><body><h1>Hello, Android App Developer</h1>" +
                        "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
                        "<p>This is a sample paragraph of static HTML In Web view</p>" +
                        "</body></html>";
                simpleWebView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view
    }
});



    }
}
