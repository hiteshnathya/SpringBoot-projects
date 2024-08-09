package service;

import domain.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TrackRepository;

import java.util.List;
@Service
public class TrackServiceImpl implements  TrackService
{
    private final TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository=trackRepository;

    }

    @Override
    public List<Track> getByTrackId(String trackId) {
        return trackRepository.findByTrackId(trackId);
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public Track saveTrack(Track track) {
        return  trackRepository.save(track);
    }
}
