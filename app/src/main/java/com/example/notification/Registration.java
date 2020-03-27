package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;


public class Registration extends AppCompatActivity {

    EditText label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Intent intent =  getIntent();
        String name = intent.getStringExtra("yourName");

        label = (EditText) findViewById(R.id.te1);
        label.setText(name);
    }
}
