package com.example.tvshowsapp.adapter;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tvshowsapp.databinding.ItemContainerSliderImageBinding;
import com.example.tvshowsapp.models.Episodes;

public class EpisodesAdapter {
    static class EpisodeViewHolder extends RecyclerView.ViewHolder{
        private ItemContainerSliderImageBinding itemContainerEpisodeBinding;
        public EpisodeViewHolder(ItemContainerSliderImageBinding itemContainerEpisodeBinding){
            super(itemContainerEpisodeBinding.getRoot());
            this.itemContainerEpisodeBinding=itemContainerEpisodeBinding;
        }
        public void bindEpisode(Episodes episodes){
            String title="S";
            String season=episodes.getSeason();
            if (season.length()==1){
                season="0".concat(season);
            }
            String episodeNumber=episodes.getEpisode();
           if (episodeNumber.length()==1){
               episodeNumber="0".concat(episodeNumber);
           }
           episodeNumber="E".concat(episodeNumber);
           title=title.concat(season).concat(episodeNumber);
           itemContainerEpisodeBinding.setT
        }

    }
}
