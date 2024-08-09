package service;

import domain.Track;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackService
{
    Track saveTrack(Track track);

    List<Track> getAllTracks();
    List<Track> getByTrackId(String trackId);
}
