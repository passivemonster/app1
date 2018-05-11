package com.example.sheetal.trucksta;

//import android.content.Intent;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class enter extends AppCompatActivity {

    private static int splash_time_out=1500;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        actionBar = getSupportActionBar();
        actionBar.hide();


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent myintent=new Intent(enter.this,lang.class);
                startActivity(myintent);
                finish();
            }
        },splash_time_out);



    }
}
