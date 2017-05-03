package com.example.android.iksmusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity to be activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the shows activity_main.xml file
        TextView playing = (TextView) findViewById(R.id.now_playing);

        //Set a click listener on the view
        playing.setOnClickListener(new View.OnClickListener() {
                                       //The code in this method will be executed when the Now Playing view is clicked
                                       @Override
                                       public void onClick(View view) {
                                           Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                                           startActivity(playingIntent);
                                       }
                                   }
        );

        //Find the shows activity_main.xml file
        TextView songs = (TextView) findViewById(R.id.songs);

        //Set a click listener on the view
        songs.setOnClickListener(new View.OnClickListener() {
                                     //The code in this method will be executed when the Now Playing view is clicked
                                     @Override
                                     public void onClick(View view) {
                                         Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                                         startActivity(songsIntent);
                                     }
                                 }
        );

        //Find the shows activity_main.xml file
        TextView albums = (TextView) findViewById(R.id.albums);

        //Set a click listener on the view
        albums.setOnClickListener(new View.OnClickListener() {
                                      //The code in this method will be executed when the Now Playing view is clicked
                                      @Override
                                      public void onClick(View view) {
                                          Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                                          startActivity(albumsIntent);
                                      }
                                  }
        );

        //Find the shows activity_main.xml file
        TextView artists = (TextView) findViewById(R.id.artists);

        //Set a click listener on the view
        artists.setOnClickListener(new View.OnClickListener() {
                                       //The code in this method will be executed when the Now Playing view is clicked
                                       @Override
                                       public void onClick(View view) {
                                           Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                                           startActivity(artistsIntent);
                                       }
                                   }
        );

        //Find the shows activity_main.xml file
        TextView playlists = (TextView) findViewById(R.id.playlists);

        //Set a click listener on the view
        playlists.setOnClickListener(new View.OnClickListener() {
                                         //The code in this method will be executed when the Now Playing view is clicked
                                         @Override
                                         public void onClick(View view) {
                                             Intent playlistsIntent = new Intent(MainActivity.this, PlayedActivity.class);
                                             startActivity(playlistsIntent);
                                         }
                                     }
        );


    }
}
