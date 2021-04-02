package com.islam.api.composite.song;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface SongCompositeService {

    @GetMapping(value = "/song-composite/{songId}", produces = "application/json")
    SongAggregate getSong(@PathVariable int songId);
}
