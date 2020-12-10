package com.example.culculateapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button plusBtn, minusBtn, multBtn, divisionBtn;
TextView result;
EditText firstEt, secondEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        final int a = Integer.parseInt(firstEt.getText().toString());
        final int b = Integer.parseInt(secondEt.getText().toString());

        View.OnClickListener BTNs = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.plusBtn:
                        result.setText(a + b + "");
                        break;
                }
            }
        };
        plusBtn.setOnClickListener(BTNs);

    }
    private void init(){
        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
        multBtn = findViewById(R.id.multiplyBtn);
        divisionBtn = findViewById(R.id.divisionBtn);
        result = findViewById(R.id.result);
        firstEt = findViewById(R.id.firstEt);
        secondEt = findViewById(R.id.secondEt);
    }
}