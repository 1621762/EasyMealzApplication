package com.example.applicationeasymealz;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PersonalDataActivity extends AppCompatActivity {

     EditText name, bmi, date, age;
     Button insert, update, delete, view;
     DBHelper DB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);

        name = findViewById(R.id.name);
        bmi = findViewById(R.id.bmi);
        date = findViewById(R.id.date);
        age = findViewById(R.id.age);

        insert = findViewById(R.id.Insertbutton);
        update = findViewById(R.id.Updatebutton);
        delete = findViewById(R.id.Deletebutton);
        view = findViewById(R.id.Viewbutton);
        DB = new DBHelper((this));

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String bmiTXT = bmi.getText().toString();
                String dateTXT = date.getText().toString();
                String ageTXT =age.getText().toString();

                Boolean checkinsertdata = DB.insertUserdata(nameTXT, bmiTXT, dateTXT, ageTXT);
                if(checkinsertdata==true)
                    Toast.makeText(PersonalDataActivity.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(PersonalDataActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();


            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String bmiTXT = bmi.getText().toString();
                String dateTXT = date.getText().toString();
                String ageTXT = age.getText().toString();

                Boolean checkupdatedata = DB.updateUserdata(nameTXT, bmiTXT, dateTXT, ageTXT);
                if(checkupdatedata==true)
                    Toast.makeText(PersonalDataActivity.this, "Entry Updated ", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(PersonalDataActivity.this, "New Entry Not Updated", Toast.LENGTH_SHORT).show();


            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();

                Boolean checkdeletedata = DB.deleteUserdata(nameTXT);
                if(checkdeletedata==true)
                    Toast.makeText(PersonalDataActivity.this, "Entry Deleted ", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(PersonalDataActivity.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();

            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getUserdata();
                if(res.getCount()==0) {
                    Toast.makeText(PersonalDataActivity.this,"No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()) {
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("BMI :"+res.getString(1)+"\n");
                    buffer.append("Date :"+res.getString(2)+"\n\n");
                    buffer.append("Age :"+res.getString(3)+"\n\n\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(PersonalDataActivity.this);
                builder.setCancelable(true);
                builder.setTitle("User Entries");
                builder.setMessage(buffer.toString());
                builder.show();


            }
        });


    }}
