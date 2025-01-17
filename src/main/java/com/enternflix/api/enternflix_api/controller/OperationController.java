package com.enternflix.api.enternflix_api.controller;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enternflix.api.enternflix_api.entity.MovieEntity;
import com.enternflix.api.enternflix_api.service.MovieService;

@RestController
@RequestMapping("/movie")
@CrossOrigin(origins = "http://localhost:3000")
public class OperationController {

    private final MovieService movieService;

    public OperationController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/create")
    public void createMovie(@RequestBody MovieEntity movie) {
        movieService.createMovie(movie);
    }

    @PutMapping("/update/{id}")
    public void updateMovie(@RequestBody MovieEntity movie, @PathVariable ObjectId id) {
        MovieEntity movieToUpdate = movieService.getMovieById(id);
        if (movieToUpdate == null) {
            return;
        }

        if (movie.getBackdrop_path() != null) {
            movieToUpdate.setBackdrop_path(movie.getBackdrop_path());
        }
        if (movie.getCast() != null) {
            movieToUpdate.setCast(movie.getCast());
        }
        if (movie.getCategory() != null) {
            movieToUpdate.setCategory(movie.getCategory());
        }
        if (movie.getFirst_air_date() != null) {
            movieToUpdate.setFirst_air_date(movie.getFirst_air_date());
        }
        if (movie.getMedia_type() != null) {
            movieToUpdate.setMedia_type(movie.getMedia_type());
        }
        if (movie.getTitle() != null) {
            movieToUpdate.setTitle(movie.getTitle());
        }
        if (movie.getOverview() != null) {
            movieToUpdate.setOverview(movie.getOverview());
        }
        if (movie.getPoster_path() != null) {
            movieToUpdate.setPoster_path(movie.getPoster_path());
        }
        if (movie.getRelease_date() != null) {
            movieToUpdate.setRelease_date(movie.getRelease_date());
        }
        if (movie.getStudio() != null) {
            movieToUpdate.setStudio(movie.getStudio());
        }
        if (movie.getVideo() != null) {
            movieToUpdate.setVideo(movie.getVideo());
        }
        movieService.updateMovie(movieToUpdate);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovie(@PathVariable ObjectId id) {
        movieService.deleteMovie(id);
    }

}
