package com.neeru.musicapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Arrow Head", "Pop", "Steven", R.drawable.map));
        musics.add(new Music("Paparazi", "Jazz", "Hayden", R.drawable.pic));
        musics.add(new Music("Read Eye", "Pop", "Maria", R.drawable.pic2));
        musics.add(new Music("Tua", "Pop", "Steven", R.drawable.pic3));
        musics.add(new Music("Trump", "Jazz", "Karls", R.drawable.picc));
        musics.add(new Music("Maple", "Classic", "Devika", R.drawable.piccc));
        musics.add(new Music("Bow", "Classic", "Master", R.drawable.piccccc));
        musics.add(new Music("Bow", "Classic", "Master", R.drawable.picccccc));


        MusicAdapter musicAdapter = new MusicAdapter(this, musics);

        TextView title = (TextView) findViewById(R.id.home);
        title.setBackgroundColor(Color.parseColor("#AAFF00"));
        GridView gridView = (GridView) findViewById(R.id.list);
        gridView.setAdapter(musicAdapter);

        TextView libraryView = (TextView) findViewById(R.id.lib);
        libraryView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LibActivity.class);
                startActivity(intent);
            }
        });
        TextView nowView = (TextView) findViewById(R.id.now);
        nowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NowPlaying.class);
                startActivity(intent);
            }
        });
    }
}
