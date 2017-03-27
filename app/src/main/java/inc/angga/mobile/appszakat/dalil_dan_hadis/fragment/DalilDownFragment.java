package inc.angga.mobile.appszakat.dalil_dan_hadis.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import inc.angga.mobile.appszakat.R;
import inc.angga.mobile.appszakat.dalil_dan_hadis.adapter.DalilAdapterDetail;

/**
 * Created by ACER on 3/26/2017.
 */

public class DalilDownFragment extends Fragment {

    private DalilAdapterDetail dalilAdapterDetail;
    private RecyclerView rvDalilDetail;
    private static int mPosition;

    public static DalilDownFragment newInstance(int position)
    {
        mPosition = position;
        return new DalilDownFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.dalil_down_fragment_layout, container, false);
        rvDalilDetail = (RecyclerView)rootView.findViewById(R.id.rv_down_hadits);
        dalilAdapterDetail = new DalilAdapterDetail(mPosition);
        rvDalilDetail.setAdapter(dalilAdapterDetail);
        return rootView;
    }
}
