package com.example.aboutmylife.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aboutmylife.R;

import java.util.List;

public class AdapterVideo extends RecyclerView.Adapter<AdapterVideo.VideoViewHolder>{
    List<YoutubeVideo> youtubeVideoList;

    public AdapterVideo(){

    }

    public AdapterVideo(List <YoutubeVideo>youtubeVideoList){
        this.youtubeVideoList = youtubeVideoList;
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_video,parent,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        holder.videoWeb.loadData(youtubeVideoList.get(position).getVideoUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView videoWeb;
        public VideoViewHolder (View itemView){
            super(itemView);
            videoWeb = (WebView) itemView.findViewById(R.id.videoViewer);
            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient());
        }
    }

}
