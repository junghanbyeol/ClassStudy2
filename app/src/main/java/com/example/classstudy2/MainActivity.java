package com.example.classstudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnWidget,btnWTest1,btnWTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWidget = findViewById(R.id.btn_Widget);
        btnWTest1 = findViewById(R.id.btn_WTest1);
        btnWTest2 = findViewById(R.id.btn_WTest2);

        btnWTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, Wtest2Acivity.class);
                startActivity(mIntent);
            }
        });
        btnWTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, WTest1Activity.class);
                startActivity(mIntent);
            }
        });
        btnWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyIntent = new Intent(MainActivity.this, MywidgetActivity.class);
                startActivity(MyIntent);
            }
        });
    }
}