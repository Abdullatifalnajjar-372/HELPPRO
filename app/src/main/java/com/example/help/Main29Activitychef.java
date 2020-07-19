package com.example.help;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class Main29Activitychef extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29_activitychef);

        Button back = findViewById(R.id.rgoo12);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main29Activitychef.this,Main11Activitydw.class);
                startActivity(i);
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


        Toolbar toolBar = findViewById (R.id.toolbar19);


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
                            Intent a = new Intent(Main29Activitychef.this, Main4Activity.class);
                            startActivity(a);

                        }

                        if (drawerItem.getIdentifier() == 2) {
                            Intent b = new Intent(Main29Activitychef.this, Main7Activityem.class);
                            startActivity(b);

                        }

                        if (drawerItem.getIdentifier() == 3) {

                            Intent c = new Intent(Main29Activitychef.this, Main10Activitydw.class);
                            startActivity(c);
                        }


                        if (drawerItem.getIdentifier() == 8) {

                            Intent g = new Intent(Main29Activitychef.this, Main6Activity.class);
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

        final TextView ab = findViewById(R.id.emal17);


        Button sendus = findViewById(R.id.log7);
        sendus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("mailto:" + ab.getText().toString()));
                startActivity(send);
            }


        });
        Button rs = findViewById(R.id.instag12);
        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/k_o_kuwait2?igshid=18ew5zukmvvx3"));
                startActivity(b);


            }
        });
    }
}
