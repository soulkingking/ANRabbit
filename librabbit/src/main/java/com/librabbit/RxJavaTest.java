package com.librabbit;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by soul on 2017/9/4.
 */

public class RxJavaTest {

    public static final String TAG = "RxJavaTest.class";

    public static void main(String[] args) {
        //1、创建一个上游 Observable:
        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        });

        //2、创建一个下游 Observer
        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "subscribe");
            }

            @Override
            public void onNext(Integer value) {
                Log.d(TAG, "" + value);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "error");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "complete");
            }
        };

        //3、建立连接
        observable.subscribe(observer);


        Observable.create((ObservableOnSubscribe<String>) e -> {

        }).subscribeOn(Schedulers.newThread())
                .doOnNext(s -> {


                }).doOnError(e -> {

        })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        success -> {

                        },
                        error -> {

                        }
                );

    }
}
