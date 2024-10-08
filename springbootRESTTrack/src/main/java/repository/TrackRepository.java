package repository;

import domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TrackRepository extends JpaRepository<Track, String> {

   List<Track> findByTrackId(String trackId);
    List<Track> findByTrackArtist(String trackName);


}
