package com.example.albertq4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txtV;

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        txtV = findViewById(R.id.txtV);
    }

    public void lol(View view) {
        counter++;
        btn.setText("This is click number: "+counter);
        if(counter % 7 == 0)
        {
            btn.setText("Boom");

        }
    }
}