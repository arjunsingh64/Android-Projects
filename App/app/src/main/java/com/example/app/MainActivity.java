package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view)
    {
        EditText var1 = (EditText) findViewById(R.id.userId);
        EditText var2 = (EditText) findViewById(R.id.passId);

        Log.i("Username",var1.getText().toString());
        Log.i("Password",var2.getText().toString());

        Toast.makeText(this, "Logged In", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}