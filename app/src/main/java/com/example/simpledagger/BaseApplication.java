package com.example.simpledagger;

import android.annotation.SuppressLint;
import android.app.Application;

import com.example.simpledagger.di.components.AppComponent;
import com.example.simpledagger.di.components.DaggerAppComponent;


public class BaseApplication extends Application {

    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponent= DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
