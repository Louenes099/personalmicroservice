package com.islam.api.core.genre;

public class Genre {

    private int songId;
    private int genreId;
    private String type;
    private String style;
    private String serviceAddress;

    public Genre(int songId, int genreId, String type, String style, String serviceAddress) {
        this.songId = songId;
        this.genreId = genreId;
        this.type = type;
        this.style = style;
        this.serviceAddress = serviceAddress;
    }

    public Genre() {
    }

    public int getSongId() {
        return songId;
    }

    public int getGenreId() {
        return genreId;
    }

    public String getType() {
        return type;
    }

    public String getStyle() {
        return style;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
