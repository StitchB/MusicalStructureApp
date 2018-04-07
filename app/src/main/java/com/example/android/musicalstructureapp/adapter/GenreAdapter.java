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

import com.example.android.musicalstructureapp.Genre;
import com.example.android.musicalstructureapp.R;

import java.util.ArrayList;

/*
 * {@link GenreAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Genre} objects.
 * */
public class GenreAdapter extends ArrayAdapter<Genre> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param genres  A List of genres objects to display in a list
     */
    public GenreAdapter(Activity context, ArrayList<Genre> genres) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for one TextView and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, genres);
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
                    R.layout.genre_list_item, parent, false);
        }

        // Get the {@link Genre} object located at this position in the list
        Genre currentGenre = getItem(position);

        // Find the TextView in the list_item.xml layout with the genre name
        TextView genreNameTextView = listItemView.findViewById(R.id.genre_name);
        // Get the genre name from the current Genre object and
        // set this text on the genre name TextView
        genreNameTextView.setText(currentGenre.getGenreName());

        // Find the ImageView in the genre_list_item.xml layout with the ID genre_image
        ImageView iconView = listItemView.findViewById(R.id.genre_image);
        // Get the image resource ID from the current Genre object and
        // set the image to iconView
        iconView.setImageDrawable(currentGenre.getGenreImage());

        // Return the whole list item layout (containing TextView and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
