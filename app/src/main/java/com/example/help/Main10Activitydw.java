package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main10Activitydw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10_activitydw);
        TextView dawrat = findViewById(R.id.dawrat);
        TextView dawrat2 = findViewById(R.id.dawrat2);
        TextView dawrat3 = findViewById(R.id.dawrat3);
        Button back8 = findViewById(R.id.back8);

        dawrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Main10Activitydw.this,Main12Activitydw.class);
                startActivity(i);
            }
        });
        dawrat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s =new Intent(Main10Activitydw.this,Main11Activitydw.class);
                startActivity(s);
            }

        });
        dawrat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m =new Intent(Main10Activitydw.this,Main13Activitydw.class);
                startActivity(m);
            }
        });

        back8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main10Activitydw.this,Main3Activity.class);
                startActivity(i);
            }
        });
    }
}
