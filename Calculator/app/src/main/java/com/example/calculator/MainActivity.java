package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText e1,e2;
    int num1,num2;
    TextView t1;
    String var1,var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean method()
    {
        e1 = (EditText)findViewById(R.id.id1);
        e2 = (EditText)findViewById(R.id.id2);
        t1 = (TextView)findViewById(R.id.textId);

        var1 = e1.getText().toString();
        var2 = e2.getText().toString();

        if((var1.equals(null) && var2.equals(null))||(var1.equals("") && var2.equals("")))
        {
            String result = "Please Enter the numbers";
            t1.setText(result);
            return false;
        }else
        {
            num1 = Integer.parseInt( e1.getText().toString());
            num2 = Integer.parseInt( e2.getText().toString());
        }
        return true;
    }

    public void toadd(View view)
    {
        if(method()) {
            int result = num1 + num2;
            t1.setText(Integer.toString(result));

        }
    }
    public void tosub(View view)
    {
        if(method()) {
            int result = num1 - num2;
            t1.setText(Integer.toString(result));

        }
    }
    public void tomul(View view)
    {
        if(method()) {
            int result = num1 * num2;
            t1.setText(Integer.toString(result));

        }
    }
    public void todiv(View view)
    {
        if(method()) {

            int result=0;

            try {
                result = check(num1,num2);
            }

            catch (ArithmeticException ex)
            {
                String r = ex.getMessage();
                t1.setText(r);
            }

            t1.setText(Integer.toString(result));

        }
    }

    static int check(int num1,int num2)
    {
        int i;
        i = num1/num2;
        return i;
    }


    public void tomod(View view)
    {
        if(method()) {
            int result = num1 % num2;
            t1.setText(Integer.toString(result));
           // Toast.makeText(this,result, Toast.LENGTH_SHORT).show();
        }
    }


}
