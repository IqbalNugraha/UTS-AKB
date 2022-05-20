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
import com.example.aboutmylife.fragment.daily.ContactFragment;
import com.example.aboutmylife.fragment.daily.DailyActivityFragment;
import com.example.aboutmylife.fragment.home.HobiFragment;
import com.example.aboutmylife.fragment.home.SelfFragment;


public class DailyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily, container, false);
        Button btn = (Button) view.findViewById(R.id.btn_daily);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_daily, new DailyActivityFragment());
                fr.commit();
            }
        });

        Button btn1 = (Button) view.findViewById(R.id.btn_friend);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_daily, new ContactFragment());
                fr.commit();
            }
        });
        return view;
    }
}