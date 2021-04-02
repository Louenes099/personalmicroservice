package com.islam.api.core.artist;

import com.islam.api.core.song.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ArtistServiceAPI {

    @GetMapping( value = "/artist", produces = "application/json")
    Artist getArtist(@RequestParam(value = "songId", required = true) int songId);
}
