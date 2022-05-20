package com.example.aboutmylife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class PagerActivity extends AppCompatActivity {

    ViewPager viewPager;
    SlideViewAdapter slideViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);


        viewPager = findViewById(R.id.viewPage);
        slideViewAdapter = new SlideViewAdapter(this);
        viewPager.setAdapter(slideViewAdapter);

        CircleIndicator ci = (CircleIndicator) findViewById(R.id.demo);
        ci.setViewPager(viewPager);
    }


    public void mulai(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}