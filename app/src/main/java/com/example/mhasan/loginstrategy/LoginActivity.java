package com.example.mhasan.loginstrategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    LoginStrategy loginStrategy;

    public void setLoginStrategy(LoginStrategy L) {
        this.loginStrategy = L;

    }

    public void PerformLogin() {
        loginStrategy.login();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    public void init() {
        Button GoogleBtn = (Button) findViewById(R.id.GoogleLogin);
        Button EmailBtn = (Button) findViewById(R.id.EmailLogin);
        Button FbBtn = (Button) findViewById(R.id.FBLogin);

        GoogleBtn.setOnClickListener(this);
        EmailBtn.setOnClickListener(this);
        FbBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String text;
        switch (v.getId()) {
            case R.id.GoogleLogin:

                loginStrategy = new LoginWithGoogle();
                PerformLogin();
                 setLoginStrategy(new LoginWithEmail());
                loginStrategy.login();
                text = "U have login with Google account";
                Toast.makeText(getBaseContext(), text, Toast.LENGTH_SHORT).show();

                break;
            case R.id.EmailLogin:

                loginStrategy = new LoginWithEmail();
                PerformLogin();

                text = "U have login with Email account";
                Toast.makeText(getBaseContext(), text, Toast.LENGTH_SHORT).show();
                break;
            case R.id.FBLogin:

                loginStrategy = new LoginWithFB();
                PerformLogin();

                text = "U have login with Facebook account";
                Toast.makeText(getBaseContext(), text, Toast.LENGTH_SHORT).show();

                break;

        }

    }
}
