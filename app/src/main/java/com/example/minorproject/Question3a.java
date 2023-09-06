package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Question3a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3a);

        String res1=getIntent().getStringExtra("res2").toString();
        final String[] name = {getIntent().getStringExtra("name").toString()};
        final int[] c = {(int) res1.charAt(0) - 48};
        final int[] w = {(int) res1.charAt(2) - 48};

        Button quit=(Button) findViewById(R.id.button3);
        final Button[] next = {(Button) findViewById(R.id.buttonf3)};
        TextView txtn=(TextView) findViewById(R.id.textView21);
        TextView score=(TextView) findViewById(R.id.textView23);
        txtn.setText("Hello "+name+",");
        score.setText(""+c[0]);
        RadioButton cor1=(RadioButton) findViewById(R.id.Q3op1);
        next[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                if(cor1.isChecked())
                {
                    c[0]++;
                    Toast.makeText(Question3a.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    w[0]++;
                    Toast.makeText(Question3a.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
                String name=getIntent().getStringExtra("name").toString();
                Intent intent3=new Intent(getApplicationContext(),Question4a.class);
                intent3.putExtra("res3", c[0] +" "+ w[0]);
                intent3.putExtra("name",name);
                startActivity(intent3);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quit3=new Intent(getApplicationContext(),MainActivityLast.class);
                quit3.putExtra("res5", c[0] +" "+ w[0]);
                startActivity(quit3);
            }
        });
    }
}