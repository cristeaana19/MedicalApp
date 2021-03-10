package com.ana.projectatestat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {
    private Button sendButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        sendButton=findViewById(R.id.send_button);
    }
    public void selectSendButton(View v)
    {
        Toast.makeText(this, "Please wait 30 seconds", Toast.LENGTH_LONG).show();
        Log.wtf("Email", "Please wait 30 seconds");


    }



}
