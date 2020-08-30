package com.example.plants_ecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {
    EditText email,password;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        email= findViewById(R.id.email);
        password=findViewById(R.id.password);
        auth= FirebaseAuth.getInstance();
        Button login=findViewById(R.id.MainActivityLink);
       login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_email= email.getText().toString();
                String text_password= password.getText().toString();
                if(TextUtils.isEmpty(text_email) || TextUtils.isEmpty(text_password)){
                    Toast.makeText(Registration.this,"Fill the fields", Toast.LENGTH_SHORT).show();
                }
                    auth.signInWithEmailAndPassword(text_email,text_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(Registration.this, "Logged in Successfully", Toast.LENGTH_LONG).show();
                                Intent in=new Intent(Registration.this,BuySeeds.class);
                                startActivity(in);
                            }
                            else{
                                Toast.makeText(Registration.this, "Problem signing in", Toast.LENGTH_LONG).show();
                            }
                        }
                    });

            }
        });
        Button signup=findViewById(R.id.signup_Link);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Registration.this,SignUp.class);
                startActivity(in);
                finish();
            }
        });
    }
}