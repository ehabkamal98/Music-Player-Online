package com.hooba.musicplayeronline;

public class Music {
    private String music_name,music_url;

    public Music() {
    }

    public Music(String music_name, String music_url) {
        this.music_name = music_name;
        this.music_url = music_url;
    }

    public String getMusic_name() {
        return music_name;
    }

    public void setMusic_name(String music_name) {
        this.music_name = music_name;
    }

    public String getMusic_url() {
        return music_url;
    }

    public void setMusic_url(String music_url) {
        this.music_url = music_url;
    }
}
