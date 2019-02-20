package com.example.android.miwok;

public class word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId;



    public word(String DefaultTranslation, String MiwokTranslation,int ImageResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation= MiwokTranslation;
        mImageResourceId =ImageResourceId;

    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Android version number
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {return mImageResourceId ;}

    /**
     * Get the image resource ID
     */

}
