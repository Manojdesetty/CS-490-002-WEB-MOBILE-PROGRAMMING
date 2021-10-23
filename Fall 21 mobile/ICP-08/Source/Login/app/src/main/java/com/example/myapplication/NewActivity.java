package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class NewActivity extends AppCompatActivity {
    public void logoutButton(View view) {
        newactivity();
    }
    public void newactivity(){
        Intent newactivity = new Intent(this,MainActivity.class);
        startActivity(newactivity);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
    }

}
