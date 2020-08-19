package com.watchxxi.freemovies.network.apis;

import android.net.Uri;

import com.watchxxi.freemovies.network.model.ResponseStatus;

import retrofit2.Call;
import retrofit2.http.Field;

import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ProfileApi {
    @FormUrlEncoded
    @POST("update_profile")
    Call<ResponseStatus> updateProfile(@Header("API-KEY") String apiKey,
                                       @Field("id") String id,
                                       @Field("name") String name,
                                       @Field("email") String email,
                                       @Field("password") String password,
                                       @Field("photo") Uri imageUri,
                                       @Field("gender") String gender);

}
