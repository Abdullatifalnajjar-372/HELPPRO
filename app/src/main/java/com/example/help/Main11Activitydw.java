package com.example.help;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class Main11Activitydw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11_activitydw);
        Button a1 = findViewById(R.id.button7);
        Button a2 = findViewById(R.id.button8);
        Button a3 = findViewById(R.id.button9);
        Button a4 = findViewById(R.id.button10);
        Button a5 = findViewById(R.id.button11);
        Button a6 = findViewById(R.id.button12);
        Button a7 = findViewById(R.id.button13);
        Button a8 = findViewById(R.id.back9);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Main11Activitydw.this,Main23Activitytfl.class);
                startActivity(n);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(Main11Activitydw.this,Main24Activitysci.class);
                startActivity(r);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(Main11Activitydw.this,Main26Activitymath.class);
                startActivity(d);
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Main11Activitydw.this,Main25Activitysoccer.class);
                startActivity(a);
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(Main11Activitydw.this,Main27Activityswim.class);
                startActivity(l);
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(Main11Activitydw.this,Main28Activitykarate.class);
                startActivity(f);
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fa = new Intent(Main11Activitydw.this,Main29Activitychef.class);
                startActivity(fa);
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fl = new Intent(Main11Activitydw.this,Main10Activitydw.class);
                startActivity(fl);
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


        Toolbar toolBar = findViewById (R.id.toolbar2);


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
                            Intent a = new Intent(Main11Activitydw.this, Main4Activity.class);
                            startActivity(a);

                        }

                        if (drawerItem.getIdentifier() == 2) {
                            Intent b = new Intent(Main11Activitydw.this, Main7Activityem.class);
                            startActivity(b);

                        }

                        if (drawerItem.getIdentifier() == 3) {

                            Intent c = new Intent(Main11Activitydw.this, Main10Activitydw.class);
                            startActivity(c);
                        }


                        if (drawerItem.getIdentifier() == 8) {

                            Intent g = new Intent(Main11Activitydw.this, Main6Activity.class);
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
