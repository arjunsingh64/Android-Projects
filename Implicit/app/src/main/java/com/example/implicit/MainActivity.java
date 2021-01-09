package com.example.implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view)
    {
        if(view.getId() == R.id.id1)
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
            startActivity(i);
        }
        else if(view.getId() == R.id.id2)
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
            startActivity(i);
        }else
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
            startActivity(i);
        }
    }
}