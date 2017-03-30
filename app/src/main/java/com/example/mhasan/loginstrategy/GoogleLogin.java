package com.example.mhasan.loginstrategy;

/**
 * Created by mhasan on 3/30/2017.
 */

public class GoogleLogin extends LoginActivity {

    public  GoogleLogin(){
        loginStrategy =new LoginWithGoogle();

    }
    protected void setLoginStrategy(LoginStrtegy L){
        this.loginStrategy = L;
    }
}
