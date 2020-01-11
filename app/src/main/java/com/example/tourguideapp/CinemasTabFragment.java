package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class CinemasTabFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return LocationUtils.generateLocationFragmentView(
                getActivity(),
                inflater,
                container,
                LocationFactory.getCinemas(),
                R.color.cinemas_background_color
        );
    }
}
