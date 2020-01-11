package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class TabFragment extends Fragment {
    private static final String LOCATION_LIST = "LOCATION_LIST";
//    public static final String LOCATION_ITEM_BACKGROUND_COLOR = "LOCATION_ITEM_BACKGROUND_COLOR";

    private ArrayList<Location> mLocationList;
//    private int mLocationItemBackgroundColor;

    public TabFragment() {
        // Required empty public constructor
    }

    static TabFragment newInstance(ArrayList<Location> locationList) {
        TabFragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putParcelableArrayList(LOCATION_LIST, locationList);
        fragment.setArguments(args);
        return fragment;
    }

//    public static TabFragment newInstance(ArrayList<Location> locationList, int backgroundColor) {
//        TabFragment fragment = new TabFragment();
//        Bundle args = new Bundle();
//        args.putParcelableArrayList(LOCATION_LIST, locationList);
//        args.putInt(LOCATION_ITEM_BACKGROUND_COLOR, backgroundColor);
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mLocationList = getArguments().getParcelableArrayList(LOCATION_LIST);
//            mLocationItemBackgroundColor = getArguments().getInt(LOCATION_ITEM_BACKGROUND_COLOR);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        LocationAdapter adapter = new LocationAdapter(getActivity(), mLocationList);
        ListView listView = rootView.findViewById(R.id.list);

        if (listView != null) {
            listView.setAdapter(adapter);
        }

        return rootView;
    }
}
