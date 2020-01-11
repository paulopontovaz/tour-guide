package com.example.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class LandmarksTabFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Context context = getActivity();

        return LocationUtils.generateLocationFragmentView(
                context,
                inflater,
                container,
                LocationFactory.getLandmarks(context),
                R.color.landmarks_background_color
        );
    }
}
