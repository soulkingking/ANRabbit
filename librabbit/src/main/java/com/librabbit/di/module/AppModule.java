//package com.librabbit.di.module;
//
//import android.app.Application;
//import android.content.SharedPreferences;
//import android.preference.PreferenceManager;
//
//import com.google.gson.FieldNamingPolicy;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import javax.inject.Singleton;
//
//import dagger.Module;
//import dagger.Provides;
//
///**
// * Created by soul on 2017/9/6.
// */
//@Module
//public class AppModule {
//    private Application mApplication;
//
//    public AppModule(Application application) {
//        this.mApplication = application;
//    }
//
//
//    @Singleton
//    @Provides
//    Application providesApplication() {
//        return mApplication;
//    }
//
//    @Provides
//    @Singleton
//    Gson provideGson() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//        return gsonBuilder.create();
//    }
//
//    // Dagger will only look for methods annotated with @Provides
//    @Provides
//    @Singleton
//    // Application reference must come from AppModule.class
//    SharedPreferences providesSharedPreferences(Application application) {
//        return PreferenceManager.getDefaultSharedPreferences(application);
//    }
//}
