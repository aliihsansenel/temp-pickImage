package com.aliihsansenel.uygulama;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    TextView textHeader;
    EditText etName, etPass;
    Button btnSend, btnClean;
    Typeface tf1;
    Context context = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_intent);
        init();
    }
    public void init(){

        etName = (EditText) findViewById(R.id.etName);
        etPass =  (EditText) findViewById(R.id.etPass);
        btnSend = (Button) findViewById(R.id.btnSend);
        btnClean = (Button) findViewById(R.id.btnClean);
        textHeader = (TextView) findViewById(R.id.textHeader);

        tf1 = Typeface.createFromAsset(getAssets(), "fonts/Corleone.ttf");
        textHeader.setTypeface(tf1);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etName.getText().toString().equals("admin") && etPass.getText().toString().equals("ersan236594")){
                    Intent intent = new Intent(context, Main.class);
                    startActivity(intent);
                }
            }
        });
        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.setText("");
                etPass.setText("");
                etName.requestFocus();
            }
        });
    }
}
