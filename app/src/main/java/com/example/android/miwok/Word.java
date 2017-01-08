package com.example.android.miwok;

/**
 * Created by Himanshu on 27/12/2016.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mListIcon;
    private int mAudioResource;
    //private static final int NO_IMAGE=-1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation,int listIcon)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mListIcon=listIcon;
    }

    public Word(String defaultTranslation, String miwokTranslation,int listIcon,int audioResource)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mListIcon=listIcon;
        mAudioResource=audioResource;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getListIcon() {
        return mListIcon;
    }
    /*public boolean hasImage() {
        return mListIcon!=NO_IMAGE;
    }*/
    public int getAudioResource()
    {
        return mAudioResource;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mListIcon=" + mListIcon +
                ", mAudioResource=" + mAudioResource +
                '}';
    }
}
