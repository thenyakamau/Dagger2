package com.example.dagger2.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.dagger2.R;
import com.example.dagger2.util.Constants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
class AppModule {

    @Singleton
    @Provides
    static Retrofit provideRetrofitInstance(){

        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    @Singleton
    @Provides
    static RequestOptions provideRequestOptions(){

        return RequestOptions
                .placeholderOf(R.drawable.white_background)
                .error(R.drawable.white_background);

    }

    @Singleton
    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions){

        return Glide.with(application)
                .applyDefaultRequestOptions(requestOptions);

    }


    @Singleton
    @Provides
    static Drawable provideDrawable(Application application){

        return ContextCompat.getDrawable(application, R.drawable.octocat);

    }

}
