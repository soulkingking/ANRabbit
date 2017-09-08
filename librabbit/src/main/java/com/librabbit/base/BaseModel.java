package com.librabbit.base;

import android.app.Application;

import javax.inject.Inject;

/**
 * Created by soul on 2017/9/7.
 */

public abstract class BaseModel {
    @Inject
    Application application;
}
