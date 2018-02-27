package com.example.j.yairwebview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText ET1;
    EditText ET2;
    EditText ET3;
     WebView wv1;
    Button btn1;
    TextView tv1;
    TextView tv2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);

        ET1 = (EditText) findViewById(R.id.ET1);

        ET2 = (EditText) findViewById(R.id.ET2);

        ET3 = (EditText) findViewById(R.id.ET3);

        wv1 = (WebView) findViewById(R.id.wv1);





    }
    public void yair1(View view) {


        String st1 = ET1.getText().toString();
        Integer var1 = Integer.parseInt(st1);

        String st2 = ET2.getText().toString();
        Integer var2 = Integer.parseInt(st2);

        String st3 = ET3.getText().toString();
        Integer var3 = Integer.parseInt(st3);

        String stringUrl = "https://www.google.co.il/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=";
        stringUrl = stringUrl + var1 + "x%5E2%2B" + var2 + "x%2B" + var3;
        wv1.loadUrl(stringUrl);


    }
}










