package com.example.applicationeasymealz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText registerEmailAddress, registerUsername, registerPassword;
    private Button registerbutton;
    private DataBaseHelper myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerEmailAddress = findViewById(R.id.loginEmailAddress);
        registerUsername = findViewById(R.id.registerusername);
        registerPassword = findViewById(R.id.loginPassword);

        registerbutton = findViewById(R.id.loginbutton);

        myDB = new DataBaseHelper(this);
        insertUser();
    }

    private void insertUser(){
        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean var = myDB.registerUser(registerUsername.getText().toString(), registerEmailAddress.getText().toString(), registerPassword.getText().toString());
                if(var){
                    Toast.makeText(RegisterActivity.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(RegisterActivity.this,"Registration Error",Toast.LENGTH_SHORT).show();
            }
        });
    }
}