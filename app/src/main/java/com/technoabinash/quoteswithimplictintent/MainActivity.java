package com.technoabinash.quoteswithimplictintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView body;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        body = findViewById(R.id.txt_body);
        share = findViewById(R.id.share_Btn);

        share.setOnClickListener(view -> {
            String msg = body.getText().toString();
            Intent sendData=new Intent();
            sendData.setAction(Intent.ACTION_SEND);
            sendData.setType("text/plain");
            sendData.putExtra(Intent.EXTRA_TEXT,msg);
            startActivity(sendData);
        });
    }
}