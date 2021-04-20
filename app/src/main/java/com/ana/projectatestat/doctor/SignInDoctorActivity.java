package com.ana.projectatestat.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ana.projectatestat.R;
import com.ana.projectatestat.doctor.DoctorFeedActivity;

public class SignInDoctorActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorsignin);
    }

    public void goToDoctorFeedActivity(View view) {
        Intent intent = new Intent(this, DoctorFeedActivity.class);
        startActivity(intent);
    }
}