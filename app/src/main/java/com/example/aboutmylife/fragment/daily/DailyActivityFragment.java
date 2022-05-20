package com.example.aboutmylife.fragment.daily;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aboutmylife.adapter.Adapter;
import com.example.aboutmylife.adapter.HelperAdapter;
import com.example.aboutmylife.R;

import java.util.ArrayList;

public class DailyActivityFragment extends Fragment {

    @Nullable
    RecyclerView recyclerView;
    ArrayList images, name;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily_activity, container, false);
        recyclerView = view.findViewById(R.id.recycleView);
        images = new ArrayList();
        name = new ArrayList();
        for (int i = 0; i<Adapter.names.length; i++)
        {
            images.add(Adapter.images);
            name.add(Adapter.names);
        }
        HelperAdapter helperAdapter = new HelperAdapter(getContext(), images, name);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(helperAdapter);

        return view;
    }
}