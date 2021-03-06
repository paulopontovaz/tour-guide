package com.example.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class MallsTabFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Context context = getActivity();

        return LocationUtils.generateLocationFragmentView(
                context,
                inflater,
                container,
                LocationFactory.getMalls(context),
                R.color.malls_background_color
        );
    }
}

