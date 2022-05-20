package com.example.aboutmylife.fragment.profile;

import android.content.Intent;
import android.net.Uri;
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


public class SosmedFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sosmed, container, false);

        Button igButton = (Button)view.findViewById(R.id.btn_ig);
        igButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/iqbaallnugraha/"));
                startActivity(intent);
            }
        });

        Button waButton = (Button)view.findViewById(R.id.btn_wa);
        waButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6282268681612/"));
                startActivity(intent);
            }
        });

        Button tele = (Button)view.findViewById(R.id.btn_tele);
        tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/6282268681612/"));
                startActivity(intent);
            }
        });

        Button fbButton = (Button)view.findViewById(R.id.btn_fb);
        fbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/iqbal.fn/"));
                startActivity(intent);
            }
        });

        Button gmail = (Button)view.findViewById(R.id.btn_gmail);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#inbox?compose=new"));
                startActivity(intent);
            }
        });
        Button github = (Button)view.findViewById(R.id.btn_github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/IqbalNugraha"));
                startActivity(intent);
            }
        });
        return view;
    }
}