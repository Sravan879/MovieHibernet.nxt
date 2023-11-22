// Write your code here
// Write your code here
package com.example.movie.repository;

import java.util.*;
import com.example.movie.model.*;

public interface MovieRepository {
    ArrayList<Movie> getMovie();

    Movie addMovie(Movie movie);

    Movie getMovieById(int movieid);

    Movie updateMovieById(int movieid, Movie movie);

    void deleteMovie(int movieid);
}