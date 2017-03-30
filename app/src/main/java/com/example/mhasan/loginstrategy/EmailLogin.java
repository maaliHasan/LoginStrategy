package com.example.mhasan.loginstrategy;

/**
 * Created by mhasan on 3/30/2017.
 */

public class EmailLogin extends LoginActivity {
    public EmailLogin (){
        loginStrategy = new LoginWithEmail();
    }

    protected void setLoginStrategy(LoginStrtegy L){
        this.loginStrategy = L;
    }
}
