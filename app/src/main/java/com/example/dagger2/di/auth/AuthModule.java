package com.example.dagger2.di.auth;

import com.example.dagger2.api.auth.AuthApiInterface;

import dagger.Module;
import retrofit2.Retrofit;

@Module
public class AuthModule {

    static AuthApiInterface provideauthApi(Retrofit retrofit){

        return retrofit.create(AuthApiInterface.class);

    }

}
