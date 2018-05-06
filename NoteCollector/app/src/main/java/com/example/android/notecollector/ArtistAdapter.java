package com.example.android.notecollector;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter  extends ArrayAdapter<Song> {

    public ArtistAdapter(Activity context, ArrayList<Song> songs) {

        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artistitem, parent, false);
        }
        Song currentSong = getItem(position);
      TextView artistTextView = listItemView.findViewById(R.id.artistText);
        artistTextView.setText(currentSong.getmArtist());


        return listItemView;


    }
}
