package com.example.sheetal.trucksta;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

public class lang extends AppCompatActivity {
     ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang);
       actionbar=getSupportActionBar();
       actionbar.hide();

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               if(i==1){
                   Toast.makeText(lang.this, ""+
                           i, Toast.LENGTH_SHORT).show();

                   setLocale("en-rCA");
               }
               else if(i==2){
                   setLocale("en-rIN");
               }
               else if(i==3){
                   setLocale("hi-rIN");
               }
               else if(i==4){
                   setLocale("ka-rIN");
               }
               else if(i==5){
                   setLocale("ta");
               }
               else if(i==6){
                   setLocale("ma");
               }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void setLocale(String lang){
        Locale myLocale=new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        Intent intro=new Intent(lang.this,intro.class);
        startActivity(intro);
        finish();

    }

}
