package com.example.minorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ETname=(EditText) findViewById(R.id.editTextTextPersonName);

        Button start=(Button) findViewById(R.id.button);
        Button about=(Button) findViewById(R.id.button2);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String name=ETname.getText().toString().trim();
                if(name.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Please Enter a name to continue", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent startpage = new Intent(getApplicationContext(), Question1a.class);
                    startpage.putExtra("name", name);
                    startActivity(startpage);
                }
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=ETname.getText().toString();
                Intent aboutpage = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(aboutpage);
            }
        });

    }
}