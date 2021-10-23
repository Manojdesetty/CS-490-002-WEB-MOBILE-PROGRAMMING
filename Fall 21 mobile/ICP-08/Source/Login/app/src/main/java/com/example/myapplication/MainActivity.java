package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public void login (View view) {
        EditText username = (EditText) findViewById(R.id.userName);
        EditText password = (EditText) findViewById(R.id.password);
        Button button = findViewById(R.id.button);
        String userName = username.getText().toString();
        String passWord = password.getText().toString();
        if (userName.equals("admin") && passWord.equals("12345")) {
            otherActivity();
        }
        else {

            new AlertDialog.Builder(this)
                    .setMessage("Invalid Username or Password")
                    .setCancelable(true)
                    .setPositiveButton(
                            "OK", (dialog, id) -> dialog.cancel())
                    .show(); }
    }
    public void otherActivity(){
        Intent homeintent = new Intent(this, NewActivity.class);
        startActivity(homeintent);
    }@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}