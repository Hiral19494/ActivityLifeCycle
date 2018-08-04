package ca.android.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends BaseActivity {

    final String TAG = "States";
    private final int SPLASH_DISPLAY_LENGTH = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.i(TAG, "SplashActivity: onCreate()");
        splashHandler();
    }


    private void splashHandler() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent homeIntent = new Intent(SplashActivity.this, HomeActivity.class);
                SplashActivity.this.startActivity(homeIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
