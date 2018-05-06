package com.example.android.notecollector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @OnClick(R.id.tracks)
    public void tracksIntent(View view) {
        Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);
        startActivity(tracksIntent);
    }

    @OnClick(R.id.artist)
    public void artistIntent(View view) {
        Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
        startActivity(artistIntent);
    }


    @OnClick(R.id.nowPlaying)
    public void nowPlayingIntent(View view) {
        Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
        startActivity(nowPlayingIntent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


}
