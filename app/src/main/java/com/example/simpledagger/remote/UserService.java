package com.example.simpledagger.remote;

import com.example.simpledagger.model.UserModel;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface UserService {


    @GET("/users/2")
    Single<UserModel> getUserModel();
}
