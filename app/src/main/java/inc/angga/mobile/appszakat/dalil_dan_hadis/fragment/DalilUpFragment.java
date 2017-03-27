package inc.angga.mobile.appszakat.dalil_dan_hadis.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import inc.angga.mobile.appszakat.R;
import inc.angga.mobile.appszakat.dalil_dan_hadis.adapter.DalilAdapter;

/**
 * Created by ACER on 3/26/2017.
 */

public class DalilUpFragment extends Fragment {
    private DalilAdapter dalilAdapter;
    private RecyclerView rvDalil;

    public static DalilUpFragment newInstance(){
        return new DalilUpFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.dalil_up_fragment_layout, container, false);

        rvDalil = (RecyclerView)rootView.findViewById(R.id.rv_up_dalil);
        dalilAdapter = new DalilAdapter(getFragmentManager());
        rvDalil.setAdapter(dalilAdapter);

        return rootView;
    }
}
