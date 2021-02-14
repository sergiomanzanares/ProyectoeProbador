package com.example.proyectoeprobador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder>{
    private List<String[]> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private int x = 0;

    // data is passed into the constructor
    Adaptador(Context context) {
        this.mInflater = LayoutInflater.from(context);
        mData = new ArrayList<String[]>();
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.adpatdor_layout, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        x++;
        switch (x){
            case 1:
                holder.p0.setImageAlpha(R.drawable.shirt);
                holder.p1.setImageAlpha(R.drawable.shirt);
                holder.p2.setImageAlpha(R.drawable.shirt);
                holder.p3.setImageAlpha(R.drawable.shirt);
                break;
            case 2:
                holder.p0.setImageAlpha(R.drawable.jeans);
                holder.p1.setImageAlpha(R.drawable.jeans);
                holder.p2.setImageAlpha(R.drawable.jeans);
                holder.p3.setImageAlpha(R.drawable.jeans);
                break;
            case 3:
                holder.p0.setImageAlpha(R.drawable.calcetines);
                holder.p1.setImageAlpha(R.drawable.calcetines);
                holder.p2.setImageAlpha(R.drawable.calcetines);
                holder.p3.setImageAlpha(R.drawable.calcetines);
                break;
            case 4:
                holder.p0.setImageAlpha(R.drawable.otros);
                holder.p1.setImageAlpha(R.drawable.otros);
                holder.p2.setImageAlpha(R.drawable.otros);
                holder.p3.setImageAlpha(R.drawable.otros);
        }
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void addData(ArrayList<String[]> info) {
        mData.addAll(info);
        notifyDataSetChanged();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageButton p0,p1,p2,p3;

        ViewHolder(View itemView) {
            super(itemView);
            p0 = itemView.findViewById(R.id.imageButton2);
            p0 = itemView.findViewById(R.id.imageButton2);
            p0 = itemView.findViewById(R.id.imageButton2);
            p0 = itemView.findViewById(R.id.imageButton2);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    String[] getItem(int id) {
        return mData.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
