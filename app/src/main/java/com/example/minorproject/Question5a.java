package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question5a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5a);

        String res1=getIntent().getStringExtra("res4").toString();
        String name = getIntent().getStringExtra("name").toString();
        final int[] c = {(int) res1.charAt(0) - 48};
        final int[] w = {(int) res1.charAt(2) - 48};

        TextView score=(TextView) findViewById(R.id.textView30);
        TextView txtn=(TextView) findViewById(R.id.textView28) ;
        score.setText(""+c[0]);
        txtn.setText("Hello "+ name +",");
        Button next=(Button) findViewById(R.id.buttonf5);
        Button quit=(Button) findViewById(R.id.button5);
        RadioButton cor1=(RadioButton) findViewById(R.id.Q5op4);
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
                Intent intent5=new Intent(getApplicationContext(),MainActivityLast.class);
                intent5.putExtra("res5",c[0]+" "+w[0]);
                intent5.putExtra("name",name);
                startActivity(intent5);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quit5=new Intent(getApplicationContext(),MainActivityLast.class);
                quit5.putExtra("res5", c[0] +" "+ w[0]);
                startActivity(quit5);
            }
        });
    }
}