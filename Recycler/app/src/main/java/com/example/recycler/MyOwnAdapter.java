package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyViewHolder> {

    Context ctx;
    String data[];
    int images[];

    public MyOwnAdapter(Context ct, String s[], int imgs[])
    {
        ctx=ct;
        data=s;
        images=imgs;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater myInflate = LayoutInflater.from(ctx);
        View v = myInflate.inflate(R.layout.mylayout,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
            holder.t.setText(data[position]);
            holder.i.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView t;
        ImageView i;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            t = (TextView) itemView.findViewById(R.id.textId);
            i = (ImageView) itemView.findViewById(R.id.imageId);
        }
    }
}
