package com.example.lbeltran.dia1.restAPI;


import com.example.lbeltran.dia1.restAPI.model.ContactoResponse;

import retrofit2.Call;
import retrofit2.http.GET;


public interface EndpointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<ContactoResponse> getRecentMedia();
}
