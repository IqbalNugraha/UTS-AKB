package com.example.aboutmylife.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.aboutmylife.R;

import java.util.ArrayList;

public class AdapterMusic extends RecyclerView.Adapter{

    ArrayList link, judul;
    Context context;
    ImageView imageView;

    public AdapterMusic(Context context, ArrayList link, ArrayList judul){
        this.context = context;
        this.link = link;
        this.judul = judul;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_music, parent, false);
        ViewHolderClass viewHolderClass = new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        AdapterMusic.ViewHolderClass viewHolderClass = (AdapterMusic.ViewHolderClass) holder;
        viewHolderClass.imageView.setImageResource(Adapter.fotoLagu[position]);
        viewHolderClass.textView.setText(Adapter.judulLagu[position]);


    }

    @Override
    public int getItemCount() {
        return judul.size();
    }


    public class ViewHolderClass extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;


        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.fotoLagu);
            textView = (TextView) itemView.findViewById(R.id.judulLagu);
        }
    }
}
