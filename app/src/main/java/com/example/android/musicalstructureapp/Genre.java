package com.example.android.musicalstructureapp;

import android.graphics.drawable.Drawable;

/**
 * {@link Genre} represents a music genre
 * It contains a genre name & related image
 */
public class Genre {

    //Genre name
    private String mGenreName;

    //Genre image
    private Drawable mGenreImage;

    /**
     * Create a new Genre object.
     *
     * @param genreName is the name of the genre
     * @param genreImage is the image representing the genre
     */
    public Genre(String genreName, Drawable genreImage) {
        mGenreName = genreName;
        mGenreImage = genreImage;
    }

    /**
     * Get the genre name
     */
    public String getGenreName() {
        return mGenreName;
    }

    /**
     * Get the image drawable
     */
    public Drawable getGenreImage() {
        return mGenreImage;
    }
}