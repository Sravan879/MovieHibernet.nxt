/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.movie.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.movie.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.movie.service.*;

@RestController
public class MovieController {

    @Autowired
    public MovieJpaService songService;

    @GetMapping("/movies")
    public ArrayList<Movie> getMovie() {
        return songService.getMovie();
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") int movieId) {
        return songService.getMovieById(movieId);
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return songService.addMovie(movie);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updateMovie(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        return songService.updateMovieById(movieId, movie);
    }

    @DeleteMapping("/movies/{movieId}")
    public void deleteMovie(@PathVariable("movieId") int movieId) {
        songService.deleteMovie(movieId);
    }

}