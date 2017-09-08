package com.anrabbit.di.module;

import com.anrabbit.net.NetService;
import com.anrabbit.config.Config;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import retrofit2.Retrofit;

/**
 * Created by soul on 2017/9/7.
 */

@Module
public class ApiServiceModule {

    @Singleton
    @Provides
    HttpUrl providesBaseUrl() {
        return HttpUrl.parse(Config.BASEURL);
    }

    @Singleton
    @Provides
    NetService providesNetService(Retrofit retrofit) {
        return retrofit.create(NetService.class);
    }
}
