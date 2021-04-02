package com.islam.api.core.artist;

public class Artist {

    private int songId;
    private int artistId;
    private String firstName;
    private String lastName;
    private String birthday;
    private String country;
    private String serviceAddress;

    public Artist(int songId, int artistId, String firstName, String lastName, String birthday, String country, String serviceAddress) {
        this.songId = songId;
        this.artistId = artistId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.country = country;
        this.serviceAddress = serviceAddress;
    }

    public Artist() {
    }

    public int getSongId() {
        return songId;
    }

    public int getArtistId() {
        return artistId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCountry() {
        return country;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
