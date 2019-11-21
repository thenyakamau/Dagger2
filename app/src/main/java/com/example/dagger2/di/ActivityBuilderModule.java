package com.example.dagger2.di;

import com.example.dagger2.di.auth.AuthModule;
import com.example.dagger2.di.auth.AuthViewModelsModule;
import com.example.dagger2.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class,}
    )
    abstract AuthActivity contributeAuthActivity();

}
