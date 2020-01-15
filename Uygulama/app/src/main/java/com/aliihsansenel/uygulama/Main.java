package com.aliihsansenel.uygulama;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    Typeface tf1;
    TextView text;
    EditText editText;

    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);
        editText = (EditText) findViewById(R.id.etText);
        tf1 = Typeface.createFromAsset(getAssets(), "fonts/Corleone.ttf");
        editText.setTypeface(tf1);
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyCode == KeyEvent.KEYCODE_ENTER && keyEvent.getAction() == KeyEvent.ACTION_DOWN){
                    Toast.makeText(context, "Enter tuşuna basıldı.", Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }

        });
    }
    public void click(View v) {
        Button btn = (Button) v;
    }
}
