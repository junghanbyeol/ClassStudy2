package com.example.classstudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class WTest1Activity extends AppCompatActivity {
    EditText edTest,edCheck;
    Button btTest;
    TextView tvTest;

    EditText ed1,ed2;
    Button btCalcu;
    TextView tvResult;

    RadioButton rbMinus,rbMulti,rbDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest1);

        edTest = findViewById(R.id.edt_Test);
        btTest = findViewById(R.id.btn_Test);
        tvTest = findViewById(R.id.txv_Test);
        edCheck = findViewById(R.id.edt_Check);

        ed1 = findViewById(R.id.ed_1);
        ed2 = findViewById(R.id.ed_2);
        btCalcu = findViewById(R.id.btn_Calcu);
        tvResult = findViewById(R.id.txv_Result);

        rbMinus = findViewById(R.id.rb_Minus);
        rbMulti = findViewById(R.id.rb_Multi);
        rbDiv = findViewById(R.id.rb_Div);


        btCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = ed1.getText().toString();//ed1 의 입력된 값을 getText로 가져옴
                String s2 = ed2.getText().toString();
                int n1 = Integer.parseInt(s1); // 문자를 숫자로 바꿈
                int n2 = Integer.parseInt(s2);
//                Integer iResult = n1 + n2;
//                tvResult.setText(iResult.toString()); //메소드를 사용해 문자열로 바꿀수도 있음
                int nResult= 0;
                if(rbMinus.isChecked()){
                    nResult = n1 - n2;
                }else if(rbMulti.isChecked()){
                    nResult = n1 * n2;
                }else if(rbDiv.isChecked()){
                    nResult = n1 / n2;
                }
                tvResult.setText(nResult+"");//+""는 숫자를 문자열로 변환
            }
        });

        String sTmp = tvTest.getText().toString();
        edTest.setText(sTmp);

        rbMinus.setChecked(true);

        btTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String sTest = edTest.getText().toString();
               tvTest.setText(sTest);
               String sCheck = edCheck.getText().toString();

               if (sTest.equals(sCheck)){//문자열이 같은지 판별 equals
                    tvTest.setText("같음");
                }else{
                    tvTest.setText("다름");

                }
            }
        });

    }
}
