package com.islam.api.core.song;

public class Song {

    private int songId;
    private String name;
    private int releaseYear;
    private String serviceAddresses;

    public Song(int songId, String name, int releaseYear, String serviceAddresses) {
        this.songId = songId;
        this.name = name;
        this.releaseYear = releaseYear;
        this.serviceAddresses = serviceAddresses;
    }

    public Song() {
    }

    public int getSongId() {
        return songId;
    }

    public String getName() {
        return name;
    }

    public String getServiceAddresses() {
        return serviceAddresses;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
