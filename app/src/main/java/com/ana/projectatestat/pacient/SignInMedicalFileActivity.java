package com.ana.projectatestat.pacient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ana.projectatestat.R;

public class SignInMedicalFileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedIntenceState){
        super.onCreate(savedIntenceState);
        setContentView(R.layout.activity_signinmedicalfile);
    }
    public void goToFeedActivity(View view) {
        Intent intent=new Intent( this, FeedActivity.class);
        startActivity(intent);
    }

}
