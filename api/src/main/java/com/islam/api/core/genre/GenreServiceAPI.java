package com.islam.api.core.genre;

import com.islam.api.core.song.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface GenreServiceAPI {

    @GetMapping( value = "/genre", produces = "application/json")
    Genre getGenre(@RequestParam(value = "songId", required = true) int songId);
}
