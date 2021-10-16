package com.example.classstudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MywidgetActivity extends AppCompatActivity {
    TextView tvTopTitle;
    EditText editText;
    Button btOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mywidget);

        tvTopTitle = findViewById(R.id.tv_topTitle);
        editText = findViewById(R.id.edt_Title);
        btOK = findViewById(R.id.btn_OK);
    }
}