package com.example.simpledagger.repository;

import com.example.simpledagger.model.UserModel;
import com.example.simpledagger.remote.UserService;

import javax.inject.Inject;

import io.reactivex.Single;

public class UserRepository {

    private UserService userService;

    @Inject
    public UserRepository(UserService userService) {
        this.userService = userService;
    }

    public Single<UserModel> modelSingle() {
        return userService.getUserModel();
    }
}
