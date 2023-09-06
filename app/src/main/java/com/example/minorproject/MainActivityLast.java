package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityLast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_last);

        String s=getIntent().getStringExtra("res5").toString();
        int c=(int)s.charAt(0)-48;
        int w=(int)s.charAt(2)-48;

        TextView corr=(TextView) findViewById(R.id.textView11);
        TextView wron=(TextView) findViewById(R.id.textView12);
        TextView scor=(TextView) findViewById(R.id.textView14);


        scor.setText("Score:"+c);
        corr.setText("Correct Answers:"+c);
        wron.setText("Wrong Answers:"+w);

        Button restart=(Button) findViewById(R.id.button5);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }

}