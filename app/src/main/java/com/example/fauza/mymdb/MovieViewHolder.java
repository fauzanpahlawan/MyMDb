package com.example.fauza.mymdb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;


public class MovieViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageViewMoviePoster;

    public MovieViewHolder(View itemView) {
        super(itemView);
        imageViewMoviePoster = itemView.findViewById(R.id.iv_movie_poster);
    }
}
