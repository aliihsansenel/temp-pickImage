package com.aliihsansenel.uygulama;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Programatik extends AppCompatActivity {
    LinearLayout panel;
    TextView txtSayac;
    Button btnIncrement;

    Context context = this;

    int sayac;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(panel);
    }
    private void init(){
        sayac = 0;
        panel = new LinearLayout(context);
        panel.setOrientation(LinearLayout.VERTICAL);

        txtSayac = new TextView(context);
        txtSayac.setText("Sayac: " + sayac);
        txtSayac.setTextSize(25);

        btnIncrement = new Button(context);
        btnIncrement.setText("Arttır");
        btnIncrement.setAllCaps(false);

        panel.addView(txtSayac);
        panel.addView(btnIncrement);

        btnIncrement.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sayac++;
                txtSayac.setText("Sayac: " + sayac);
                if(sayac == 7){
                    Intent intent = new Intent(context, Login.class);
                    startActivity(intent);
                }
            }
        });

    }
}
