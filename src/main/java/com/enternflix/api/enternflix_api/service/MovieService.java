package com.enternflix.api.enternflix_api.service;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import com.enternflix.api.enternflix_api.entity.MovieEntity;
import com.enternflix.api.enternflix_api.repository.MovieRepository;

@Component
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieEntity getMovieById(ObjectId id) {
        return movieRepository.findById(id).orElse(null);
    }

    public MovieEntity createMovie(MovieEntity movie) {
        movie.setCreated_at(LocalDateTime.now());
        return movieRepository.save(movie);
    }

    public MovieEntity updateMovie(MovieEntity movie) {
        movie.setUpdated_at(LocalDateTime.now());
        return movieRepository.save(movie);
    }

    public void deleteMovie(ObjectId id) {
        movieRepository.deleteById(id);
    }
}
