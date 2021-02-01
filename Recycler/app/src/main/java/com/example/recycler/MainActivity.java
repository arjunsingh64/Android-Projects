package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView r;
    String arr[];
    int img[] = {R.drawable.cpp,R.drawable.j,R.drawable.pyy,R.drawable.clang,R.drawable.html,R.drawable.cpp,R.drawable.j,R.drawable.pyy,R.drawable.clang,R.drawable.html};
    MyOwnAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = (RecyclerView) findViewById(R.id.rid);
        arr = getResources().getStringArray(R.array.Lang);

        ad = new MyOwnAdapter(this,arr,img);

        r.setLayoutManager(new LinearLayoutManager(this));
        r.setAdapter(ad);
    }
}