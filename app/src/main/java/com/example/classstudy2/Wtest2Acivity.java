package com.example.classstudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class Wtest2Acivity extends AppCompatActivity {

    ImageView imgvS,imgvR,imgvP;
    CheckBox chkS,chkR,chkP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest2);
        imgvS = findViewById(R.id.imgv_S);
        imgvR = findViewById(R.id.imgv_R);
        imgvP = findViewById(R.id.imgv_P);

        chkS= findViewById(R.id.chk_S);
        chkR= findViewById(R.id.chk_R);
        chkP= findViewById(R.id.chk_P);

        chkP.setChecked(true);
        chkR.setChecked(true);
        chkS.setChecked(true);

        chkP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkP.isChecked()){
                    imgvP.setVisibility(View.VISIBLE);
                }else{
                    imgvP.setVisibility(View.INVISIBLE);
                }
            }
        });
        chkR.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkR.isChecked()){
                    imgvR.setVisibility(View.VISIBLE);
                }else{
                    imgvR.setVisibility(View.INVISIBLE);
                }
            }
        });
        chkS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkS.isChecked()){
                    imgvS.setVisibility(View.VISIBLE);
                }else{
                    imgvS.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}