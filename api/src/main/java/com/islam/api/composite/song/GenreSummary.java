package com.islam.api.composite.song;

public class GenreSummary {

    int genreId;
    String style;

    public GenreSummary(int genreId, String style) {
        this.genreId = genreId;
        this.style = style;
    }

    public int getGenreId() {
        return this.genreId;
    }

    public String getStyle() {
        return this.style;
    }
}
