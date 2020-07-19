package com.example.help;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView dr = findViewById(R.id.dr);
        TextView teach = findViewById(R.id.teach);
        TextView dr3 = findViewById(R.id.dr3);
        TextView hnda = findViewById(R.id.hnda);
        Button back = findViewById(R.id.back2);
        Button next = findViewById(R.id.button3);


        dr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teb = new Intent(Main4Activity.this,Main30Activitymid.class);
                startActivity(teb);
            }
        });

        hnda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent engn = new Intent(Main4Activity.this,Main31Activityengn.class);
                startActivity(engn);
            }
        });
        teach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teach = new Intent(Main4Activity.this,Main32Activityteaching.class);
                startActivity(teach);
            }
        });
        dr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dr3 = new Intent(Main4Activity.this,Main33Activityydawe.class);
                startActivity(dr3);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Main4Activity.this,Main3Activity.class);
                startActivity(back);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res = new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(res);
            }
        });






        @SuppressLint("ResourceAsColor") AccountHeader hr = new AccountHeaderBuilder()
                .withActivity (this)
                .withHeaderBackground(R.drawable.logo3)
                .build ();

        PrimaryDrawerItem item1 = new PrimaryDrawerItem() .withIdentifier(1) .withName ("تبي وظيفة ؟").withIcon (R.drawable.career);

        PrimaryDrawerItem item2 = new PrimaryDrawerItem() .withIdentifier(2) .withName ("تبي موظف ؟").withIcon (R.drawable.employee);

        PrimaryDrawerItem item3 = new PrimaryDrawerItem() .withIdentifier(3) .withName ("تبي تتطور ؟").withIcon (R.drawable.book);


        SecondaryDrawerItem item8 = new SecondaryDrawerItem() .withIdentifier(8) .withName ("منو احنا ؟").withIcon (R.drawable.info);

        //SecondaryDrawerItem item9 = new SecondaryDrawerItem() .withIdentifier(9) .withName ("Ask us").withIcon (R.drawable.info);

        //SecondaryDrawerItem item10 = new SecondaryDrawerItem() .withIdentifier(10) .withName ("Settings").withIcon (R.drawable.drawing);


        Toolbar toolBar = findViewById (R.id.toolbar);


        Drawer build = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolBar)
                .withAccountHeader(hr)
                .addDrawerItems(item1)
                .addDrawerItems(item2)
                .addDrawerItems(item3)

                .addDrawerItems(new DividerDrawerItem())

                .addDrawerItems(item8)
                //.addDrawerItems(item9)
                //.addDrawerItems(item10)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        if (drawerItem.getIdentifier() == 1) {
                            Intent a = new Intent(Main4Activity.this, Main4Activity.class);
                            startActivity(a);

                        }

                        if (drawerItem.getIdentifier() == 2) {
                            Intent b = new Intent(Main4Activity.this, Main7Activityem.class);
                            startActivity(b);

                        }

                        if (drawerItem.getIdentifier() == 3) {

                            Intent c = new Intent(Main4Activity.this, Main10Activitydw.class);
                            startActivity(c);
                        }


                        if (drawerItem.getIdentifier() == 8) {

                            Intent g = new Intent(Main4Activity.this, Main6Activity.class);
                            startActivity(g);
                        }
                        return false;

                       // if (drawerItem.getIdentifier() == 9) {

                           // Intent h = new Intent(Main4Activity.this, Main10Activitydw.class);
                           // startActivity(h);
                        }

                       // if (drawerItem.getIdentifier() == 10) {

                            //Intent i = new Intent(Main4Activity.this, Main10Activitydw.class);
                            //startActivity(i);
                        //}
                      // return false;
                         //}
                })


                .build();


    }
}
