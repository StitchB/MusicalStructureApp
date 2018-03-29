package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.android.musicalstructureapp.R;
import com.example.android.musicalstructureapp.Song;
import com.example.android.musicalstructureapp.SongPlayerActivity;
import com.example.android.musicalstructureapp.adapter.SongAdapter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Tab1Songs extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1songs, container, false);

        //Create an array of songs
        ArrayList<Song> songs = new ArrayList<Song>();

        try{
            Drawable song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Country/Florida Georgia Line/Anything Goes/cover.jpg"), null);
            songs.add(new Song("music/Country/Florida Georgia Line/Anything Goes","Anything Goes", "Florida Georgia Line", song_drawable));
            songs.add(new Song("music/Country/Florida Georgia Line/Anything Goes","Sun Daze", "Florida Georgia Line", song_drawable));
            songs.add(new Song("music/Country/Florida Georgia Line/Anything Goes","Good Good", "Florida Georgia Line", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Dance/Klaypex/Anything Goes/cover.jpg"), null);
            songs.add(new Song("music/Dance/Klaypex/Anything Goes","Intro (Back Home)", "Klaypex", song_drawable));
            songs.add(new Song("music/Dance/Klaypex/Anything Goes","Together", "Klaypex", song_drawable));
            songs.add(new Song("music/Dance/Klaypex/Anything Goes","#shutyourtrap", "Klaypex", song_drawable));
            songs.add(new Song("music/Dance/Klaypex/Anything Goes","Follow Me", "Klaypex", song_drawable));
            songs.add(new Song("music/Dance/Klaypex/Anything Goes","Hava", "Klaypex", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Pop/George Michael/Patience/cover.jpg"), null);
            songs.add(new Song("music/Pop/George Michael/Patience","Patience", "George Michael", song_drawable));
            songs.add(new Song("music/Pop/George Michael/Patience","Amazing", "George Michael", song_drawable));
            songs.add(new Song("music/Pop/George Michael/Patience","John And Elvis Are Dead", "George Michael", song_drawable));
            songs.add(new Song("music/Pop/George Michael/Patience","Cars And Trains", "George Michael", song_drawable));
            songs.add(new Song("music/Pop/George Michael/Patience","Round Here", "George Michael", song_drawable));
            songs.add(new Song("music/Pop/George Michael/Patience","Shoot The Dog", "George Michael", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Pop/Kyle Dixon/Stranger Things, Vol. 2/cover.jpg"), null);
            songs.add(new Song("music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Hopper Sneaks In", "Kyle Dixon", song_drawable));
            songs.add(new Song("music/Pop/Kyle Dixon/Stranger Things, Vol. 2","I Know What I Saw", "Kyle Dixon", song_drawable));
            songs.add(new Song("music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Rolling Out the Pool", "Kyle Dixon", song_drawable));
            songs.add(new Song("music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Over", "Kyle Dixon", song_drawable));
            songs.add(new Song("music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Gearing Up", "Kyle Dixon", song_drawable));
            songs.add(new Song("music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Flickering", "Kyle Dixon", song_drawable));
            songs.add(new Song("music/Pop/Kyle Dixon/Stranger Things, Vol. 2","First Kiss", "Kyle Dixon", song_drawable));
            songs.add(new Song("music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Crying", "Kyle Dixon", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/R&B/Aaliyah/I Care 4 U/cover.jpg"), null);
            songs.add(new Song("music/R&B/Aaliyah/I Care 4 U", "Back & Forth", "Aaliyah", song_drawable));
            songs.add(new Song("music/R&B/Aaliyah/I Care 4 U", "Are You That Somebody", "Aaliyah", song_drawable));
            songs.add(new Song("music/R&B/Aaliyah/I Care 4 U", "One in a Million", "Aaliyah", song_drawable));
            songs.add(new Song("music/R&B/Aaliyah/I Care 4 U", "I Care 4 U", "Aaliyah", song_drawable));
            songs.add(new Song("music/R&B/Aaliyah/I Care 4 U", "More Than a Woman", "Aaliyah", song_drawable));
            songs.add(new Song("music/R&B/Aaliyah/I Care 4 U", "Don't Know What to Tell Ya", "Aaliyah", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/R&B/Barry White/Barry White's Greatest Hits/cover.jpg"), null);
            songs.add(new Song("music/R&B/Barry White/Barry White's Greatest Hits", "What Am I Gonna Do With You", "Barry White", song_drawable));
            songs.add(new Song("music/R&B/Barry White/Barry White's Greatest Hits", "You're the First, the Last, My Everything", "Barry White", song_drawable));
            songs.add(new Song("music/R&B/Barry White/Barry White's Greatest Hits", "Can't Get Enough of Your Love, Babe", "Barry White", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rap/Kendrick Lamar/Black Panther - The Album/cover.jpg"), null);
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "Black Panther", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "All the Stars", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "X", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "The Ways", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "Opps", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "I Am", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "Paramedic!", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "Bloody Waters", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "King's Dead", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "Redemption (Interlude)", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "Redemption", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "Seasons", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "Big Shot", "Kendrick Lamar", song_drawable));
            songs.add(new Song("music/Rap/Kendrick Lamar/Black Panther - The Album", "Pray for Me", "Kendrick Lamar", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/Band of Gypsys/cover.jpg"), null);
            songs.add(new Song("music/Rock/Jimi Hendrix/Band of Gypsys", "Who Knows", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Band of Gypsys", "Machine Gun", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Band of Gypsys", "Changes", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Band of Gypsys", "Power to Love", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Band of Gypsys", "Message to Love", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Band of Gypsys", "We Gotta Live Together", "Jimi Hendrix", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/Both Sides of the Sky/cover.jpg"), null);
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Mannish Boy", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Lover Man", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Hear My Train a Comin", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Stepping Stone", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "$20 Fine", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Power of Soul", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Jungle", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Things I Used to Do", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Georgia Blues", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Sweet Angel", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Woodstock", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Send My Love to Linda", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/Both Sides of the Sky", "Cherokee Mist", "Jimi Hendrix", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/The Cry of Love/cover.jpg"), null);
            songs.add(new Song("music/Rock/Jimi Hendrix/The Cry of Love", "Freedom", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/The Cry of Love", "Drifting", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/The Cry of Love", "Ezy Ryder", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/The Cry of Love", "Night Bird Flying", "Jimi Hendrix", song_drawable));
            songs.add(new Song("music/Rock/Jimi Hendrix/The Cry of Love", "My Friend", "Jimi Hendrix", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Nirvana/A Higher State Of Mind/cover.jpg"), null);
            songs.add(new Song("music/Rock/Nirvana/A Higher State Of Mind", "Breed", "Nirvana", song_drawable));
            songs.add(new Song("music/Rock/Nirvana/A Higher State Of Mind", "Drain You", "Nirvana", song_drawable));
            songs.add(new Song("music/Rock/Nirvana/A Higher State Of Mind", "Beeswax", "Nirvana", song_drawable));
            songs.add(new Song("music/Rock/Nirvana/A Higher State Of Mind", "Spank Thru", "Nirvana", song_drawable));
            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Queen/The Miracle/cover.jpg"), null);
            songs.add(new Song("music/Rock/Queen/The Miracle", "Party", "Queen", song_drawable));
            songs.add(new Song("music/Rock/Queen/The Miracle", "Khashoggi's Ship", "Queen ", song_drawable));
            songs.add(new Song("music/Rock/Queen/The Miracle", "The Miracle", "Queen ", song_drawable));
            songs.add(new Song("music/Rock/Queen/The Miracle", "I Want It All", "Queen ", song_drawable));
            songs.add(new Song("music/Rock/Queen/The Miracle", "The Invisible Man", "Queen ", song_drawable));
            songs.add(new Song("music/Rock/Queen/The Miracle", "Breakthru", "Queen ", song_drawable));
        } catch(IOException e){
            Log.e("test", e.getMessage());
        }

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        SongAdapter adapter = new SongAdapter(getActivity(), songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each song in the list of songs.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent(getActivity(), SongPlayerActivity.class);

                //Directory with the name (song path)
                LinearLayout mainContainerLayout = v.findViewById(R.id.main_container);
                String songPath = mainContainerLayout.getTag().toString();

                //Image
                ImageView songAlbumImageView = v.findViewById(R.id.song_album_image);
                Bitmap songAlbumImage = ((BitmapDrawable)songAlbumImageView.getDrawable()).getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                songAlbumImage.compress(Bitmap.CompressFormat.JPEG,100, stream);
                byte[] byteArray = stream.toByteArray();

                Bundle songBundle = new Bundle();
                songBundle.putString(Constants.SONG_PATH, songPath); //TODO use on media player for playing correct song & showing correct name
                songBundle.putByteArray(Constants.SONG_ALBUM_IMAGE, byteArray);

                intent.putExtras(songBundle);

                getActivity().startActivity(intent);
            }
        });

        return rootView;
    }
}
