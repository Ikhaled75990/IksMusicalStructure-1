package com.example.android.iksmusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_played);

        //Find the shows activity_played.xml file
        Button playing = (Button) findViewById(R.id.now_playing);

        //Set a click listener on the view
        playing.setOnClickListener(new View.OnClickListener() {
                                       //The code in this method will be executed when the Playing button is clicked
                                       @Override
                                       public void onClick(View view) {
                                           Intent playingIntent = new Intent(PlayedActivity.this, PlayingActivity.class);
                                           startActivity(playingIntent);
                                       }
                                   }
        );

        //Find the shows activity_played.xml file
        Button songs = (Button) findViewById(R.id.songs);

        //Set a click listener on the view
        songs.setOnClickListener(new View.OnClickListener() {
                                     //The code in this method will be executed when the Songs button is clicked
                                     @Override
                                     public void onClick(View view) {
                                         Intent songsIntent = new Intent(PlayedActivity.this, SongsActivity.class);
                                         startActivity(songsIntent);
                                     }
                                 }
        );

        //Find the shows activity_played.xml file
        Button albums = (Button) findViewById(R.id.albums);

        //Set a click listener on the view
        albums.setOnClickListener(new View.OnClickListener() {
                                      //The code in this method will be executed when the Albums button is clicked
                                      @Override
                                      public void onClick(View view) {
                                          Intent albumsIntent = new Intent(PlayedActivity.this, AlbumsActivity.class);
                                          startActivity(albumsIntent);
                                      }
                                  }
        );

        //Find the shows activity_playec.xml file
        Button artists = (Button) findViewById(R.id.artists);

        //Set a click listener on the view
        artists.setOnClickListener(new View.OnClickListener() {
                                       //The code in this method will be executed when the Artists button is clicked
                                       @Override
                                       public void onClick(View view) {
                                           Intent artistsIntent = new Intent(PlayedActivity.this, ArtistsActivity.class);
                                           startActivity(artistsIntent);
                                       }
                                   }
        );
    }

}
