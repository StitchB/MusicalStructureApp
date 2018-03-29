package com.example.android.musicalstructureapp.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicalstructureapp.Album;
import com.example.android.musicalstructureapp.R;

import java.util.ArrayList;

/*
* {@link AlbumAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Album} objects.
* */
public class AlbumAdapter extends ArrayAdapter<Album> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param albums   A List of albums objects to display in a list
     */
    public AlbumAdapter(Activity context, ArrayList<Album> albums) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, albums);
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
                    R.layout.album_list_item, parent, false);
        }

        // Get the {@link Album} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the list_item.xml layout with the album name
        TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.album_name);
        // Get the genre name from the current Genre object and
        // set this text on the genre name TextView
        albumNameTextView.setText(currentAlbum.getAlbumName());

        // Find the TextView in the list_item.xml layout with the album name
        TextView authorNameTextView = (TextView) listItemView.findViewById(R.id.album_author);
        // Get the genre name from the current Genre object and
        // set this text on the genre name TextView
        authorNameTextView.setText(currentAlbum.getAlbumAuthor());

        // Find the ImageView in the album_list_item.xml layout with the ID album_image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.album_image);
        // Get the image resource ID from the current Album object and
        // set the image to iconView
        iconView.setImageDrawable(currentAlbum.getAlbumImage());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
