package com.example.aboutmylife;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.aboutmylife.fragment.DailyFragment;
import com.example.aboutmylife.fragment.GalleryFragment;
import com.example.aboutmylife.fragment.HomeFragment;
import com.example.aboutmylife.fragment.MediaFragment;
import com.example.aboutmylife.fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    MediaPlayer mediaPlayer;
    boolean isPlay = false;
    AnimatedBottomBar animatedBottomBar;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = null;

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new HomeFragment());
        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        animatedBottomBar = findViewById(R.id.bottomNavigationView);
        animatedBottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int lastIndex, @Nullable AnimatedBottomBar.Tab lastTab, int newIndex, @NonNull AnimatedBottomBar.Tab newTab) {
                Fragment fragment = null;
                switch (newTab.getId()){
                    case R.id.home_nav:
                        fragment = new HomeFragment();
                        break;

                    case R.id.daily:
                        fragment = new DailyFragment();
                        break;

                    case R.id.galeri:
                        fragment = new GalleryFragment();
                        break;

                    case R.id.music:
                        fragment = new MediaFragment();
                        break;

                    case R.id.profile:
                        fragment = new ProfileFragment();
                        break;
                }
                if (fragment != null){
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.page_container, fragment).commit();
                }
                else{
                    Log.e(TAG, "Error In Creating Fragment");
                }
            }

            @Override
            public void onTabReselected(int i, @NonNull AnimatedBottomBar.Tab tab) {

            }
        });
    }
    //Menampilkan halaman Fragment
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    public void music(View view) {
        switch (view.getId()){
            case R.id.play:
                if (mediaPlayer == null){
                    mediaPlayer = MediaPlayer.create(this, R.raw.angel_baby);
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        stopMusic();
                    }
                });
                mediaPlayer.start();
                break;
            case R.id.pause:
                if(mediaPlayer != null)
                    mediaPlayer.pause();
                break;
            case R.id.stop:
                if(mediaPlayer != null){
                    mediaPlayer.stop();
                    stopMusic();
                }
                break;
        }
    }

    private void stopMusic() {
        mediaPlayer = null;
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopMusic();
    }
}