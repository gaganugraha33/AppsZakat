package inc.angga.mobile.appszakat.dalil_dan_hadis.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 3/26/2017.
 */

public class HaditsFragment extends Fragment {

    public static HaditsFragment newInstance(){
        return new HaditsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.hadits_fragment_layout, container, false);

        return rootView;
    }
}
