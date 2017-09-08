package com.anrabbit;

import android.app.Application;

import com.anrabbit.di.component.AppComponent;


/**
 * Created by soul on 2017/9/4.
 */

public class App extends Application {

    public static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = AppComponent.Initializer.init(this);
    }

}