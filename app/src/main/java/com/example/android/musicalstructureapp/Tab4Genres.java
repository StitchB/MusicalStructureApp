package com.example.android.musicalstructureapp;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.musicalstructureapp.Genre;
import com.example.android.musicalstructureapp.R;
import com.example.android.musicalstructureapp.adapter.GenreAdapter;

import java.io.IOException;
import java.util.ArrayList;

public class Tab4Genres extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab4genres, container, false);

        //Create an array of genres
        ArrayList<Genre> genres = new ArrayList<Genre>();

        try{
            Drawable genre_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Country/genre.jpg"), null);
            genres.add(new Genre("Country", genre_drawable));
            genre_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Dance/genre.jpg"), null);
            genres.add(new Genre("Dance", genre_drawable));
            genre_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Pop/genre.jpg"), null);
            genres.add(new Genre("Pop", genre_drawable));
            genre_drawable = Drawable.createFromStream(getContext().getAssets().open("music/R&B/genre.jpg"), null);
            genres.add(new Genre("R&B", genre_drawable));
            genre_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rap/genre.jpg"), null);
            genres.add(new Genre("Rap", genre_drawable));
            genre_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/genre.jpg"), null);
            genres.add(new Genre("Rock", genre_drawable));
        } catch(IOException e){
            Log.e("test", e.getMessage());
        }

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        GenreAdapter adapter = new GenreAdapter(getActivity(), genres);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        listView.setAdapter(adapter);

        return rootView;
    }
}