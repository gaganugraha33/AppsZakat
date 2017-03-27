package inc.angga.mobile.appszakat.dalil_dan_hadis.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import inc.angga.mobile.appszakat.dalil_dan_hadis.fragment.DalilFragment;
import inc.angga.mobile.appszakat.dalil_dan_hadis.fragment.HaditsFragment;

/**
 * Created by ACER on 3/26/2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    private int mNumOfTabs;
    private FragmentManager fragmentManager;

    public PageAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        fragmentManager = fm;
        this. mNumOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return DalilFragment.newInstance(fragmentManager);
            case 1:
                return HaditsFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
