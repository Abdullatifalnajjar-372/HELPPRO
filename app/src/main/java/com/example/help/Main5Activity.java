package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        TextView dr2 = findViewById(R.id.dr2);
        TextView teach2 = findViewById(R.id.teach2);
        TextView hnda2 = findViewById(R.id.hnda2);
        Button back2 = findViewById(R.id.back3);


        dr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teb = new Intent(Main5Activity.this,Main35Activityamn.class);
                startActivity(teb);
            }
        });

        hnda2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent engn = new Intent(Main5Activity.this,Main36Activitybsn.class);
                startActivity(engn);
            }
        });
        teach2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teach = new Intent(Main5Activity.this,Main38Activitymaana.class);
                startActivity(teach);
            }
        });


        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Main5Activity.this,Main4Activity.class);
                startActivity(back);
            }
        });
    }
}
