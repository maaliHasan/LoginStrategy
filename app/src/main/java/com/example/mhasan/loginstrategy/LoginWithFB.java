package com.example.mhasan.loginstrategy;

import android.util.Log;

/**
 * Created by mhasan on 3/30/2017.
 */

public class LoginWithFB implements LoginStrategy {

    @Override
    public void login() {
        Log.d("LoginWithFB","U R logging with FB credential");

    }
}
