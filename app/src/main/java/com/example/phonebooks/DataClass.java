package com.example.phonebooks;

/**
 * project: Phone Books
 * Created by : Thiha Eung
 * date : 1/22/2020
 */
public class DataClass {

    private int mProfileImage;
    private String mName;
    private String mPosition;
    private String mPhNumber;
    private String mCountryName;
    private int mFlagImage;

    public DataClass(int mProfileImage, String mName, String mPosition, String mPhNumber, String mCountryname, int mFlagImage) {
        this.mProfileImage = mProfileImage;
        this.mName = mName;
        this.mPosition = mPosition;
        this.mPhNumber = mPhNumber;
        this.mCountryName = mCountryname;
        this.mFlagImage = mFlagImage;
    }

    public int getmProfileImage() {
        return mProfileImage;
    }

    public String getmName() {
        return mName;
    }

    public String getmPosition() {
        return mPosition;
    }

    public String getmPhNumber() {
        return mPhNumber;
    }

    public String getmCountryName() {
        return mCountryName;
    }

    public int getmFlagImage() {
        return mFlagImage;
    }
}
