package com.anrabbit.di.component;

import android.app.Application;

import com.anrabbit.di.module.AppModule;
import com.anrabbit.di.module.NetModule;
import com.anrabbit.net.NetService;
import com.anrabbit.ui.MainComponent;
import com.google.gson.Gson;
import com.anrabbit.di.module.ApiServiceModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by soul on 2017/9/7.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class, ApiServiceModule.class})
public interface AppComponent {
    Application application();

    Gson gson();

    NetService getNetService();

    MainComponent mainConponent();

    final class Initializer {

        public static AppComponent init(Application application) {
            return DaggerAppComponent.builder()
                    .appModule(new AppModule(application))
                    .netModule(new NetModule())
                    .apiServiceModule(new ApiServiceModule()).build();
        }
    }
}
