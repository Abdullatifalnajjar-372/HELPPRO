package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RelativeLayout job = findViewById(R.id.job);
        RelativeLayout employee = findViewById(R.id.employee);
        RelativeLayout impro = findViewById(R.id.impro);
        Button button = findViewById(R.id.button);

        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,Main7Activityem.class);
                startActivity(i);
            }
        });



        impro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(Main3Activity.this,Main10Activitydw.class);
                startActivity(r);
            }
        });
    }
}
