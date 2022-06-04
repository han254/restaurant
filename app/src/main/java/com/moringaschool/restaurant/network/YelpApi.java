package com.moringaschool.restaurant.network;

import com.moringaschool.restaurant.models.YelpBusinessesSearchResponse;
import retrofit2.Call;
import retrofit2.http.Query;

public interface YelpApi {
    Call<YelpBusinessesSearchResponse> getRestaurants(
            @Query("location") String location,
            @Query("term") String term
    );
}