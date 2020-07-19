package com.example.help;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText Password;
    private Button Login;
    private TextView Info;
    FirebaseAuth fAuth;
    Button register;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.login);
        Password = (EditText) findViewById(R.id.login2);
        Login = (Button) findViewById(R.id.login3);
        Info = (TextView) findViewById(R.id.info);
        register = findViewById(R.id.button2);
        Info.setText("No of attempsts remaining : 5");

        fAuth = FirebaseAuth.getInstance();
        FirebaseUser user = fAuth.getCurrentUser();
        if (user != null) {
            finish();
            startActivity(new Intent(MainActivity.this,Main3Activity.class));
        }

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });



        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(email.getText().toString(), Password.getText().toString());
                String emails = email.getText().toString();
                String password = Password.getText().toString().trim();
                if (TextUtils.isEmpty(emails)){
                    email.setError("يرجى كتابة الايميل");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    Password.setError("يرجى كتابة كلمة السر");
                    return;
                }
                if (password.length() < 3){
                    Password.setError("يرجى كتابة كلمة السر باكثر من ثلاث حروف");
                    return;
                }

            }
        });
    }

    private void validate(String userEmail, String userPassword) {
        fAuth.signInWithEmailAndPassword(userEmail, userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(MainActivity.this, "أهلا بكا", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,Main3Activity.class));

                }else {
                    Toast.makeText(MainActivity.this, "يوجد خطاا", Toast.LENGTH_SHORT).show();
                    counter--;
                    Info.setText("No of attempsts remaining : "+ counter);
                    if (counter == 0){
                        Login.setEnabled(false);
                    }
                    }
                }
            });

    }
}