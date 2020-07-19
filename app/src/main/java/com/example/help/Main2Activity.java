package com.example.help;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {
    EditText mFullname,mEmail,mPass,mCPass;
    Button Regbutton;
    ProgressBar progressBar;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setupUIViews();
        firebaseAuth = FirebaseAuth.getInstance();
        Regbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (validate()) {
                   String user_email= mEmail.getText().toString().trim();
                   String user_password = mEmail.getText().toString().trim();

                   firebaseAuth.createUserWithEmailAndPassword(user_email, user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                       @Override
                       public void onComplete(@NonNull Task<AuthResult> task) {

                           if (task.isSuccessful()){

                               Toast.makeText(Main2Activity.this, "تم التسجيل", Toast.LENGTH_SHORT).show();
                               startActivity(new Intent(Main2Activity.this,MainActivity.class));
                           }else {
                               Toast.makeText(Main2Activity.this, "يوجد خطا", Toast.LENGTH_SHORT).show();
                           }
                       }
                   });
               }
            }
        });

    }
      private void setupUIViews() {

          mFullname = findViewById(R.id.tname);
          mEmail = findViewById(R.id.email);
          mPass = findViewById(R.id.password);
          mCPass = findViewById(R.id.passwordcon);
          Regbutton = findViewById(R.id.tsjeel);
          progressBar = findViewById(R.id.progressBar);


          Button back = findViewById(R.id.back);
          back.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent s = new Intent(Main2Activity.this, MainActivity.class);
                  startActivity(s);
              }
          });


      }

    private Boolean validate(){
        Boolean result = false;

        String name = mFullname.getText().toString();
        String password = mPass.getText().toString();
        String email = mEmail.getText().toString();

        if(name.isEmpty() || password.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "يرجى تعبئة البيانات", Toast.LENGTH_SHORT).show();
        }else {
            result = true;
        }
        return result;
    }
}

