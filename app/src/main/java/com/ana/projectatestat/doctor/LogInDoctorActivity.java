package com.ana.projectatestat.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ana.projectatestat.ForgotPasswordActivity;
import com.ana.projectatestat.R;
import com.ana.projectatestat.pacient.FeedActivity;

public class LogInDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logindoctor);
    }
    public void goToSignInDoctorActivity(View view) {
        Intent intent=new Intent( this, SignInDoctorActivity.class);
        startActivity(intent);
    }

    public void goToForgotPasswordActivity(View view) {
        Intent intent=new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }
    public void goToFeedDoctorActivity(View view) {
        Intent intent=new Intent( this, DoctorFeedActivity.class);
        startActivity(intent);
    }

}