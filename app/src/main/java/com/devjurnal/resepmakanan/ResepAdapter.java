package com.devjurnal.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.MyViewHolder> {
    private static final String TAG = "ResepAdapter";
    private Context context;
    private ArrayList<ResepModel> listResep;


    // TODO 6.1. Buat Konstruktor
    public ResepAdapter(Context context, ArrayList<ResepModel> listResep) {
        this.context = context;
        this.listResep = listResep;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // TODO 6.2 isi Method
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.resep_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        String JudulResep = listResep.get(position).getJudul();
        String DescResep = listResep.get(position).getSummary();

        Log.d(TAG, "onBindViewHolder: "+ JudulResep+DescResep);
        holder.tvJudulResep.setText(listResep.get(position).getJudul());
        holder.tvDescResep.setText(listResep.get(position).getSummary());

        Glide.with(context).load(listResep.get(position).getPoster()).into(holder.ivPosterResep);


        holder.tvJudulResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                test position
//                Toast.makeText(context, "posisi ada di - " + position, Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(context, RincianActivity.class);

                pindah.putExtra("DataJudul",listResep.get(position).getJudul());
                pindah.putExtra("DataPoster", listResep.get(position).getPoster());
                pindah.putExtra("DataDetail", listResep.get(position).getDetail());
                context.startActivity(pindah);
            }
        });

        holder.tvDescResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(context, RincianActivity.class);

                pindah.putExtra("DataJudul",listResep.get(position).getJudul());
                pindah.putExtra("DataPoster", listResep.get(position).getPoster());
                pindah.putExtra("DataDetail", listResep.get(position).getDetail());
                context.startActivity(pindah);
            }
        });


    }

    @Override
    public int getItemCount() {
        // TODO 6.4 hitung size list
        return listResep.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // TODO 6.3 isi class MyViewHolder extends ....
        TextView tvJudulResep;
        TextView tvDescResep;
        ImageView ivPosterResep;


        public MyViewHolder(View itemView) {
            super(itemView);

            tvJudulResep =  itemView.findViewById(R.id.tvItemJudul);
            tvDescResep =  itemView.findViewById(R.id.tvItemDesc);
            ivPosterResep = itemView.findViewById(R.id.ivItemPoster);

        }
    }
}
