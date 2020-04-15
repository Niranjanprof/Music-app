package com.neeru.musicapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NowPlaying extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        final ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Arrow Head", "Pop", "Steven", R.drawable.map));
        musics.add(new Music("Paparazi", "Jazz", "Hayden", R.drawable.pic));
        musics.add(new Music("Read Eye", "Pop", "Maria", R.drawable.pic2));
        musics.add(new Music("Tua", "Pop", "Steven", R.drawable.pic3));
        musics.add(new Music("Trump", "Jazz", "Karls", R.drawable.picc));
        musics.add(new Music("Maple", "Classic", "Devika", R.drawable.piccc));
        musics.add(new Music("Bow", "Classic", "Master", R.drawable.piccccc));
        musics.add(new Music("Bow", "Classic", "Master", R.drawable.picccccc));

        init(musics);

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setback(musics);
            }
        });
        ImageView forw = (ImageView) findViewById(R.id.forw);
        forw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setforw(musics);
            }
        });
        TextView playingText = (TextView) findViewById(R.id.textplaying);
        playingText.setText("The Buttons will work");
        TextView title = (TextView) findViewById(R.id.now);
        title.setBackgroundColor(Color.parseColor("#AAFF00"));

        TextView libraryView = (TextView) findViewById(R.id.lib);
        libraryView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LibActivity.class);
                startActivity(intent);
            }
        });
        TextView homeView = (TextView) findViewById(R.id.home);
        homeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    int index = 0;

    public void init(ArrayList<Music> musics) {
        ImageView imageView = (ImageView) findViewById(R.id.imageplaying);
        imageView.setImageResource(musics.get(index).getMusicId());
        TextView playingText = (TextView) findViewById(R.id.textplaying);
        playingText.setText(musics.get(index).getMusicName());
    }

    public void setforw(ArrayList<Music> musics) {
        if (index == musics.size() - 1) {
            index = 0;
            return;
        }
        index++;
        init(musics);
    }

    private void setback(ArrayList<Music> musics) {
        if (index == 0) {
            index = musics.size() - 1;
            return;
        }
        index--;
        init(musics);
    }
}
