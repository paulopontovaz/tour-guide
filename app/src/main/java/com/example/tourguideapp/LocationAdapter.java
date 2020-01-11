package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {
//    private int mBackgroundColor;

    LocationAdapter(Context mContext, List<Location> mObjects) {
        super(mContext, 0, mObjects);
    }

//    LocationAdapter(Context mContext, List<Location> mObjects, int mBackgroundColor) {
//        super(mContext, 0, mObjects);
//        this.mBackgroundColor = mBackgroundColor;
//    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(
                    getContext()
            ).inflate(
                    R.layout.location_list_item, parent,
                    false
            );
        }

        Location currentLocation = getItem(position);

        if (currentLocation != null) {
            TextView nameTextView = convertView.findViewById(R.id.name_text_view);

            if (nameTextView != null) {
                nameTextView.setText(currentLocation.getName());
            }


            TextView addressTextView = convertView.findViewById(R.id.address_text_view);

            if (addressTextView != null) {
                addressTextView.setText(currentLocation.getAddress());
            }


            TextView websiteTextView = convertView.findViewById(R.id.website_text_view);

            if (websiteTextView != null) {
                websiteTextView.setText(currentLocation.getWebsite().toString());
            }


            TextView imageTextView = convertView.findViewById(R.id.image);

            if (imageTextView != null) {
                imageTextView.setText(String.valueOf(currentLocation.getImageResourceId()));
            }
        }

        return convertView;
    }
}
