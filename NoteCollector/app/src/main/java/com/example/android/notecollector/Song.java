package com.example.android.notecollector;

import java.util.Comparator;

public class Song {
    private String mTitle;
    private String mArtist;
    private String mAlbum;


    public Song(String Title, String Artist, String Album) {
        mTitle = Title;
        mArtist = Artist;
        mAlbum = Album;

    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmAlbum() {
        return mAlbum;
    }

    public String getmArtist() {
        return mArtist;
    }




}
