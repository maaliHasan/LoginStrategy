package com.example.mhasan.loginstrategy;

/**
 * Created by mhasan on 3/30/2017.
 */

public class FBLogin extends LoginActivity {

    public FBLogin(){
        loginStrategy = new LoginWithFB();
    }

    protected void setLoginStrategy(LoginStrtegy L){
        this.loginStrategy = L;
    }
}
