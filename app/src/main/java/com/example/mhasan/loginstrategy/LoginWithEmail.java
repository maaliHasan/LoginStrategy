package com.example.mhasan.loginstrategy;
import android.util.Log;
/**
 * Created by mhasan on 3/30/2017.
 */

public class LoginWithEmail implements LoginStrtegy {

    @Override
    public void login() {
        Log.d("LoginWithEmail","U R logging with Email credential");
    }
}
