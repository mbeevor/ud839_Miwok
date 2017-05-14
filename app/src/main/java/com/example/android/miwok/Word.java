package com.example.android.miwok;

/**
 * Created by Matthew on 02/05/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }


    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    public int getAudioResourceId() {

        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }

}
