package inc.angga.mobile.appszakat.dalil_dan_hadis.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import inc.angga.mobile.appszakat.R;
import inc.angga.mobile.appszakat.dalil_dan_hadis.adapter.HaditsAdapter;

/**
 * Created by ACER on 3/26/2017.
 */

public class HaditsFragment extends Fragment {
    private RecyclerView rvHadits;
    private HaditsAdapter haditsAdapter;

    public static HaditsFragment newInstance(){
        return new HaditsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.hadits_fragment_layout, container, false);
        rvHadits = (RecyclerView)rootView.findViewById(R.id.rv_hadits);
        haditsAdapter = new HaditsAdapter(getContext());
        rvHadits.setAdapter(haditsAdapter);

        return rootView;
    }
}
