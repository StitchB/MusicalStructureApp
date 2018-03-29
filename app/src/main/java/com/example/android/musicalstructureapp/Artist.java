package com.example.android.musicalstructureapp;

import android.graphics.drawable.Drawable;

/**
 * {@link Artist} represents a music artist
 * It contains a artist name & related image
 */
public class Artist {

    //Artist name
    private String mArtistName;

    //Artist image
    private Drawable mArtistImage;

    /**
     * Create a new Artist object.
     *
     * @param artistName is the name of the artist
     * @param artistImage is the image representing the artist
     */
    public Artist(String artistName, Drawable artistImage) {
        mArtistName = artistName;
        mArtistImage = artistImage;
    }

    /**
     * Get the artist name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the image drawable
     */
    public Drawable getArtistImage() {
        return mArtistImage;
    }
}