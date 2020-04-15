package com.neeru.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter(Activity context, ArrayList<Music> music) {
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Music currMusic = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.Music);
        TextView genreTextView = (TextView) listItemView.findViewById(R.id.Genre);
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.Artist);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);

        nameTextView.setText(currMusic.getMusicName());
        genreTextView.setText(currMusic.getMusicGenre());
        artistTextView.setText(currMusic.getMusicArtist());
        imageView.setImageResource(currMusic.getMusicId());

        return listItemView;

    }
}
