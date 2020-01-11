package com.example.tourguideapp;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
    private String[] mTabTitles;

    TabAdapter(Context mContext, @NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        mTabTitles = new String[] {
                mContext.getText(R.string.landmarks).toString(),
                mContext.getText(R.string.food).toString(),
                mContext.getText(R.string.cinemas).toString(),
                mContext.getText(R.string.malls).toString(),
        };
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new LandmarksTabFragment();
            case 1:
                return new RestaurantsTabFragment();
            case 2:
                return new CinemasTabFragment();
            case 3:
                return new MallsTabFragment();
        }

        return new Fragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }


}