package com.ana.projectatestat.pacient;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ana.projectatestat.R;

public class AppointmentChangerActivity extends AppCompatActivity {
    private Button buttonapp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointmentchanger);
        buttonapp=findViewById(R.id.buttonapp);
    }


    public void SendaMessage(View view) {
        Toast.makeText(this, "Check your email", Toast.LENGTH_LONG).show();
        Log.wtf("Messaje", "Check your email");
    }
}
