package com.example.aboutmylife.fragment.media;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aboutmylife.R;
import com.example.aboutmylife.adapter.Adapter;
import com.example.aboutmylife.adapter.AdapterGallery;
import com.example.aboutmylife.adapter.AdapterMusic;
import com.example.aboutmylife.adapter.HelperAdapterFriend;

import java.util.ArrayList;


public class MusicFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList judul,link;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewLagu);
        link = new ArrayList();
        judul = new ArrayList();
        for (int i = 0; i< Adapter.judulLagu.length; i++)
        {
            link.add(Adapter.fotoLagu);
            judul.add(Adapter.judulLagu);
        }
        AdapterMusic adapterMusic = new AdapterMusic(getContext(), link, judul);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterMusic);

        return view;
    }
}