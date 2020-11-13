package com.example.tvshowsapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tvshowsapp.repositories.TVShowDetailsRepository;
import com.example.tvshowsapp.responses.TVShowDetailsResponse;

public class TVShowDetailsViewModel  extends ViewModel {
    private TVShowDetailsRepository tvShowDetailsRepository;
    public TVShowDetailsViewModel(){
        tvShowDetailsRepository=new TVShowDetailsRepository();
    }
    public LiveData<TVShowDetailsResponse> getTVShowDetails(String tvShowId){
        return tvShowDetailsRepository.getTVShowDetails(tvShowId);
    }

}
