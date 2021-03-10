package activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ana.projectatestat.ForgotPasswordActivity;
import com.ana.projectatestat.R;
import com.ana.projectatestat.SignInActivity;

public class IntendLogIn extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToSignInActivity(View view) {
        Intent intent=new Intent( this, SignInActivity.class);
        startActivity(intent);
    }

    public void goToForgotPasswordActivity(View view) {
        Intent intent=new Intent(this, ForgotPasswordActivity.class);
                startActivity(intent);
    }
}
