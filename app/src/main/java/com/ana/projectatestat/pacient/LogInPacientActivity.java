package com.ana.projectatestat.pacient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ana.projectatestat.ForgotPasswordActivity;
import com.ana.projectatestat.R;

public class LogInPacientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpatience);
    }
    public void goToSignInActivity(View view) {
        Intent intent=new Intent( this, SignInActivity.class);
        startActivity(intent);
    }

    public void goToForgotPasswordActivity(View view) {
        Intent intent=new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }
    public void goToFeedActivity(View view) {
        Intent intent=new Intent( this, FeedActivity.class);
        startActivity(intent);
    }

}