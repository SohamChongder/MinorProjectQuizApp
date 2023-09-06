package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Question2a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2a);

        String res1=getIntent().getStringExtra("res1").toString();
        String name=getIntent().getStringExtra("name").toString();
        final int[] c = {(int) res1.charAt(0) - 48};
        final int[] w = {(int) res1.charAt(2) - 48};

        Button quit=(Button) findViewById(R.id.button2);
        Button next=(Button) findViewById(R.id.buttonf2);
        TextView score=(TextView) findViewById(R.id.textView20);
        TextView txtn=(TextView) findViewById(R.id.textView18) ;
        score.setText(""+c[0]);
        txtn.setText("Hello "+name+",");
        RadioButton cor1=(RadioButton) findViewById(R.id.Q2op2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                if(cor1.isChecked())
                {
                    c[0]++;
                    Toast.makeText(Question2a.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    w[0]++;
                    Toast.makeText(Question2a.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
                String name=getIntent().getStringExtra("name").toString();
                Intent intent2=new Intent(getApplicationContext(),Question3a.class);
                intent2.putExtra("res2", c[0] +" "+ w[0]);
                intent2.putExtra("name",name);
                startActivity(intent2);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quit2=new Intent(getApplicationContext(),MainActivityLast.class);
                quit2.putExtra("res5", c[0] +" "+ w[0]);
                startActivity(quit2);
            }
        });
    }
}