package com.anrabbit.net;

import com.anrabbit.entity.User;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by soul on 2017/9/4.
 */

public interface NetService {
    @GET("/users")
    Observable<User> login(@Query("username") String username, @Query("password") String password);
}
