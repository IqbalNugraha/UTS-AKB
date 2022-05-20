package com.example.aboutmylife.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.aboutmylife.R;

import java.util.ArrayList;

public class AdapterGallery extends RecyclerView.Adapter<AdapterGallery.ViewHolder>{
    ArrayList<String> urls;
    Context context;

    public AdapterGallery(ArrayList<String> ImgUrl, Context context_)
    {
        this.urls = ImgUrl;
        this.context = context_;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView image;

        public ViewHolder(View v)
        {
            super(v);
            image =(ImageView)v.findViewById(R.id.imageGaleri);
        }

        public ImageView getImage(){ return this.image;}
    }


    @NonNull
    @Override
    public AdapterGallery.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_galeri, parent, false);
        v.setLayoutParams(new RecyclerView.LayoutParams(350,350));
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterGallery.ViewHolder holder, int position) {
        Glide.with(this.context)
                .load(urls.get(position))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.getImage());
    }

    @Override
    public int getItemCount() {
        return urls.size();
    }
}
