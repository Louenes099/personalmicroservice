package com.islam.microservices.core.product.presentationlayer.controllers;

import com.islam.api.core.song.Song;
import com.islam.api.core.song.SongServiceAPI;
import com.islam.utils.exceptions.InvalidInputException;
import com.islam.utils.exceptions.NotFoundException;
import com.islam.utils.http.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongRESTController implements SongServiceAPI {

    private static final Logger LOG = LoggerFactory.getLogger(SongRESTController.class);
    private final ServiceUtil serviceUtil;
    public SongRESTController(ServiceUtil serviceUtil){ this.serviceUtil = serviceUtil;}

    @Override
    public Song getSong(int songId) {

        LOG.debug("/song MS return the found song for songId: " + songId);
        if(songId<1) throw new InvalidInputException("Invalid songID: " + songId);
        if(songId == 13) throw new NotFoundException("No product found for productID: " + songId);
        return new Song(songId, "name-" + songId, 2011, serviceUtil.getServiceAddress());
    }
}
