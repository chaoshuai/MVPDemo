package com.choashuai.mvpdemo;

/**
 * Created by chaoshuai on 2018/4/10.
 */

public interface IUserBiz {
    public void login(String username, String password, OnLoginListener loginListener);
}
