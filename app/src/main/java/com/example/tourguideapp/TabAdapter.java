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
                mContext.getText(R.string.restaurants).toString(),
                mContext.getText(R.string.cinemas).toString(),
                mContext.getText(R.string.malls).toString(),
        };
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return TabFragment.newInstance(LocationFactory.getLandmarks());
            case 1:
                return TabFragment.newInstance(LocationFactory.getRestaurants());
            case 2:
                return TabFragment.newInstance(LocationFactory.getCinemas());
            case 3:
                return TabFragment.newInstance(LocationFactory.getMalls());
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