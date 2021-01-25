package com.example.important;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    CheckBox ch1,ch2;
    ToggleButton tb;

    public void fun(View view)
    {
        if(view.getId() == R.id.r1)
        {
            Toast.makeText(this,"MALE", Toast.LENGTH_SHORT).show();
        }else
        {
            //if(view.getId() == R.id.r1)
            {
                Toast.makeText(this,"feMALE", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void click(View v)
    {
        AlertDialog.Builder alertVar = new AlertDialog.Builder(this);
        alertVar.setTitle("CONFIRM EXIT");
        alertVar.setMessage("Are You Sure....");
        alertVar.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertVar.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alertVar.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = (CheckBox) findViewById(R.id.cid1);
        ch2 = (CheckBox) findViewById(R.id.cid2);

        tb = (ToggleButton) findViewById(R.id.tbid);


        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                Toast.makeText(MainActivity.this, "You Choose English", Toast.LENGTH_SHORT).show();
            }
        });

        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                Toast.makeText(MainActivity.this, "You Choose Hindi", Toast.LENGTH_SHORT).show();
            }
        });

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tb.isChecked())
                {
                    Toast.makeText(MainActivity.this, "You off toggle button", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "You on toggle button", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}