package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main7Activityem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7_activityem);

        TextView dr6 = findViewById(R.id.dr6);
        TextView teach4 = findViewById(R.id.teach4);
        TextView hnda4 = findViewById(R.id.hnda4);
        Button back5 = findViewById(R.id.back5);



        dr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teb = new Intent(Main7Activityem.this,Main39Activitydr.class);
                startActivity(teb);
            }
        });

        hnda4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent engn = new Intent(Main7Activityem.this,Main40Activitymhnds.class);
                startActivity(engn);
            }
        });
        teach4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teach = new Intent(Main7Activityem.this,Main41Activityteacher.class);
                startActivity(teach);
            }
        });


        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Main7Activityem.this,Main3Activity.class);
                startActivity(back);
            }
        });
    }
}
