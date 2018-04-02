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

import com.example.android.musicalstructureapp.Artist;
import com.example.android.musicalstructureapp.R;
import com.example.android.musicalstructureapp.adapter.ArtistAdapter;
import com.example.android.musicalstructureapp.adapter.SongAdapter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Tab3Artists extends Fragment {

    View rootView = null;
    ListView listView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.tab3artists, container, false);

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
        listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                //Create an array of songs
                ArrayList<Song> songs = new ArrayList<Song>();

                try{
                    Drawable song_drawable = null;
                    switch(position) {
                        case 0:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Country/Florida Georgia Line/Anything Goes/cover.jpg"), null);
                            songs.add(new Song("01","music/Country/Florida Georgia Line/Anything Goes","Anything Goes", "Florida Georgia Line", song_drawable));
                            songs.add(new Song("02","music/Country/Florida Georgia Line/Anything Goes","Sun Daze", "Florida Georgia Line", song_drawable));
                            songs.add(new Song("03","music/Country/Florida Georgia Line/Anything Goes","Good Good", "Florida Georgia Line", song_drawable));
                            break;
                        case 1:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Dance/Klaypex/Anything Goes/cover.jpg"), null);
                            songs.add(new Song("01","music/Dance/Klaypex/Anything Goes","Intro (Back Home)", "Klaypex", song_drawable));
                            songs.add(new Song("02","music/Dance/Klaypex/Anything Goes","Together", "Klaypex", song_drawable));
                            songs.add(new Song("03","music/Dance/Klaypex/Anything Goes","#shutyourtrap", "Klaypex", song_drawable));
                            songs.add(new Song("04","music/Dance/Klaypex/Anything Goes","Follow Me", "Klaypex", song_drawable));
                            songs.add(new Song("05","music/Dance/Klaypex/Anything Goes","Hava", "Klaypex", song_drawable));
                            break;
                        case 2:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Pop/George Michael/Patience/cover.jpg"), null);
                            songs.add(new Song("01","music/Pop/George Michael/Patience","Patience", "George Michael", song_drawable));
                            songs.add(new Song("02","music/Pop/George Michael/Patience","Amazing", "George Michael", song_drawable));
                            songs.add(new Song("03","music/Pop/George Michael/Patience","John And Elvis Are Dead", "George Michael", song_drawable));
                            songs.add(new Song("04","music/Pop/George Michael/Patience","Cars And Trains", "George Michael", song_drawable));
                            songs.add(new Song("05","music/Pop/George Michael/Patience","Round Here", "George Michael", song_drawable));
                            songs.add(new Song("06","music/Pop/George Michael/Patience","Shoot The Dog", "George Michael", song_drawable));
                            break;
                        case 3:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Pop/Kyle Dixon/Stranger Things, Vol. 2/cover.jpg"), null);
                            songs.add(new Song("01","music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Hopper Sneaks In", "Kyle Dixon", song_drawable));
                            songs.add(new Song("02","music/Pop/Kyle Dixon/Stranger Things, Vol. 2","I Know What I Saw", "Kyle Dixon", song_drawable));
                            songs.add(new Song("03","music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Rolling Out the Pool", "Kyle Dixon", song_drawable));
                            songs.add(new Song("04","music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Over", "Kyle Dixon", song_drawable));
                            songs.add(new Song("05","music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Gearing Up", "Kyle Dixon", song_drawable));
                            songs.add(new Song("06","music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Flickering", "Kyle Dixon", song_drawable));
                            songs.add(new Song("07","music/Pop/Kyle Dixon/Stranger Things, Vol. 2","First Kiss", "Kyle Dixon", song_drawable));
                            songs.add(new Song("08","music/Pop/Kyle Dixon/Stranger Things, Vol. 2","Crying", "Kyle Dixon", song_drawable));
                            break;
                        case 4:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/R&B/Aaliyah/I Care 4 U/cover.jpg"), null);
                            songs.add(new Song("01","music/R&B/Aaliyah/I Care 4 U", "Back & Forth", "Aaliyah", song_drawable));
                            songs.add(new Song("02","music/R&B/Aaliyah/I Care 4 U", "Are You That Somebody", "Aaliyah", song_drawable));
                            songs.add(new Song("03","music/R&B/Aaliyah/I Care 4 U", "One in a Million", "Aaliyah", song_drawable));
                            songs.add(new Song("04","music/R&B/Aaliyah/I Care 4 U", "I Care 4 U", "Aaliyah", song_drawable));
                            songs.add(new Song("05","music/R&B/Aaliyah/I Care 4 U", "More Than a Woman", "Aaliyah", song_drawable));
                            songs.add(new Song("06","music/R&B/Aaliyah/I Care 4 U", "Don't Know What to Tell Ya", "Aaliyah", song_drawable));
                            break;
                        case 5:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/R&B/Barry White/Barry White's Greatest Hits/cover.jpg"), null);
                            songs.add(new Song("01","music/R&B/Barry White/Barry White's Greatest Hits", "What Am I Gonna Do With You", "Barry White", song_drawable));
                            songs.add(new Song("02","music/R&B/Barry White/Barry White's Greatest Hits", "You're the First, the Last, My Everything", "Barry White", song_drawable));
                            songs.add(new Song("03","music/R&B/Barry White/Barry White's Greatest Hits", "Can't Get Enough of Your Love, Babe", "Barry White", song_drawable));
                            break;
                        case 6:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rap/Kendrick Lamar/Black Panther - The Album/cover.jpg"), null);
                            songs.add(new Song("01","music/Rap/Kendrick Lamar/Black Panther - The Album", "Black Panther", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("02","music/Rap/Kendrick Lamar/Black Panther - The Album", "All the Stars", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("03","music/Rap/Kendrick Lamar/Black Panther - The Album", "X", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("04","music/Rap/Kendrick Lamar/Black Panther - The Album", "The Ways", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("05","music/Rap/Kendrick Lamar/Black Panther - The Album", "Opps", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("06","music/Rap/Kendrick Lamar/Black Panther - The Album", "I Am", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("07","music/Rap/Kendrick Lamar/Black Panther - The Album", "Paramedic!", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("08","music/Rap/Kendrick Lamar/Black Panther - The Album", "Bloody Waters", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("09","music/Rap/Kendrick Lamar/Black Panther - The Album", "King's Dead", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("10","music/Rap/Kendrick Lamar/Black Panther - The Album", "Redemption (Interlude)", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("11","music/Rap/Kendrick Lamar/Black Panther - The Album", "Redemption", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("12","music/Rap/Kendrick Lamar/Black Panther - The Album", "Seasons", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("13","music/Rap/Kendrick Lamar/Black Panther - The Album", "Big Shot", "Kendrick Lamar", song_drawable));
                            songs.add(new Song("14","music/Rap/Kendrick Lamar/Black Panther - The Album", "Pray for Me", "Kendrick Lamar", song_drawable));
                            break;
                        case 7:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/Band of Gypsys/cover.jpg"), null);
                            songs.add(new Song("01","music/Rock/Jimi Hendrix/Band of Gypsys", "Who Knows", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("02","music/Rock/Jimi Hendrix/Band of Gypsys", "Machine Gun", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("03","music/Rock/Jimi Hendrix/Band of Gypsys", "Changes", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("04","music/Rock/Jimi Hendrix/Band of Gypsys", "Power to Love", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("05","music/Rock/Jimi Hendrix/Band of Gypsys", "Message to Love", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("06","music/Rock/Jimi Hendrix/Band of Gypsys", "We Gotta Live Together", "Jimi Hendrix", song_drawable));
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/Both Sides of the Sky/cover.jpg"), null);
                            songs.add(new Song("01","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Mannish Boy", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("02","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Lover Man", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("03","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Hear My Train a Comin", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("04","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Stepping Stone", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("05","music/Rock/Jimi Hendrix/Both Sides of the Sky", "$20 Fine", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("06","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Power of Soul", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("07","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Jungle", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("08","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Things I Used to Do", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("09","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Georgia Blues", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("10","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Sweet Angel", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("11","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Woodstock", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("12","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Send My Love to Linda", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("13","music/Rock/Jimi Hendrix/Both Sides of the Sky", "Cherokee Mist", "Jimi Hendrix", song_drawable));
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Jimi Hendrix/The Cry of Love/cover.jpg"), null);
                            songs.add(new Song("01","music/Rock/Jimi Hendrix/The Cry of Love", "Freedom", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("02","music/Rock/Jimi Hendrix/The Cry of Love", "Drifting", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("03","music/Rock/Jimi Hendrix/The Cry of Love", "Ezy Ryder", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("04","music/Rock/Jimi Hendrix/The Cry of Love", "Night Bird Flying", "Jimi Hendrix", song_drawable));
                            songs.add(new Song("05","music/Rock/Jimi Hendrix/The Cry of Love", "My Friend", "Jimi Hendrix", song_drawable));
                            break;
                        case 8:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Nirvana/A Higher State Of Mind/cover.jpg"), null);
                            songs.add(new Song("01","music/Rock/Nirvana/A Higher State Of Mind", "Breed", "Nirvana", song_drawable));
                            songs.add(new Song("02","music/Rock/Nirvana/A Higher State Of Mind", "Drain You", "Nirvana", song_drawable));
                            songs.add(new Song("03","music/Rock/Nirvana/A Higher State Of Mind", "Beeswax", "Nirvana", song_drawable));
                            songs.add(new Song("04","music/Rock/Nirvana/A Higher State Of Mind", "Spank Thru", "Nirvana", song_drawable));
                            break;
                        case 9:
                            song_drawable = Drawable.createFromStream(getContext().getAssets().open("music/Rock/Queen/The Miracle/cover.jpg"), null);
                            songs.add(new Song("01","music/Rock/Queen/The Miracle", "Party", "Queen", song_drawable));
                            songs.add(new Song("02","music/Rock/Queen/The Miracle", "Khashoggi's Ship", "Queen ", song_drawable));
                            songs.add(new Song("03","music/Rock/Queen/The Miracle", "The Miracle", "Queen ", song_drawable));
                            songs.add(new Song("04","music/Rock/Queen/The Miracle", "I Want It All", "Queen ", song_drawable));
                            songs.add(new Song("05","music/Rock/Queen/The Miracle", "The Invisible Man", "Queen ", song_drawable));
                            songs.add(new Song("06","music/Rock/Queen/The Miracle", "Breakthru", "Queen ", song_drawable));
                            break;
                    }
                } catch(IOException e){
                    Log.e("test", e.getMessage());
                }

                // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
                SongAdapter adapter = new SongAdapter(getActivity(), songs);

                // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
                // {@link ListView} will display list items for each song in the list of songs.
                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                        Intent intent = new Intent(getActivity(), SongPlayerActivity.class);

                        //Directory with the name (song path)
                        LinearLayout mainContainerLayout = v.findViewById(R.id.main_container);
                        String songPath = mainContainerLayout.getTag().toString();

                        //Song name
                        String songName = v.findViewById(R.id.song_name).getTag().toString();

                        //Image
                        ImageView songAlbumImageView = v.findViewById(R.id.song_album_image);
                        Bitmap songAlbumImage = ((BitmapDrawable)songAlbumImageView.getDrawable()).getBitmap();

                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        songAlbumImage.compress(Bitmap.CompressFormat.JPEG,100, stream);
                        byte[] byteArray = stream.toByteArray();

                        Bundle songBundle = new Bundle();
                        songBundle.putString(Constants.SONG_NAME, songName);
                        songBundle.putString(Constants.SONG_PATH, songPath);
                        songBundle.putByteArray(Constants.SONG_ALBUM_IMAGE, byteArray);

                        intent.putExtras(songBundle);

                        getActivity().startActivity(intent);
                    }
                });
            }
        });

        return rootView;
    }
}