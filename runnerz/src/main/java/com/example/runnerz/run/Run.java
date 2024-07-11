package com.example.runnerz.run;

//import javax.xml.stream.Location;
import java.time.LocalDateTime;

public record Run (
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {

}
