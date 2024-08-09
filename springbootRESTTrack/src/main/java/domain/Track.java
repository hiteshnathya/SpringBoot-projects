package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Track {

    @Id
    private String trackId;

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    public String getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(String trackRating) {
        this.trackRating = trackRating;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public Track(String trackId, String trackArtist, String trackComments, String trackName, String trackRating) {
        this.trackId = trackId;
        this.trackArtist = trackArtist;
        this.trackComments = trackComments;
        this.trackName = trackName;
        this.trackRating = trackRating;
    }

    private String trackName;
    private String trackComments;
    private String trackRating;
    private String trackArtist;
}
