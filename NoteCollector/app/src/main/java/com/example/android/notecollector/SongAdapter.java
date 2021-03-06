package com.example.android.notecollector;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {

        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songitem, parent, false);
        }
        Song currentSong = getItem(position);
        TextView trackTextView = listItemView.findViewById(R.id.trackText);
        trackTextView.setText(currentSong.getmTitle());
        TextView artistTextView = listItemView.findViewById(R.id.artistText);
        artistTextView.setText(currentSong.getmArtist());
        TextView albumTextView = listItemView.findViewById(R.id.albumText);
        albumTextView.setText(currentSong.getmAlbum());

        return listItemView;


    }
}
