package com.example.archit.tourguide;

/**
 * Created by archit on 1/8/17.
 */

public class data {

    private String mName;
    private String mDescription;
    private String mPhone;
    private String mAddress;
    private String mTiming;
    private int mImageResourceId;

    public data(String name, String desc, String phone, String address, String timing, int imageResourceId) {

        mName = name;
        mDescription = desc;
        mPhone = phone;
        mAddress = address;
        mTiming = timing;
        mImageResourceId = imageResourceId;

    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getTiming() {
        return mTiming;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
