package com.example.tvshowsapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tvshowsapp.repositories.MostPopularTVShowsRepository;
import com.example.tvshowsapp.responses.TVShowsResponses;

public class MostPopularTVShowsViewModel extends ViewModel {
    private MostPopularTVShowsRepository mostPopularTVShowsRepository;
    public MostPopularTVShowsViewModel(){
        mostPopularTVShowsRepository=new MostPopularTVShowsRepository();
    }
    public LiveData<TVShowsResponses> getMostPopularTVShows(int page){
        return mostPopularTVShowsRepository.getMostPopularTVShows(page);
    }


}
