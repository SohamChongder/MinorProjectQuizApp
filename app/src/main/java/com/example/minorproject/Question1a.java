package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Question1a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1a);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        final int[] c = {0};
        final int[] w = { 0 };

        final Button next=(Button) findViewById(R.id.buttonf1);
        Button quit=(Button) findViewById(R.id.button1);
        TextView score=(TextView) findViewById(R.id.textView17);
        TextView txtn=(TextView) findViewById(R.id.textView15);
        txtn.setText("Hello "+name+",");
        score.setText("0");
        RadioButton cor1=(RadioButton) findViewById(R.id.Q1op2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                if(cor1.isChecked())
                {
                    c[0]++;
                    Toast.makeText(Question1a.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    w[0]++;
                    Toast.makeText(Question1a.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
                Intent intent1=new Intent(getApplicationContext(),Question2a.class);
                intent1.putExtra("res1", c[0] +" "+ w[0]);
                intent1.putExtra("name", name);
                startActivity(intent1);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quit1=new Intent(getApplicationContext(),MainActivityLast.class);
                quit1.putExtra("res5", c[0] +" "+ w[0]);
                startActivity(quit1);
            }
        });

    }
}