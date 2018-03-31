package com.example.android.musicalstructureapp.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.musicalstructureapp.R;
import com.example.android.musicalstructureapp.Song;

import java.util.ArrayList;

/*
* {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Song} objects.
* */
public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param songs   A List of songs objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Set tag containing song directory with name
        // Find the main_container layout
        LinearLayout mainContainerLayout = listItemView.findViewById(R.id.main_container);
        // Get the directory with song name from the current Song object and
        // set this as tag on the main_container layout
        mainContainerLayout.setTag(currentSong.getSongDirectory()+"/"+currentSong.getSongCounter()+" - "+currentSong.getSongName()+".mp3");

        // Find the TextView in the list_item.xml layout with the song name
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the song name from the current Song object and
        // set this text on the song name TextView
        songNameTextView.setTag(currentSong.getSongName());
        songNameTextView.setText(currentSong.getSongName());

        // Find the TextView in the song_list_item.xml layout with the song name
        TextView authorNameTextView = (TextView) listItemView.findViewById(R.id.song_author);
        // Get the song name from the current Song object and
        // set this text on the song name TextView
        authorNameTextView.setText(currentSong.getSongAuthor());

        // Find the ImageView in the list_item.xml layout with the ID song_album_image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.song_album_image);
        // Get the image resource ID from the current Song object and
        // set the image to iconView
        iconView.setImageDrawable(currentSong.getSongAlbumImage());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
