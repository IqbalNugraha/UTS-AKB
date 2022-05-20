package com.example.aboutmylife.fragment.media;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aboutmylife.R;
import com.example.aboutmylife.adapter.AdapterVideo;
import com.example.aboutmylife.adapter.YoutubeVideo;

import java.util.Vector;

public class VideoFragment extends Fragment {

    RecyclerView recyclerView;
    Vector<YoutubeVideo> youtubeVideos = new Vector<YoutubeVideo>();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewVideo);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://user-images.githubusercontent.com/103735612/168526115-f1913025-5e46-4e76-a642-d6be6ec3267c.mp4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://user-images.githubusercontent.com/103735612/168549314-a1b3718f-9768-491f-9ca8-29a20db1e886.mp4\"  frameborder=\"0\" allowfullscreen>></iframe>"));
        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://user-images.githubusercontent.com/103735612/168553665-bbc02c42-d409-4602-81e4-8224e97dfaa3.mp4\"  frameborder=\"0\" allowfullscreen>></iframe>"));
        AdapterVideo videoAdapter = new AdapterVideo(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);

        return view;
    }
}