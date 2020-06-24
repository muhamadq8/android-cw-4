package com.example.hm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText x = findViewById(R.id.test1);
        final EditText y = findViewById(R.id.test2);
         Button z = findViewById(R.id.test3);
         Button a = findViewById(R.id.test4);

         double x1 = Double.parseDouble(x.getText().toString());
    }
}