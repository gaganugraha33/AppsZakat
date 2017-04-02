package inc.angga.mobile.appszakat.dalil_dan_hadis.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Random;

import inc.angga.mobile.appszakat.R;
import inc.angga.mobile.appszakat.dalil_dan_hadis.DataDalilHadits;
import inc.angga.mobile.appszakat.dalil_dan_hadis.adapter.DalilAdapter;

/**
 * Created by ACER on 3/26/2017.
 */

public class DalilUpFragment extends Fragment {
    private DalilAdapter dalilAdapter;
    private RecyclerView rvDalil;
    private ArrayList<Integer> colors;

    public static DalilUpFragment newInstance(){
        return new DalilUpFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.dalil_up_fragment_layout, container, false);

        rvDalil = (RecyclerView)rootView.findViewById(R.id.rv_up_dalil);
        colors = new ArrayList<>();

        for (int i = 0; i< DataDalilHadits.getTitleDalil().size(); i++){
            int[] rainbow = getContext().getResources().getIntArray(R.array.rainbow);
            Random r = new Random();
            int i1 = r.nextInt(11);
            colors.add(rainbow[i1]);
        }

        dalilAdapter =  new DalilAdapter(getFragmentManager(), getContext(), colors);
        rvDalil.setAdapter(dalilAdapter);

        return rootView;
    }
}
