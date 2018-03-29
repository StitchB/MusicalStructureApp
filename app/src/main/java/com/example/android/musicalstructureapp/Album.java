package com.example.android.musicalstructureapp;

import android.graphics.drawable.Drawable;

/**
 * {@link Album} represents an album
 * It contains a album name & it's author
 */
public class Album {

    //Album name
    private String mAlbumName;

    //Album author
    private String mAlbumAuthor;

    //Album image
    private Drawable mAlbumImage;

    /**
     * Create a new Album object.
     *
     * @param albumName is the album name
     * @param albumAuthor is the album author
     * @param albumImage is the album image
     */
    public Album(String albumName, String albumAuthor, Drawable albumImage) {
        mAlbumName = albumName;
        mAlbumAuthor = albumAuthor;
        mAlbumImage = albumImage;
    }

    /**
     * Get the album name
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the album author
     */
    public String getAlbumAuthor() {
        return mAlbumAuthor;
    }

    /**
     * Get the album image
     */
    public Drawable getAlbumImage() {
        return mAlbumImage;
    }
}