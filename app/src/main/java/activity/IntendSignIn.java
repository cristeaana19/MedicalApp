package activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ana.projectatestat.R;
import com.ana.projectatestat.SignInMedicalFileActivity;

public class IntendSignIn extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void goToSignInMedicalFile(View view) {
        Intent intent= new Intent(this, SignInMedicalFileActivity.class);
        startActivity(intent);
    }
}
