package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.edit1);
        e2 = (EditText) findViewById(R.id.edit2);

        registerForContextMenu(e1);
        registerForContextMenu(e2);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        switch(v.getId())
        {
            case R.id.edit1:
                getMenuInflater().inflate(R.menu.edittext1_menu,menu);
                break;

            case  R.id.edit2:
                getMenuInflater().inflate(R.menu.edittext2_menu,menu);
                break;
        }


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.id1:
                Toast.makeText(this, "Apple Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.id2:
                Toast.makeText(this, "Banana Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.i1:
                Toast.makeText(this, "First Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.i2:

                Toast.makeText(this, "Second Clicked", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}