package com.example.asyncstart;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

public class MyAsyncTaskClass extends AsyncTask<Void,Integer,String>
{

    Context ctx;
    ProgressDialog pd;

    public MyAsyncTaskClass(Context ct)
    {
        ctx = ct;
    }

    @Override
    protected void onPreExecute()
    {
        pd = new ProgressDialog(ctx);
        pd.setTitle("DOWNLOADING");
        pd.setMax(10);
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setMessage("please wait....");
        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        pd.show();
    }

    @Override
    protected String doInBackground(Void... voids) {
        try
        {
            for (int i = 1; i <= 10; ++i)
            {
                Thread.sleep(3000);
                Log.i("Thread","Executing"+i);
                publishProgress(i);
            }
            return "Successful";
        }
        catch (Exception e)
        {
            Log.i("Exception",e.getMessage());
            return "Failure";
        }

    }

    @Override
    protected void onProgressUpdate(Integer... values)
    {
            int val = values[0];
            pd.setProgress(val);
    }

    @Override
    protected void onPostExecute(String s)
    {
        Toast.makeText(ctx,s, Toast.LENGTH_SHORT).show();
    }
}
