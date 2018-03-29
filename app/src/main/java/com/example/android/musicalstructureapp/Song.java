package com.example.android.musicalstructureapp;

import android.graphics.drawable.Drawable;

/**
 * {@link Song} represents a song
 * It contains a song name & it's author
 */
public class Song {

    //Song directory
    private String mSongDirectory;

    //Song name
    private String mSongName;

    //Song author
    private String mSongAuthor;

    //Song album image
    private Drawable mSongAlbumImage;

    /**
     * Create a new Album object.
     *
     * @param songDirectory is the song directory
     * @param songName is the song name
     * @param songAuthor is the song author
     * @param songAlbumImage is the song album image
     */
    public Song(String songDirectory, String songName, String songAuthor, Drawable songAlbumImage) {
        mSongDirectory = songDirectory;
        mSongName = songName;
        mSongAuthor = songAuthor;
        mSongAlbumImage = songAlbumImage;
    }

    /**
     * Get the song directory
     */
    public String getSongDirectory() {
        return mSongDirectory;
    }

    /**
     * Get the song name
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the song author
     */
    public String getSongAuthor() {
        return mSongAuthor;
    }

    /**
     * Get the song album image
     */
    public Drawable getSongAlbumImage() {
        return mSongAlbumImage;
    }
}