package com.example.android.tourguideapp;

final class LocationInfo{

    static final int NO_WEB_LINK_PROVIDED = -1;
    static final int NO_DATE_PROVIDED = -2;
    static final int NO_PHONE_PROVIDED = -3;
    static final int NO_DESC_PROVIDED = -4;

    private int mImageId;
    private int mHeadingId;
    private int mDateId;
    private int mDescriptionId;
    private int mAddressId;
    private int mPhoneId;
    private int mWebLinkId;

    public LocationInfo(int imageId, int headingId, int dateId, int descriptionId, int addressId,
                        int phoneId, int webLinkId){
        mImageId = imageId;
        mHeadingId = headingId;
        mDateId = dateId;
        mDescriptionId = descriptionId;
        mAddressId = addressId;
        mPhoneId = phoneId;
        mWebLinkId = webLinkId;
    }

    public LocationInfo(int imageId, int headingId, int descriptionId, int addressId){
        mImageId = imageId;
        mHeadingId = headingId;
        mDateId = NO_DATE_PROVIDED;
        mDescriptionId = descriptionId;
        mAddressId = addressId;
        mPhoneId = NO_PHONE_PROVIDED;
        mWebLinkId = NO_WEB_LINK_PROVIDED;
    }


    public int getImageId(){
        return mImageId;
    }

    public int getHeadingId(){
        return mHeadingId;
    }

    public int getDateId(){
        return mDateId;
    }

    public int getDescriptionId(){
        return mDescriptionId;
    }

    public int getAddressId(){
        return mAddressId;
    }

    public int getPhoneId(){
        return mPhoneId;
    }

    public int getWebLinkId(){
        return mWebLinkId;
    }
}
