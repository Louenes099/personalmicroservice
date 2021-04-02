package com.islam.api.composite.song;

public class SongAggregate {

    int songId;
    String name;
    String releaseYear;
    ArtistSummary artist;
    GenreSummary genre;
    String serviceAddress;

    public SongAggregate(int songId, String name, String releaseYear, ArtistSummary artist, GenreSummary genre, String serviceAddress) {
        this.songId = songId;
        this.name = name;
        this.releaseYear = releaseYear;
        this.artist = artist;
        this.genre = genre;
        this.serviceAddress = serviceAddress;
    }

    public int getSongId() {
        return songId;
    }

    public String getName() {
        return name;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public ArtistSummary getArtist() {
        return artist;
    }

    public GenreSummary getGenre() {
        return genre;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
