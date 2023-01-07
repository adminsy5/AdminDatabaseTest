package com.msfpiyush.admindatabasetest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myAdapter extends FirebaseRecyclerAdapter<Model,myAdapter.myViewHolder>
{
    public myAdapter(@NonNull FirebaseRecyclerOptions<Model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull Model model)
    {
        holder.getRno.setText(model.getMyRno());
        holder.getClass.setText(model.getMyClass());
        holder.getName.setText(model.getMyName());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
       return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder
    {
        TextView getRno,getName,getClass;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            getRno=itemView.findViewById(R.id.getRno);
            getName=itemView.findViewById(R.id.getName);
            getClass=itemView.findViewById(R.id.getClass);
        }
    }
}
