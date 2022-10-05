package com.hmdb.hmdb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {
    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable Integer id) {
        Movie match = null;

        for (Movie movie : Movie.movies) {
            if (movie.id == id) {
                match = movie;
            }
        }

        if (match == null) {
            throw new Error("Error 404: No movies for you :(");
        }

        return match;
    }

    @GetMapping("/actors/{id}")
    public Actor getActor(@PathVariable Integer id) {
        Actor match = null;

        for (Actor actor : Actor.actors) {
            if (actor.id == id) {
                match = actor;
            }
        }

        if (match == null) {
            throw new Error("Error 404: No actors for you :(");
        }

        return match;
    }
}
