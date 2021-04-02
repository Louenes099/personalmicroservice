package com.islam.api.core.song;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface SongServiceAPI {
    @GetMapping(value = "/song/{songId}", produces = "application/json")
    Song getSong(@PathVariable int songId);
}
