package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Question4a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4a);

        String res1=getIntent().getStringExtra("res3").toString();
        String name = getIntent().getStringExtra("name").toString();
        final int[] c = {(int) res1.charAt(0) - 48};
        final int[] w = {(int) res1.charAt(2) - 48};

        TextView score=(TextView) findViewById(R.id.textView26);
        TextView txtn=(TextView) findViewById(R.id.textView24) ;
        score.setText(""+c[0]);
        txtn.setText("Hello "+ name +",");

        Button quit=(Button) findViewById(R.id.button4);
        Button next=(Button) findViewById(R.id.buttonf4);
        RadioButton cor1=(RadioButton) findViewById(R.id.Q4op3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                if(cor1.isChecked())
                {
                    c[0]++;
                    //Toast.makeText(Question4a.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    w[0]++;
                    //Toast.makeText(Question4a.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
                String name=getIntent().getStringExtra("name").toString();
                Intent intent4=new Intent(getApplicationContext(),Question5a.class);
                intent4.putExtra("res4",c[0]+" "+w[0]);
                intent4.putExtra("name",name);
                startActivity(intent4);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quit4=new Intent(getApplicationContext(),MainActivityLast.class);
                quit4.putExtra("res5", c[0] +" "+ w[0]);
                startActivity(quit4);
            }
        });
    }
}