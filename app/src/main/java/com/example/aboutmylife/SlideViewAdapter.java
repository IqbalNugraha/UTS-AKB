package com.example.aboutmylife;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import me.relex.circleindicator.CircleIndicator;

public class SlideViewAdapter extends PagerAdapter {

    Context ctx;

    public SlideViewAdapter (Context ctx){
        this.ctx = ctx;
    }
    @Override
    public int getCount(){
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object){
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_screen,container, false);

        ImageView imageView = view.findViewById(R.id.page1);


        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.view1);
                break;
            case 1:
                imageView.setImageResource(R.drawable.view2);
                break;
            case 2:
                imageView.setImageResource(R.drawable.view3);
                break;
        }

        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
