package com.example.proyectoeprobador;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<String[]> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    Adaptador(Context context) {
        this.mInflater = LayoutInflater.from(context);
        mData = new ArrayList<String[]>();
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.lista_elementos, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String[] info = mData.get(position);
        holder.tvTitulo.setText(info[0]);
        holder.tvDescripcion.setText(info[1]);
        if (info[0].contains("camisa")) {
            holder.imagen.setImageResource(R.drawable.shirt);
        } else if (info[0].contains("pantalon")) {
            holder.imagen.setImageResource(R.drawable.jeans);
        } else if (info[0].contains("zapatillas")) {
            holder.imagen.setImageResource(R.drawable.sneakers);
        } else if (info[0].contains("calcetines")) {
            holder.imagen.setImageResource(R.drawable.calcetines);
        } else if (info[0].contains("otros")) {
            holder.imagen.setImageResource(R.drawable.otros);
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
        TextView tvTitulo;
        TextView tvDescripcion;
        ImageView imagen;

        ViewHolder(View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.TVTitulo);
            tvDescripcion = itemView.findViewById(R.id.TVDescripcion);
            imagen = (ImageView) itemView.findViewById(R.id.imagenLista);
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