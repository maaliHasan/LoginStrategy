package com.example.mhasan.loginstrategy;

import android.util.Log;

/**
 * Created by mhasan on 3/30/2017.
 */

public class LoginWithGoogle implements LoginStrategy {

    @Override
    public void login() {
        Log.d("LoginWithGoogle","U R logging with google credential");
    }
}
