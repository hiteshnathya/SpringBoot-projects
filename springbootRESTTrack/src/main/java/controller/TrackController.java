package controller;

import domain.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TrackService;
@RestController
@RequestMapping("/api/v1")
public class TrackController {
    private TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }
@PostMapping("/track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track) {
        return new ResponseEntity<>(trackService.saveTrack(track), httpStatus.CREATED);
    }
@GetMapping("/tracks")
    public ResponseEntity<?> getAllTrack(){
        return  new ResponseEntity<>(trackService.getAllTracks(), httpStatus.FOUND);
    }
@GetMapping("/tracks/{trackId}")
    public ResponseEntity<?> getTrackById(@PathVariable String trackId){

        return  new  ResponseEntity<>(trackService.getByTrackId(trackId),httpStatus.FOUND);
    }
}
