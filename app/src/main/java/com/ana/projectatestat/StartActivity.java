package com.ana.projectatestat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ana.projectatestat.doctor.LogInDoctorActivity;
import com.ana.projectatestat.pacient.LogInPacientActivity;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void goToLogInActivityPatience(View view) {
        Intent intent=new Intent( this, LogInPacientActivity.class);
        startActivity(intent);
    }

    public void goToLogInActivityDoctors(View view) {
        Intent intent=new Intent(this, LogInDoctorActivity.class);
        startActivity(intent);
    }

}
