package com.choashuai.mvpdemo;

/**
 * Created by chaoshuai on 2018/4/10.
 */

public interface OnLoginListener {
    void loginSuccess(User user);
    void loginFailed();
}
