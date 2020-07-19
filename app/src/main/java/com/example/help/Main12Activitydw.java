package com.example.help;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class Main12Activitydw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12_activitydw);
        TextView kappa = findViewById(R.id.textView5);
        TextView textkappa = findViewById(R.id.textView6);
        ImageView imgkappa = findViewById(R.id.imageView);


        TextView coded = findViewById(R.id.textView7);
        TextView textcoded = findViewById(R.id.textView8);
        ImageView imgcoded = findViewById(R.id.imageView2);

        TextView rawaj = findViewById(R.id.textView9);
        TextView textrawaj = findViewById(R.id.textView10);
        ImageView imgrawaj = findViewById(R.id.imageView3);

        TextView kisr = findViewById(R.id.textView11);
        TextView textkisr = findViewById(R.id.textView12);
        ImageView imgkisr = findViewById(R.id.imageView4);

        TextView loyac = findViewById(R.id.textView13);
        TextView textloyac = findViewById(R.id.textView14);
        ImageView imgloyac = findViewById(R.id.imageView5);
        Button back = findViewById(R.id.back11);


        kappa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ka = new Intent(Main12Activitydw.this,MainActivitytry.class);
                startActivity(ka);
            }
        });


        textkappa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main12Activitydw.this,MainActivitytry.class);
                startActivity(k);
            }
        });
        imgkappa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Main12Activitydw.this,MainActivitytry.class);
                startActivity(a);
            }
        });


        coded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent co = new Intent(Main12Activitydw.this,Main14Activitybarmej.class);
                startActivity(co);
            }
        });


        textcoded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Main12Activitydw.this,Main14Activitybarmej.class);
                startActivity(c);
            }
        });
        imgcoded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(Main12Activitydw.this,Main14Activitybarmej.class);
                startActivity(o);
            }
        });



        kisr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kisr = new Intent(Main12Activitydw.this,Main16Activitykisr.class);
                startActivity(kisr);
            }
        });


        textkisr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ki = new Intent(Main12Activitydw.this,Main16Activitykisr.class);
                startActivity(ki);
            }
        });
        imgkisr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kr = new Intent(Main12Activitydw.this,Main16Activitykisr.class);
                startActivity(kr);
            }
        });



        rawaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kisr = new Intent(Main12Activitydw.this,Main15Activityrawaj.class);
                startActivity(kisr);
            }
        });


        textrawaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ki = new Intent(Main12Activitydw.this,Main15Activityrawaj.class);
                startActivity(ki);
            }
        });
        imgrawaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kr = new Intent(Main12Activitydw.this,Main15Activityrawaj.class);
                startActivity(kr);
            }
        });

        loyac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kisr = new Intent(Main12Activitydw.this,Main17Activityloyac.class);
                startActivity(kisr);
            }
        });


        textloyac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ki = new Intent(Main12Activitydw.this,Main17Activityloyac.class);
                startActivity(ki);
            }
        });
        imgloyac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kr = new Intent(Main12Activitydw.this,Main17Activityloyac.class);
                startActivity(kr);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bk = new Intent(Main12Activitydw.this,Main10Activitydw.class);
                startActivity(bk);
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


        Toolbar toolBar = findViewById (R.id.toolbar3);


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
                            Intent a = new Intent(Main12Activitydw.this, Main4Activity.class);
                            startActivity(a);

                        }

                        if (drawerItem.getIdentifier() == 2) {
                            Intent b = new Intent(Main12Activitydw.this, Main7Activityem.class);
                            startActivity(b);

                        }

                        if (drawerItem.getIdentifier() == 3) {

                            Intent c = new Intent(Main12Activitydw.this, Main10Activitydw.class);
                            startActivity(c);
                        }


                        if (drawerItem.getIdentifier() == 8) {

                            Intent g = new Intent(Main12Activitydw.this, Main6Activity.class);
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
