package com.librabbit.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

/**
 * Created by soul on 2017/9/7.
 */

public abstract class BaseActivity<P extends IPresenter> extends Activity {


    @Inject
    P presenter;

    public Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
        setContentView(getLayoutId());
        setupActivityComponent();
        initData();
    }


    public abstract int getLayoutId();

    public abstract void initData();

    public abstract Context getContext();

    public abstract void setupActivityComponent();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.presenter = null;
        this.mContext = null;
    }
}
