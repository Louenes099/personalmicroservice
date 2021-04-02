package com.islam.api.composite.song;

public class ServiceAddresses {

    String compositeAddress;
    String songAddress;
    String genreAddress;
    String artistAddress;

    public ServiceAddresses(String compositeAddress, String songAddress, String genreAddress, String artistAddress) {
        this.compositeAddress = compositeAddress;
        this.songAddress = songAddress;
        this.genreAddress = genreAddress;
        this.artistAddress = artistAddress;
    }

    public String getCompositeAddress() {
        return this.compositeAddress;
    }

    public String getSongAddress() {
        return this.songAddress;
    }

    public String getGenreAddress() {
        return this.genreAddress;
    }

    public String getArtistAddress() {
        return this.artistAddress;
    }
}
