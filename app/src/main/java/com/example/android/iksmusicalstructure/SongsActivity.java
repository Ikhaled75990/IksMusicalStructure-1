package com.example.android.iksmusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //Find the shows activity_songs.xml file
        Button playing = (Button) findViewById(R.id.now_playing);

        //Set a click listener on the view
        playing.setOnClickListener(new View.OnClickListener() {
                                       //The code in this method will be executed when the Playing button is clicked
                                       @Override
                                       public void onClick(View view) {
                                           Intent playingIntent = new Intent(SongsActivity.this, PlayingActivity.class);
                                           startActivity(playingIntent);
                                       }
                                   }
        );

        //Find the shows activity_songs.xml file
        Button albums = (Button) findViewById(R.id.albums);

        //Set a click listener on the view
        albums.setOnClickListener(new View.OnClickListener() {
                                      //The code in this method will be executed when the Albums button is clicked
                                      @Override
                                      public void onClick(View view) {
                                          Intent albumsIntent = new Intent(SongsActivity.this, AlbumsActivity.class);
                                          startActivity(albumsIntent);
                                      }
                                  }
        );

        //Find the shows activity_songs.xml file
        Button artists = (Button) findViewById(R.id.artists);

        //Set a click listener on the view
        artists.setOnClickListener(new View.OnClickListener() {
                                       //The code in this method will be executed when the Artists button is clicked
                                       @Override
                                       public void onClick(View view) {
                                           Intent artistsIntent = new Intent(SongsActivity.this, ArtistsActivity.class);
                                           startActivity(artistsIntent);
                                       }
                                   }
        );

        //Find the shows activity_songs.xml file
        Button playlists = (Button) findViewById(R.id.playlists);

        //Set a click listener on the view
        playlists.setOnClickListener(new View.OnClickListener() {
                                         //The code in this method will be executed when the Playlists button is clicked
                                         @Override
                                         public void onClick(View view) {
                                             Intent playlistsIntent = new Intent(SongsActivity.this, PlayedActivity.class);
                                             startActivity(playlistsIntent);
                                         }
                                     }
        );


    }
}
