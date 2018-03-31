package com.example.android.musicalstructureapp;

import android.graphics.drawable.Drawable;

/**
 * {@link Song} represents a song
 * It contains a song name & it's author
 */
public class Song {

    //Song counter (inluding leading zero if number is between 1 and 9)
    private String mSongCounter;

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
     * @param songCounter is the song counter
     * @param songDirectory is the song directory
     * @param songName is the song name
     * @param songAuthor is the song author
     * @param songAlbumImage is the song album image
     */
    public Song(String songCounter, String songDirectory, String songName, String songAuthor, Drawable songAlbumImage) {
        mSongCounter = songCounter;
        mSongDirectory = songDirectory;
        mSongName = songName;
        mSongAuthor = songAuthor;
        mSongAlbumImage = songAlbumImage;
    }

    /**
     * Get the song counter
     */
    public String getSongCounter() {
        return mSongCounter;
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