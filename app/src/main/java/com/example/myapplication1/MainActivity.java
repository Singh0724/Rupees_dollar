package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private TextView textView;
 private EditText editText;
 private Button button;
 private TextView textView3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);
        textView3=findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText.getText().toString();
               int kg=Integer.parseInt(s);
               double rupees=75.05*kg;
               textView3.setText("The corresponding value in Dollar  to rupees is"+rupees);

            }
        });



    }
}