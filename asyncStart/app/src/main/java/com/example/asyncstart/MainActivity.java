package com.example.asyncstart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyAsyncTaskClass matc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunc(View view)
    {
            matc = new MyAsyncTaskClass(this);
            matc.execute();
    }

}
