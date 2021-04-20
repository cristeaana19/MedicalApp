package com.ana.projectatestat.pacient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ana.projectatestat.R;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinpacient);
    }

    public void goToSignInMedicalFile(View view) {
        Intent intent= new Intent(this, SignInMedicalFileActivity.class);
        startActivity(intent);
    }
}
