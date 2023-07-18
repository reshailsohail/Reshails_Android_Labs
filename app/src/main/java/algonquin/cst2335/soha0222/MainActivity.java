package algonquin.cst2335.soha0222;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;


public class MainActivity extends AppCompatActivity {

    Button loginButton;

    Intent nextPage;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(TAG, "onCreate(): the first function that gets created when an application is launched.");
        setContentView(R.layout.activity_main);

            loginButton = findViewById(R.id.login);
        EditText emailEditText = findViewById(R.id.editTextEmailAddress);
            SharedPreferences prefs = getSharedPreferences("Mydata", Context.MODE_PRIVATE);
            String emailAddress = prefs.getString("LoginName", "");
            emailEditText.setText(emailAddress);
            nextPage = new Intent( MainActivity.this, SecondActivity.class);
            loginButton.setOnClickListener(clk -> {
                String EmailAddress = emailEditText.getText().toString();
                nextPage.putExtra("EmailAddress", emailEditText.getText().toString());
                startActivity(nextPage);
            });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w(TAG, "onStart(): The application is now visible on screen.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG, "onResume(): The application is now responding to user input");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "onPause(): The application no longer responds to user input");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "onStop(): The application is no longer visible.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG, "onDestroy(): Any memory used by the application is freed.");
    }

}
