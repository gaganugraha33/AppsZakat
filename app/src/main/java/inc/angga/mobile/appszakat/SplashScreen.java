package inc.angga.mobile.appszakat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ACER on 2/1/2017.
 */

public class SplashScreen extends AppCompatActivity {
    private View rlProgresBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_layout);
        rlProgresBar = findViewById(R.id.rl_progress_bar);
        startDelay();
    }

    private void startDelay() {
        Thread timerThread = new Thread() {
            public void run() {
                try {
                    showProgress(true);
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    showProgress(false);
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();
    }

    private void showProgress(final boolean show) {
        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
        // for very easy animations. If available, use these APIs to fade-in
        // the progress spinner.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            int shortAnimTime = 200;

//            rlProgresBar.setVisibility(View.VISIBLE);
            rlProgresBar.animate().setDuration(shortAnimTime)
                    .alpha(show ? 1 : 0)
                    .setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            rlProgresBar.setVisibility(show ? View.VISIBLE
                                    : View.GONE);
                        }
                    });
        } else {

            rlProgresBar.setVisibility(show ? View.VISIBLE : View.GONE);
        }
    }
}
