package com.example.help;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.io.IOException;

public class Main38Activitymaana extends AppCompatActivity {
    private ImageView cv;
    private static final int PICK_IMAGE =1;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main38_activitymaana);
        Uri imageUri ;

        cv = (ImageView) findViewById(R.id.cv7);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gallery = new Intent();
                gallery.setType("image/*");
                gallery.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(gallery,"select Picture"),PICK_IMAGE);


            }
        });


        Button back = findViewById(R.id.prev7);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main38Activitymaana.this,Main5Activity.class);
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


        Toolbar toolBar = findViewById (R.id.toolbar27);


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
                            Intent a = new Intent(Main38Activitymaana.this, Main4Activity.class);
                            startActivity(a);

                        }

                        if (drawerItem.getIdentifier() == 2) {
                            Intent b = new Intent(Main38Activitymaana.this, Main7Activityem.class);
                            startActivity(b);

                        }

                        if (drawerItem.getIdentifier() == 3) {

                            Intent c = new Intent(Main38Activitymaana.this, Main10Activitydw.class);
                            startActivity(c);
                        }


                        if (drawerItem.getIdentifier() == 8) {

                            Intent g = new Intent(Main38Activitymaana.this, Main6Activity.class);
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
        final TextView ab = findViewById(R.id.emal24);


        Button sendus = findViewById(R.id.mailthem7);
        sendus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("mailto:" + ab.getText().toString()));
                startActivity(send);
            }


        });

        Button ts = findViewById(R.id.ts6);
        final EditText name = findViewById(R.id.side29);
        final EditText email = findViewById(R.id.side27);
        final EditText phone = findViewById(R.id.side30);

        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        String names = name.getText().toString();
        String emails = email.getText().toString();
        String phones = phone.getText().toString();

        if(names.isEmpty() || phones.isEmpty() || emails.isEmpty()) {

            Toast.makeText(Main38Activitymaana.this, "يرجى تعبئة البيانات", Toast.LENGTH_SHORT).show();
        }else {
            Intent i = new Intent(Main38Activitymaana.this,Main8Activityem.class);
            startActivity(i);
        }
        return ;
    }
});
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK){
            imageUri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),imageUri);
                cv.setImageBitmap(bitmap);
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
