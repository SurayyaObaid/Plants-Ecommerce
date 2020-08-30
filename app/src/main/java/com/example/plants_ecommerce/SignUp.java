package com.example.plants_ecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import com.google.firebase.database.DatabaseReference;

public class SignUp extends AppCompatActivity {

      private EditText fName,lName,email,password,cpassword;
      private FirebaseAuth auth;
    @Override
        protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_up);
        auth = FirebaseAuth.getInstance();
        fName =findViewById(R.id.fName);
        lName=findViewById(R.id.lName);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        if(auth.getCurrentUser()!=null){
            startActivity(new Intent(SignUp.this,MainActivity.class));
        }
        //final EditText cpassword=findViewById(R.id.cpassword);
          Button signup=findViewById(R.id.MainActivityLink);
          signup.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  String text_fName= fName.getText().toString();
                  String text_lName= lName.getText().toString();
                  String text_email= email.getText().toString();
                  String text_password= password.getText().toString();
                  //String text_cpassword= cpassword.getText().toString();

                  if(TextUtils.isEmpty(text_fName) || TextUtils.isEmpty(text_lName) || TextUtils.isEmpty(text_email) || TextUtils.isEmpty(text_password) ){
                      Toast.makeText(SignUp.this,"Fill the fields", Toast.LENGTH_SHORT).show();
                  }

                  else if (text_password.length()<= 7){
                      Toast.makeText(SignUp.this,"Password too short", Toast.LENGTH_SHORT).show();
                  }
                  else{
                      auth.createUserWithEmailAndPassword(text_email,text_password).addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
                          @Override
                          public void onComplete(@NonNull Task<AuthResult> task) {
                              if(task.isSuccessful()) {
                                  String user_id = auth.getCurrentUser().getUid();


                                  Toast.makeText(SignUp.this, "Signed up Successfully", Toast.LENGTH_LONG).show();
                                  Intent in=new Intent(SignUp.this,Registration.class);
                                  startActivity(in);
                                  finish();
                              }
                              else {
                                  Toast.makeText(SignUp.this, "Try again", Toast.LENGTH_LONG).show();
                              }
                          }
                      });
                  }


              }
          });
          Button login=findViewById(R.id.login_Link);
          login.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent in=new Intent(SignUp.this,Registration.class);
                  startActivity(in);
                  finish();
              }
          });

    }

    private void registerUser(String fName, String lName, String email, String password) {
        auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    String user_id = auth.getCurrentUser().getUid();


                    Toast.makeText(SignUp.this, "Signed up Successfully", Toast.LENGTH_LONG).show();
                    Intent in=new Intent(SignUp.this,Registration.class);
                    startActivity(in);
                }
                else {
                    Toast.makeText(SignUp.this, "Try again", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = auth.getCurrentUser();
        //updateUI(currentUser);
    }

}
