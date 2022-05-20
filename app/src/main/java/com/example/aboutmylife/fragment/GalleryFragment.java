package com.example.aboutmylife.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aboutmylife.adapter.AdapterGallery;
import com.example.aboutmylife.R;

import java.util.ArrayList;


public class GalleryFragment extends Fragment {

    ArrayList<String> ImgUrl= new ArrayList<>();
    RecyclerView recyclerView;
    AdapterGallery adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ImgUrl.add("https://user-images.githubusercontent.com/103735612/168415712-9f070eeb-5c6e-4559-b1e0-58aeae1c84fd.png");
        ImgUrl.add("https://user-images.githubusercontent.com/103735612/168415709-470b32f7-250f-4afe-b456-fd94618f94de.png");
        ImgUrl.add("https://user-images.githubusercontent.com/103735612/168415707-aae6f891-4929-4203-a2f8-b5b70df56b77.png");
        ImgUrl.add("https://user-images.githubusercontent.com/103735612/168416066-67cd2940-78fc-426b-b357-039f55c42ebe.png");
        ImgUrl.add("https://user-images.githubusercontent.com/103735612/168415699-ca76c8a3-13ed-41b5-9505-994ebd2d6f39.png");
        ImgUrl.add("https://user-images.githubusercontent.com/103735612/168415695-d8ff4cd8-b262-4927-8e09-f3ffda10d36b.png");


        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        this.recyclerView = (RecyclerView)view.findViewById(R.id.recycleView);
        int numberOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
        adapter = new AdapterGallery(ImgUrl, getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }
}