package com.example.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.URI;

public class Location implements Parcelable {
    private String mName;
    private URI mWebsite;
    private String mAddress;
    private int mImageResourceId;

    Location(String mName, URI mWebsite, String mAddress, int mImageResourceId) {
        this.mName = mName;
        this.mWebsite = mWebsite;
        this.mAddress = mAddress;
        this.mImageResourceId = mImageResourceId;
    }

    String getName() {
        return mName;
    }

    URI getWebsite() {
        return mWebsite;
    }

    String getAddress() {
        return mAddress;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeString(mAddress);
        dest.writeString(mWebsite.toString());
        dest.writeInt(mImageResourceId);
    }

    private Location(Parcel in) {
        mName = in.readString();
        mAddress = in.readString();
        mImageResourceId = in.readInt();

        String uriStr = in.readString();

        if (uriStr != null) {
            mWebsite = URI.create(uriStr);
        }
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };
}
