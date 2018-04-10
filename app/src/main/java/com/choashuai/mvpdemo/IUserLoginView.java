package com.choashuai.mvpdemo;

/**
 * Created by chaoshuai on 2018/4/10.
 */

public interface IUserLoginView  {
    String getUserName();
    String getPassword();
    void clearUserName();
    void clearPassword();
    void showLoading();
    void hideLoading();
    void toMainActivity(User user);
    void showFailedError();
}
