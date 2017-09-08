package com.anrabbit.ui;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.anrabbit.App;
import com.anrabbit.R;
import com.anrabbit.entity.User;
import com.anrabbit.net.NetService;
import com.google.gson.Gson;


import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivity extends Activity {

    @Inject
    NetService netService;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv_result);
        App.appComponent.mainConponent().inject(this);
        netService.login("111", "2222")
                .subscribeOn(Schedulers.io())               //在IO线程进行网络请求
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        result -> {
                            Log.e("MainActivity", new Gson().toJson(result));
                            textView.setText("username:" + result.getUsername() + "\n"
                                    + "password:" + result.getPassword() + "\n" +
                                    "token:" + result.getToken() + "\n");
                        },
                        error -> {
                            Log.e("MainActivity", error.getMessage());
                        }
                );
//        App.getNetService().login("111", "2222")
//                .subscribeOn(Schedulers.io())               //在IO线程进行网络请求
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(
//                        result -> {
//                            Log.e("MainActivity", new Gson().toJson(result));
//                            textView.setText("username:" + result.getUsername() + "\n"
//                                    + "password:" + result.getPassword() + "\n" +
//                                    "token:" + result.getToken() + "\n");
//                        },
//                        error -> {
//                            Log.e("MainActivity", error.getMessage());
//                        }
//                );

    }
}
