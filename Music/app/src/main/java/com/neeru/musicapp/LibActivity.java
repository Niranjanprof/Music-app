package com.neeru.musicapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class LibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_activity);
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Arrow Head","Pop","Steven",R.drawable.map));
        musics.add(new Music("Paparazi","Jazz","Hayden",R.drawable.pic));
        musics.add(new Music("Read Eye","Pop","Maria",R.drawable.pic2));
        musics.add(new Music("Tua","Pop","Steven",R.drawable.pic3));
        musics.add(new Music("Trump","Jazz","Karls",R.drawable.picc));
        musics.add(new Music("Maple","Classic","Devika",R.drawable.piccc));
        musics.add(new Music("Bow","Classic","Master",R.drawable.piccccc));
        musics.add(new Music("Bow","Classic","Master",R.drawable.picccccc));


        MusicLibAdapter musicAdapter = new MusicLibAdapter(this,musics);
        ListView gridView = (ListView)findViewById(R.id.list);
        gridView.setAdapter(musicAdapter);

        TextView homeView = (TextView)findViewById(R.id.home);
        TextView title = (TextView)findViewById(R.id.lib);
        title.setBackgroundColor(Color.parseColor("#AAFF00"));
        homeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}