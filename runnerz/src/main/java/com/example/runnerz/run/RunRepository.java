package com.example.runnerz.run;
import jakarta.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RunRepository {
    private List<Run> runs = new ArrayList<>();
    List<Run> findAll(){
        return runs;
    }
    @PostConstruct
    private void init(){
        runs.add(new Run(
                1,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                3,
                Location.INDOOR
        ));
        runs.add(new Run(
                2,
                "Wednesday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                6,
                Location.INDOOR
        ));

    }

}
