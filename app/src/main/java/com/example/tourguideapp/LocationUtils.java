package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LocationUtils {
    static View generateLocationFragmentView(Context context, LayoutInflater inflater, ViewGroup container, ArrayList<Location> list, int backgroundColor) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.list);
        RecyclerView.Adapter adapter = new LocationAdapter(context, list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);

        recyclerView.setBackgroundColor(context.getResources().getColor(backgroundColor));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
