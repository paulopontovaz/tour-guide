package com.example.tourguideapp;

import android.location.Address;

import java.net.URI;

public class Location {
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

    public String getmName() {
        return mName;
    }

    public URI getmWebsite() {
        return mWebsite;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
