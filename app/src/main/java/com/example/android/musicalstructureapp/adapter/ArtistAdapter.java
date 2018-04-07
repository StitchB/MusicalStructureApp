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

import com.example.android.musicalstructureapp.Artist;
import com.example.android.musicalstructureapp.R;

import java.util.ArrayList;

/*
 * {@link ArtistAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Artist} objects.
 * */
public class ArtistAdapter extends ArrayAdapter<Artist> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param artists A List of artists objects to display in a list
     */
    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for one TextView and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, artists);
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
                    R.layout.artist_list_item, parent, false);
        }

        // Get the {@link Artist} object located at this position in the list
        Artist currentArtist = getItem(position);

        // Find the TextView in the list_item.xml layout with the artist name
        TextView artistNameTextView = listItemView.findViewById(R.id.artist_name);
        // Get the artist name from the current Artist object and
        // set this text on the artist name TextView
        artistNameTextView.setText(currentArtist.getArtistName());

        // Find the ImageView in the artist_list_item.xml layout with the ID artist_image
        ImageView iconView = listItemView.findViewById(R.id.artist_image);
        // Get the image resource ID from the current Artist object and
        // set the image to iconView
        iconView.setImageDrawable(currentArtist.getArtistImage());

        // Return the whole list item layout (containing TextView and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
