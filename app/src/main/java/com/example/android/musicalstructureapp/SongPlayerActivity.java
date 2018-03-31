/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * CODE BASED ON https://www.tutorialspoint.com/android/android_mediaplayer.htm
 */
package com.example.android.musicalstructureapp;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import junit.framework.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SongPlayerActivity extends AppCompatActivity {

    private Button forwardButton, playPauseButton, rewindButton;

    private double startTime = 0;
    private double finalTime = 0;

    private Handler myHandler = new Handler();;
    private int forwardTime = 5000;
    private int backwardTime = 5000;
    private SeekBar seekBar;
    private TextView currentTime, totalTime, songName;

    private MediaPlayer mediaPlayer = null;
    private String[] musicFiles = null;

    //Variables to keep the song album image
    private String songPath;
    private Bitmap songAlbumImage;
    private byte[] songAlbumImageByteArray;

    private boolean songIsPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_song_player.xml layout file
        setContentView(R.layout.activity_song_player);

        //Get data set by previous activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            songPath = extras.getString(Constants.SONG_PATH);
            songAlbumImageByteArray = extras.getByteArray(Constants.SONG_ALBUM_IMAGE);
            songAlbumImage = BitmapFactory.decodeByteArray(songAlbumImageByteArray,0, songAlbumImageByteArray.length);

            //Show current song album image
            ImageView songAlbumImageView = findViewById(R.id.song_album_image);
            songAlbumImageView.setImageBitmap(songAlbumImage);
        }

        //Start setting up media player elemnts
        forwardButton = (Button)findViewById(R.id.forward_button);
        playPauseButton = (Button)findViewById(R.id.play_pause_button);
        rewindButton = (Button)findViewById(R.id.rewind_button);

        currentTime = (TextView)findViewById(R.id.current_time);
        totalTime = (TextView)findViewById(R.id.total_time);
        songName = (TextView)findViewById(R.id.song_name);
        songName.setText(extras.getString(Constants.SONG_NAME)+".mp3");

        seekBar = (SeekBar)findViewById(R.id.seek_bar);
        seekBar.setClickable(false);

        try {
            mediaPlayer = new MediaPlayer();
            AssetFileDescriptor afd = this.getAssets().openFd(songPath);
            mediaPlayer.setDataSource(
                    afd.getFileDescriptor(),
                    afd.getStartOffset(),
                    afd.getLength()
            );
            afd.close();
            mediaPlayer.prepare();
            mediaPlayer.start();

            finalTime = mediaPlayer.getDuration();
            startTime = mediaPlayer.getCurrentPosition();

            seekBar.setMax((int) finalTime);

            currentTime.setText(String.format("%d min, %d sec",
                    TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                    startTime)))
            );

            totalTime.setText(String.format("%d min, %d sec",
                    TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                    finalTime)))
            );

            seekBar.setProgress((int)startTime);
            myHandler.postDelayed(updateSongTime,100);
            playPauseButton.setEnabled(true);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        rewindButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int)startTime;

                if((temp-backwardTime)>0){
                    startTime = startTime - backwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(),"You have Jumped backward 5 seconds", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Cannot jump backward 5 seconds", Toast.LENGTH_SHORT).show();
                }

                mediaPlayer.start();
            }
        });

        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(songIsPlaying) {
                    songIsPlaying = false;
                    Toast.makeText(getApplicationContext(),"Playing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();

                    finalTime = mediaPlayer.getDuration();
                    startTime = mediaPlayer.getCurrentPosition();

                    seekBar.setMax((int) finalTime);

                    currentTime.setText(String.format("%d min, %d sec",
                            TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                            TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)
                                            startTime)))
                    );

                    seekBar.setProgress((int)startTime);
                    myHandler.postDelayed(updateSongTime,100);
                    playPauseButton.setText(R.string.pause);
                } else {
                    songIsPlaying = true;
                    Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                    mediaPlayer.pause();
                    playPauseButton.setText(R.string.play);
                }
            }
        });

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int)startTime;

                if((temp+forwardTime)<=finalTime){
                    startTime = startTime + forwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(),"You have Jumped forward 5 seconds", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Cannot jump forward 5 seconds", Toast.LENGTH_SHORT).show();
                }

                mediaPlayer.start();
            }
        });
    }

    private Runnable updateSongTime = new Runnable() {
        public void run() {
            startTime = mediaPlayer.getCurrentPosition();
            currentTime.setText(String.format("%d min, %d sec",
                    TimeUnit.MILLISECONDS.toMinutes((long) startTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) startTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                    toMinutes((long) startTime)))
            );
            seekBar.setProgress((int)startTime);
            myHandler.postDelayed(this,100);
        }
    };
}
