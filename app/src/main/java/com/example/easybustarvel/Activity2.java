package com.example.easybustarvel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView Notice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Notice = (TextView) findViewById(R.id.welo);


    }
}
