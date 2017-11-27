package com.example.fauza.mymdb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    private Context mContext;
    // TODO Make ArrayList of Movie Poster
    public MovieAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_view_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        //TODO Bind MoviePoster from ArrayList to ImageView based on Position
    }

    @Override
    public int getItemCount() {
        //TODO Return size of ArrayList to LayoutManager
        return 0;
    }
}
