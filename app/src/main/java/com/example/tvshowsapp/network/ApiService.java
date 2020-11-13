package com.example.tvshowsapp.network;

import com.example.tvshowsapp.responses.TVShowDetailsResponse;
import com.example.tvshowsapp.responses.TVShowsResponses;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("most-popular")
    Call<TVShowsResponses> getMostPopularTVShows
            (@Query("page")int page);
    @GET("show-details")
    Call<TVShowDetailsResponse> getTVShowDetails(@Query("q") String tvShowId);
}
