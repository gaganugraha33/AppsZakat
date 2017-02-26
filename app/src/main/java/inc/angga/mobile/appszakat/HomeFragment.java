package inc.angga.mobile.appszakat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import inc.angga.mobile.appszakat.R;
import inc.angga.mobile.appszakat.menu_definisi_zakat.MenuZakatActivity;
import inc.angga.mobile.appszakat.menu_kalkulator.MenuKalkulatorActivity;

/**
 * Created by ACER on 2/22/2017.
 */

public class HomeFragment extends Fragment {
    private ImageView btZakat;
    private ImageView btDalil;
    private ImageView btKalkulator;
    private ImageView btInfoLembaga;
    private static Context mContext;

    public static HomeFragment newInstance(Context context){
        mContext = context;
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.home_fragment_layout, container, false);
        btZakat = (ImageView) rootView.findViewById(R.id.bt_Zakat);
        btDalil = (ImageView) rootView.findViewById(R.id.bt_dalil);
        btKalkulator = (ImageView) rootView.findViewById(R.id.bt_kalkulator);
        btInfoLembaga = (ImageView) rootView.findViewById(R.id.bt_info_lembaga);
        btZakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MenuZakatActivity.class);
                startActivity(intent);
            }
        });

        btKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MenuKalkulatorActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
