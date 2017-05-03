package com.example.android.miwok;

/**
 * Created by Matthew on 02/05/2017.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public String getMiwokText() {
        return mMiwokTranslation;
    }

    public String getDefaultText() {
        return mDefaultTranslation;
    }

    public Word(String currentDefaultTranslation, String currentMiwokTranslation) {
        mDefaultTranslation = currentDefaultTranslation;
        mMiwokTranslation = currentMiwokTranslation;
    }
}
