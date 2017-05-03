package com.example.android.iksmusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        //Find the shows activity_artists.xml file
        Button playing = (Button) findViewById(R.id.now_playing);

        //Set a click listener on the view
        playing.setOnClickListener(new View.OnClickListener() {
                                       //The code in this method will be executed when the Playing button is clicked
                                       @Override
                                       public void onClick(View view) {
                                           Intent playingIntent = new Intent(ArtistsActivity.this, PlayingActivity.class);
                                           startActivity(playingIntent);
                                       }
                                   }
        );

        //Find the shows activity_artists.xml file
        Button songs = (Button) findViewById(R.id.songs);

        //Set a click listener on the view
        songs.setOnClickListener(new View.OnClickListener() {
                                     //The code in this method will be executed when the Songs button is clicked
                                     @Override
                                     public void onClick(View view) {
                                         Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                                         startActivity(songsIntent);
                                     }
                                 }
        );

        //Find the shows activity_artists.xml file
        Button albums = (Button) findViewById(R.id.albums);

        //Set a click listener on the view
        albums.setOnClickListener(new View.OnClickListener() {
                                      //The code in this method will be executed when the Artists button is clicked
                                      @Override
                                      public void onClick(View view) {
                                          Intent albumsIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                                          startActivity(albumsIntent);
                                      }
                                  }
        );

        //Find the shows activity_albums.xml file
        Button playlists = (Button) findViewById(R.id.playlists);

        //Set a click listener on the view
        playlists.setOnClickListener(new View.OnClickListener() {
                                         //The code in this method will be executed when the Playlists button is clicked
                                         @Override
                                         public void onClick(View view) {
                                             Intent playlistsIntent = new Intent(ArtistsActivity.this, PlayedActivity.class);
                                             startActivity(playlistsIntent);
                                         }
                                     }
        );
    }
}
