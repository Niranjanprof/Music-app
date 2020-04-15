package com.neeru.musicapp;

public class Music {
    private String musicName;
    private String musicGenre;
    private String musicArtist;
    private int musicid;

    public Music(String name, String genre, String artist, int id) {
        musicName = name;
        musicGenre = genre;
        musicArtist = artist;
        musicid = id;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public int getMusicId() {
        return musicid;
    }
}
