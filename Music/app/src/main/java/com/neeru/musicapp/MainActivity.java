package com.neeru.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Arrow Head","Pop","Steven",R.drawable.map));
        musics.add(new Music("Paparazi","Jazz","Hayden",R.drawable.pic));
        musics.add(new Music("Read Eye","Pop","Maria",R.drawable.pic2));
        musics.add(new Music("Tua","Pop","Steven",R.drawable.pic3));
        musics.add(new Music("Trump","Jazz","Karls",R.drawable.picc));
        musics.add(new Music("Maple","Classic","Devika",R.drawable.piccc));
        musics.add(new Music("Bow","Classic","Master",R.drawable.piccccc));
        musics.add(new Music("Bow","Classic","Master",R.drawable.picccccc));


        MusicAdapter musicAdapter = new MusicAdapter(this,musics);
        GridView gridView = (GridView)findViewById(R.id.list);
        gridView.setAdapter(musicAdapter);

    }
}
