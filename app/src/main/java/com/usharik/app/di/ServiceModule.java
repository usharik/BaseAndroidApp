package com.usharik.app.di;

import com.usharik.app.AppState;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by macbook on 09.02.18.
 */

@Module(includes = {AppModule.class})
class ServiceModule {
    @Provides
    @Singleton
    AppState provideAppState() {
        return new AppState();
    }
}
