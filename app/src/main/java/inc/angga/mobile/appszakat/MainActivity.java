package inc.angga.mobile.appszakat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvTextSlideInfo;
    private ObjectAnimator slideX;
    private AnimatorSet animatorSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTextSlideInfo = (TextView)findViewById(R.id.tv_text_slide);
        slideX = ObjectAnimator.ofFloat(tvTextSlideInfo, "translationX", getResources().getInteger(R.integer.slide_text_animate));
        slideX.setDuration(13000);
        slideX.setRepeatCount(Animation.INFINITE);

        animatorSet = new AnimatorSet();
        animatorSet.setTarget(tvTextSlideInfo);
        animatorSet.play(slideX);
        animatorSet.start();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, StartMenuFragment.newInstance(MainActivity.this, getSupportFragmentManager())).commit();

    }


}
