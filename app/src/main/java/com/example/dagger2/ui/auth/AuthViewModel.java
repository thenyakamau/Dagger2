package com.example.dagger2.ui.auth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;

import com.example.dagger2.api.auth.AuthApiInterface;
import com.example.dagger2.model.UserModel;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {

    private AuthApiInterface authApiInterface;
    private MediatorLiveData<UserModel> authUser = new MediatorLiveData<>();

    @Inject
    AuthViewModel(AuthApiInterface authApiInterface) {
        this.authApiInterface = authApiInterface;
    }

    public LiveData<UserModel> observeUser(){

        return authUser;

    }

}
