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
import com.example.aboutmylife.adapter.HelperAdapterFriend;
import com.example.aboutmylife.R;

import java.util.ArrayList;

public class ContactFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList imagesTeman, namaTeman;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewKontak);
        imagesTeman = new ArrayList();
        namaTeman = new ArrayList();
        for (int i = 0; i< Adapter.namaTeman.length; i++)
        {
            imagesTeman.add(Adapter.fotoTeman);
            namaTeman.add(Adapter.namaTeman);
        }
        HelperAdapterFriend helperAdapterFriend = new HelperAdapterFriend(getContext(), imagesTeman, namaTeman);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(helperAdapterFriend);

        return view;
    }
}