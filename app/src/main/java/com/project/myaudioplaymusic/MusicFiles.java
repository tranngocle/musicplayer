package com.project.myaudioplaymusic;

public class MusicFiles {
    private String path;
    private String titles;
    private String artist;
    private String album;
    private String duration;

    public MusicFiles(String path, String titles, String artist, String album, String duration) {
        this.path = path;
        this.titles = titles;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public MusicFiles(){

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
