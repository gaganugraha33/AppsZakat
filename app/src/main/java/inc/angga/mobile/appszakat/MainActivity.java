package inc.angga.mobile.appszakat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView btToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btToHome = (ImageView)findViewById(R.id.bt_to_home);

//        btToHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//                startActivity(intent);
//            }
//        });

        btToHome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);

                        btToHome.setImageDrawable(getResources().getDrawable(R.drawable.icon_home_clicked));

                        break;
                    case MotionEvent.ACTION_UP:
                        btToHome.setImageDrawable(getResources().getDrawable(R.drawable.icon_home));
                        break;
                    default:
                        break;
                }

                return true;
            }
        });
    }

}
