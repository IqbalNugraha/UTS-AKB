package com.example.aboutmylife.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aboutmylife.R;

import java.util.ArrayList;

public class HelperAdapterFriend extends RecyclerView.Adapter{


    ArrayList arrayListTeman, arrayListFoto;
    Context context;

    public HelperAdapterFriend(Context context, ArrayList arrayListTeman, ArrayList arrayListFoto){
        this.context = context;
        this.arrayListTeman = arrayListTeman;
        this.arrayListFoto = arrayListFoto;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_friend, parent, false);
        ViewHolderFriend viewHolderFriend = new ViewHolderFriend(view);
        return viewHolderFriend;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderFriend viewHolderFriend = (ViewHolderFriend) holder;
        viewHolderFriend.imageViewTeman.setImageResource(Adapter.fotoTeman[position]);
        viewHolderFriend.textViewTeman.setText(Adapter.namaTeman[position]);
    }

    @Override
    public int getItemCount() {
        return arrayListTeman.size();
    }
    public class ViewHolderFriend extends RecyclerView.ViewHolder{
        ImageView imageViewTeman;
        TextView textViewTeman;
        public ViewHolderFriend(@NonNull View itemView){
            super(itemView);
            imageViewTeman = (ImageView) itemView.findViewById(R.id.imageViewFriend);
            textViewTeman = (TextView) itemView.findViewById(R.id.textViewFriend);
        }
    }
}
