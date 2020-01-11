package com.example.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {
    private ArrayList<Location> mLocationList;
    private Context mContext;
//    private int mBackgroundColor;

    LocationAdapter(Context mContext, ArrayList<Location> mLocationList) {
        this.mLocationList = mLocationList;
        this.mContext = mContext;
    }

//    LocationAdapter(Context mContext, ArrayList<Location> mLocationList, int mBackgroundColor) {
//        this.mLocationList = mLocationList;
//        this.mContext = mContext;
//        this.mBackgroundColor = mBackgroundColor;
//    }

    static class LocationViewHolder extends RecyclerView.ViewHolder {

        TextView mNameTextView;
        TextView mAddressTextView;
        Button mWebsiteButton;
        ImageView mLocationImageView;

        LocationViewHolder(View itemView) {
            super(itemView);
            this.mNameTextView = itemView.findViewById(R.id.name_text_view);
            this.mAddressTextView = itemView.findViewById(R.id.address_text_view);
            this.mWebsiteButton = itemView.findViewById(R.id.link_button);
            this.mLocationImageView = itemView.findViewById(R.id.location_image_view);
        }
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(
                parent.getContext()
        ).inflate(R.layout.location_list_item, parent, false);

        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final LocationViewHolder holder, final int position) {
        Location currentLocation = mLocationList.get(position);

        holder.mNameTextView.setText(currentLocation.getName());
        holder.mAddressTextView.setText(currentLocation.getAddress());
        holder.mLocationImageView.setImageResource(currentLocation.getImageResourceId());
        holder.mWebsiteButton.setTag(currentLocation.getWebsite());

        holder.mWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(v.getTag().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mLocationList.size();
    }
}
