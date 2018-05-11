package com.example.sheetal.trucksta;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intro extends AppCompatActivity implements View.OnClickListener {

     ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        actionBar = getSupportActionBar();
        actionBar.hide();

        Button s1 = findViewById(R.id.sign);
        Button s2=findViewById(R.id.login);
        s1.setOnClickListener(this);
        s2.setOnClickListener(this);

    }
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.sign:
                Intent intent1=new Intent(v.getContext(),LoginActivity.class);
                v.getContext().startActivity(intent1);
                break;

            case R.id.login:
                Intent intent2=new Intent(v.getContext(),register.class);
                v.getContext().startActivity(intent2);
                break;

            default:
                break;
        }

    }
}
