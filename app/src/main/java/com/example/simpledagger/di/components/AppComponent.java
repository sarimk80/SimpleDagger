package com.example.simpledagger.di.components;

import com.example.simpledagger.MainActivity;
import com.example.simpledagger.di.modules.ContextModule;
import com.example.simpledagger.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, ContextModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
