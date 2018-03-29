package com.example.android.musicalstructureapp;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.musicalstructureapp.Artist;
import com.example.android.musicalstructureapp.R;
import com.example.android.musicalstructureapp.adapter.ArtistAdapter;

import java.io.IOException;
import java.util.ArrayList;

public class Tab3Artists extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3artists, container, false);

        //Create an array of artists
        ArrayList<Artist> artists = new ArrayList<Artist>();

        try{
            Drawable artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Country/Florida Georgia Line/artist.jpg"), null);
            artists.add(new Artist("Florida Georgia Line", artist_drawable));
            artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Dance/Klaypex/artist.jpg"), null);
            artists.add(new Artist("Klaypex", artist_drawable));
            artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Pop/George Michael/artist.jpg"), null);
            artists.add(new Artist("George Michael", artist_drawable));
            artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Pop/Kyle Dixon/artist.jpg"), null);
            artists.add(new Artist("Kyle Dixon", artist_drawable));
            artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/R&B/Aaliyah/artist.jpg"), null);
            artists.add(new Artist("Aaliyah", artist_drawable));
            artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/R&B/Barry White/artist.jpg"), null);
            artists.add(new Artist("Barry White", artist_drawable));
            artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rap/Kendrick Lamar/artist.jpg"), null);
            artists.add(new Artist("Kendrick Lamar", artist_drawable));
            artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/artist.jpg"), null);
            artists.add(new Artist("Jimi Hendrix", artist_drawable));
            artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Nirvana/artist.jpg"), null);
            artists.add(new Artist("Nirvana", artist_drawable));
            artist_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Queen/artist.jpg"), null);
            artists.add(new Artist("Queen", artist_drawable));
        } catch(IOException e){
            Log.e("test", e.getMessage());
        }

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        ArtistAdapter adapter = new ArtistAdapter(getActivity(), artists);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        listView.setAdapter(adapter);

        return rootView;
    }
}