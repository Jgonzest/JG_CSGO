package com.example.jg_csgo.Api;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jg_csgo.R;

public class CSGOAdapter extends RecyclerView.Adapter<CSGOAdapter.CSGOViewHolder> {
    class CSGOAdapter extends RecyclerView.CSGOViewHolder{
    public final TextView csgoItemView;
    final CSGOAdapter mAdapter;

    public CSGOViewHolder(View itemView,CSGOAdapter adapter){
        super(itemView);
        csgoItemView = itemView.findViewById(R.id.word);
        this.mAdapter = adapter;

    }
    }



    @NonNull
    @Override
    public CSGOAdapter.CSGOViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CSGOAdapter.CSGOViewHolder csgoViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
