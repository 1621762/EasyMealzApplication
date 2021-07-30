package com.example.applicationeasymealz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button vegetarianbutton, lambbutton, chickenbutton, halalbutton, glutenbutton, lactosebutton, bmibtn, befoodsmartbtn, bmihealthadvicebtn, personaldatabtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        vegetarianbutton = (Button) findViewById(R.id.vegetarianbutton);
        lambbutton = (Button) findViewById(R.id.lambbutton);
        chickenbutton = (Button) findViewById(R.id.chickenbutton);
        halalbutton = (Button) findViewById(R.id.halalbutton);
        lactosebutton = (Button) findViewById(R.id.lactosebutton);
        glutenbutton = (Button) findViewById(R.id.glutenbutton);
        bmibtn = (Button) findViewById(R.id.bmibtn);
        befoodsmartbtn = (Button) findViewById(R.id.befoodsmartbtn);
        bmihealthadvicebtn = (Button) findViewById(R.id.bmihealthadvicebtn);
        personaldatabtn =(Button) findViewById(R.id.personaldatabtn);

        vegetarianbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, VegetarianActivity.class));

            }

        });

        lambbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, LambActivity.class));


            }
        });

        chickenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ChickenActivity.class));

            }

        });

        halalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, HalalActivity.class));


            }
        });

        lactosebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, LactoseActivity.class));

            }

        });

        glutenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, GlutenActivity.class));


            }
        });

        bmibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, splashActivity.class));

            }

        });

        befoodsmartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, BeFoodSmartActivity.class));


            }
        });

        bmihealthadvicebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, BMIHealthAdviceActivity.class));

            }

        });

        personaldatabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, PersonalDataActivity.class));

            }

        });

    }}
