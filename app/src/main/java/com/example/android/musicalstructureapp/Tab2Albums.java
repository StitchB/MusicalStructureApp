package com.example.android.musicalstructureapp;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.musicalstructureapp.Album;
import com.example.android.musicalstructureapp.R;
import com.example.android.musicalstructureapp.adapter.AlbumAdapter;

import java.io.IOException;
import java.util.ArrayList;

public class Tab2Albums extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2albums, container, false);

        //Create an array of albums
        ArrayList<Album> albums = new ArrayList<Album>();

        try{
            Drawable album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Country/Florida Georgia Line/Anything Goes/cover.jpg"), null);
            albums.add(new Album("Anything Goes", "Florida Georgia Line", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Dance/Klaypex/Anything Goes/cover.jpg"), null);
            albums.add(new Album("Anything Goes", "Klaypex", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Pop/George Michael/Patience/cover.jpg"), null);
            albums.add(new Album("Patience", "George Michael", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Pop/Kyle Dixon/Stranger Things, Vol. 2/cover.jpg"), null);
            albums.add(new Album("Stranger Things, Vol. 2", "Kyle Dixon", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/R&B/Aaliyah/I Care 4 U/cover.jpg"), null);
            albums.add(new Album("I Care 4 U", "Aaliyah", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/R&B/Barry White/Barry White's Greatest Hits/cover.jpg"), null);
            albums.add(new Album("Barry White's Greatest Hits", "Barry White", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rap/Kendrick Lamar/Black Panther - The Album/cover.jpg"), null);
            albums.add(new Album("Black Panther - The Album", "Kendrick Lamar", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/Band of Gypsys/cover.jpg"), null);
            albums.add(new Album("Band of Gypsys", "Jimi Hendrix", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/Both Sides of the Sky/cover.jpg"), null);
            albums.add(new Album("Both Sides of the Sky", "Jimi Hendrix", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/The Cry of Love/cover.jpg"), null);
            albums.add(new Album("The Cry of Love", "Jimi Hendrix", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Nirvana/A Higher State Of Mind/cover.jpg"), null);
            albums.add(new Album("A Higher State Of Mind", "Nirvana", album_drawable));
            album_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Queen/The Miracle/cover.jpg"), null);
            albums.add(new Album("The Miracle", "Queen", album_drawable));
        } catch(IOException e){
            Log.e("test", e.getMessage());
            //this.getLocalClassName().toString() could be replaced with any (string) tag
        }

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        AlbumAdapter adapter = new AlbumAdapter(getActivity(), albums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each album in the list of albums.
        listView.setAdapter(adapter);

        return rootView;
    }
}