package com.example.dagger2.api.auth;

import com.example.dagger2.model.UserModel;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthApiInterface {

    @GET("users/{id}")
    Flowable<UserModel> getFakeStuff(
            @Path("id") int id
    );

}
