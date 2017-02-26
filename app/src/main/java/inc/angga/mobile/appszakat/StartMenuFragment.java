package inc.angga.mobile.appszakat;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by ACER on 2/22/2017.
 */

public class StartMenuFragment extends Fragment {
    private static Context mContext;
    private static FragmentManager mFragmentManager;

    public static StartMenuFragment newInstance(Context context, FragmentManager fragmentManager){
        mContext = context;
        mFragmentManager = fragmentManager;
        return new StartMenuFragment();
    }

    private ImageView btToHome;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.startmenu_fragment_layout, container, false);
        btToHome = (ImageView)rootView.findViewById(R.id.bt_to_home);

        btToHome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                    mFragmentManager.beginTransaction().replace(R.id.fl_container, HomeFragment.newInstance(mContext)).commit();
//                        Intent intent = new Intent(mContext, HomeActivity.class);
//                        startActivity(intent);

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

        return rootView;
    }
}
