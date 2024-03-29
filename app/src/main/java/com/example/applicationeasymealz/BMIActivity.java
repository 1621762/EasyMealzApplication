package com.example.applicationeasymealz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class BMIActivity extends AppCompatActivity {

    android.widget.Button mrecalculatebmi;

    TextView mbmidisplay,magedisplay,mweightdisplay,mheightdisplay,mbmicategory,mgender;
    Intent intent;
    ImageView mimageview;
    String mbmi;
    String category;
    float intbmi;

    String height;
    String weight;
    float intheight,intweight;

    RelativeLayout mbackground;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i);

        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"white\"></font>"));
        getSupportActionBar().setTitle("Result");
        ColorDrawable colorDrawable=new ColorDrawable(Color.parseColor("#E6991E"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);





        intent=getIntent();
        mbmidisplay=findViewById(R.id.bmidisplay);
        magedisplay=findViewById(R.id.agedisplay);
        mweightdisplay=findViewById(R.id.weightdisplay);
        mbmicategory = findViewById(R.id.bmicategory);
        mrecalculatebmi=findViewById(R.id.recalculatebmi);
        mimageview=findViewById(R.id.imageview);
        mheightdisplay=findViewById(R.id.heightdisplay);
        mgender=findViewById(R.id.genderdisplay);
        mbackground=findViewById(R.id.contentlayout);


        height=intent.getStringExtra("height");
        weight=intent.getStringExtra("weight");


        intheight=Float.parseFloat(height);
        intweight=Float.parseFloat(weight);

        intheight=intheight/100;
        intbmi=intweight/(intheight*intheight);


        mbmi=Float.toString(intbmi);
        System.out.println(mbmi);

        if(intbmi<16)
        {
            mbmicategory.setText("Severe Thinness");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.crosss);


        }
        else if(intbmi<16.9 && intbmi>16)
        {
            mbmicategory.setText("Moderate Thinness");
            mbackground.setBackgroundColor(R.color.halfwarn);
            mimageview.setImageResource(R.drawable.warning);


        }
        else if(intbmi<18.4 && intbmi>17)
        {
            mbmicategory.setText("Mild Thinness");
            mbackground.setBackgroundColor(R.color.halfwarn);
            mimageview.setImageResource(R.drawable.warning);

        }
        else if(intbmi<24.9 && intbmi>18.5 )
        {
            mbmicategory.setText("Normal");
            mimageview.setImageResource(R.drawable.ok);
            mbackground.setBackgroundColor(Color.YELLOW);

        }
        else if(intbmi <29.9 && intbmi>25)
        {
            mbmicategory.setText("Overweight");
            mbackground.setBackgroundColor(R.color.halfwarn);
            mimageview.setImageResource(R.drawable.warning);

        }
        else if(intbmi<34.9 && intbmi>30)
        {
            mbmicategory.setText("Obese Class I");
            mbackground.setBackgroundColor(R.color.halfwarn);
            mimageview.setImageResource(R.drawable.warning);

        }
        else
        {
            mbmicategory.setText("Obese Class II");
            mbackground.setBackgroundColor(R.color.halfwarn);
            mimageview.setImageResource(R.drawable.crosss);

        }
        magedisplay.setText("your age is"+intent.getStringExtra("age"));
        mheightdisplay.setText("Your Height is "+intent.getStringExtra("height"));
        mweightdisplay.setText("Your Weight is "+intent.getStringExtra("weight"));
        mgender.setText(intent.getStringExtra("gender"));
        mbmidisplay.setText(mbmi);


        mrecalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(getApplicationContext(),BMICalculatorActivity.class);
                startActivity(intent1);
            }
        });



    }
}