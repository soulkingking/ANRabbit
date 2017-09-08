package com.librabbit.base;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by soul on 2017/9/7.
 */

public abstract class BasePresenter<V extends IView, M extends IModel> {
    @Inject
    V mView;
    @Inject
    M mModule;

    public BasePresenter() {
    }

    public Context getContext() {
        return (Context) mView;
    }
}
