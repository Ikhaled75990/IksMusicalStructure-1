package com.example.android.iksmusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.iksmusicalstructure.R.string.playing;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        //Find the shows activity_playing.xml file
        Button songs = (Button) findViewById(R.id.songs);

        //Set a click listener on the view
        songs.setOnClickListener(new View.OnClickListener() {
                                     //The code in this method will be executed when the Songs button is clicked
                                     @Override
                                     public void onClick(View view) {
                                         Intent songsIntent = new Intent(PlayingActivity.this, SongsActivity.class);
                                         startActivity(songsIntent);
                                     }
                                 }
        );

        //Find the shows activity_playing.xml file
        Button albums = (Button) findViewById(R.id.albums);

        //Set a click listener on the view
        albums.setOnClickListener(new View.OnClickListener() {
                                      //The code in this method will be executed when the Albums button is clicked
                                      @Override
                                      public void onClick(View view) {
                                          Intent albumsIntent = new Intent(PlayingActivity.this, AlbumsActivity.class);
                                          startActivity(albumsIntent);
                                      }
                                  }
        );

        //Find the shows activity_playing.xml file
        Button artists = (Button) findViewById(R.id.artists);

        //Set a click listener on the view
        artists.setOnClickListener(new View.OnClickListener() {
                                       //The code in this method will be executed when the Artists button is clicked
                                       @Override
                                       public void onClick(View view) {
                                           Intent artistsIntent = new Intent(PlayingActivity.this, ArtistsActivity.class);
                                           startActivity(artistsIntent);
                                       }
                                   }
        );

        //Find the shows activity_playing.xml file
        Button playlists = (Button) findViewById(R.id.playlists);

        //Set a click listener on the view
        playlists.setOnClickListener(new View.OnClickListener() {
                                         //The code in this method will be executed when the Playlists button is clicked
                                         @Override
                                         public void onClick(View view) {
                                             Intent playlistsIntent = new Intent(PlayingActivity.this, PlayedActivity.class);
                                             startActivity(playlistsIntent);
                                         }
                                     }
        );
    }
}
