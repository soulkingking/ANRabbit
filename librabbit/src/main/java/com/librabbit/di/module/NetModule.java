//package com.librabbit.di.module;
//
//import android.app.Application;
//import android.content.SharedPreferences;
//import android.preference.PreferenceManager;
//
//import com.google.gson.FieldNamingPolicy;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
//
//import javax.inject.Singleton;
//
//import dagger.Module;
//import dagger.Provides;
//import okhttp3.Cache;
//import okhttp3.HttpUrl;
//import okhttp3.OkHttpClient;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
///**
// * Created by soul on 2017/9/6.
// */
//@Module
//public class NetModule {
//
//    public NetModule() {
//    }
//
//
//    @Provides
//    @Singleton
//    Cache provideOkHttpCache(Application application) {
//        int cacheSize = 10 * 1024 * 1024; // 10 MiB
//        Cache cache = new Cache(application.getCacheDir(), cacheSize);
//        return cache;
//    }
//
//
//    @Provides
//    @Singleton
//    OkHttpClient provideOkHttpClient(Cache cache) {
//        OkHttpClient client = new OkHttpClient.Builder().cache(cache).build();
//        return client;
//    }
//
//    @Provides
//    @Singleton
//    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient, HttpUrl baseUrl) {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(baseUrl)//baseurl路径
//                .client(okHttpClient)//添加okHttpClient客户端
//                .addConverterFactory(GsonConverterFactory.create(gson))//添加Gson格式化工厂
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .build();
//        return retrofit;
//    }
//
//}
