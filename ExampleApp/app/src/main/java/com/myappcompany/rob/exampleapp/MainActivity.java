package com.myappcompany.rob.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.editTextPersonName);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        Log.i("Info",  "Button pressed!");
        Log.i ("Username", nameEditText.getText().toString());
        Log.i ("Password", editTextPassword.getText().toString());

        Toast.makeText(this, "Hi there!" + nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
