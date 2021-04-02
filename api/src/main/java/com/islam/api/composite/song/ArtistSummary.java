package com.islam.api.composite.song;

public class ArtistSummary {

    int artistId;
    String firstName;
    String lastName;

    public ArtistSummary(int artistId, String firstName, String lastName) {
        this.artistId = artistId;
        this.firstName = firstName;
        this.lastName = lastName;
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
}
