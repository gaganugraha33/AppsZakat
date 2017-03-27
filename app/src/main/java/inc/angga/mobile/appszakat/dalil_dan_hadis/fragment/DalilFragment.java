package inc.angga.mobile.appszakat.dalil_dan_hadis.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import inc.angga.mobile.appszakat.HomeFragment;
import inc.angga.mobile.appszakat.R;
import inc.angga.mobile.appszakat.dalil_dan_hadis.adapter.DalilAdapter;
import inc.angga.mobile.appszakat.dalil_dan_hadis.adapter.DalilAdapterDetail;

/**
 * Created by ACER on 3/26/2017.
 */

public class DalilFragment extends Fragment {
    private FrameLayout flContainer1;
    private FrameLayout flContainer2;
    private static FragmentManager mFragmentManager;
    public static DalilFragment newInstance(FragmentManager fragmentManager){
        mFragmentManager = fragmentManager;
        return new DalilFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.dalil_fragment_layout, container, false);
//        flContainer1 = (FrameLayout)rootView.findViewById(R.id.fl_container_1);
//        flContainer2 = (FrameLayout)rootView.findViewById(R.id.fl_container_2);

        mFragmentManager.beginTransaction()
                .replace(R.id.fl_container_1, DalilUpFragment.newInstance()).commit();

        mFragmentManager.beginTransaction()
                .replace(R.id.fl_container_2, DalilDownFragment.newInstance(0)).commit();

        return rootView;
    }
}
