package com.example.aboutmylife.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aboutmylife.R;
import com.example.aboutmylife.fragment.profile.AboutFragment;
import com.example.aboutmylife.fragment.profile.MapFragment;
import com.example.aboutmylife.fragment.profile.SosmedFragment;
import com.example.aboutmylife.fragment.profile.UserFragment;

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Button btn = (Button) view.findViewById(R.id.btn_user);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new UserFragment());
                fr.commit();
            }
        });

        Button btn1 = (Button) view.findViewById(R.id.btn_kontak);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new SosmedFragment());
                fr.commit();
            }
        });

        Button btn2 = (Button) view.findViewById(R.id.btn_findMe);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new MapFragment());
                fr.commit();
            }
        });

        Button btn3 = (Button) view.findViewById(R.id.btn_about);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new AboutFragment());
                fr.commit();
            }
        });

        return view;
    }
}