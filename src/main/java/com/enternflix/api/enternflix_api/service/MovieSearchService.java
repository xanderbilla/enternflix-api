package com.enternflix.api.enternflix_api.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import com.enternflix.api.enternflix_api.entity.MovieEntity;
import com.enternflix.api.enternflix_api.repository.MovieRepository;

@Component
public class MovieSearchService {

    private final MovieRepository movieRepository;

    public MovieSearchService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieEntity getMovieById(ObjectId id) {
        return movieRepository.findById(id).orElse(null);
    }

    public MovieEntity getMovieByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    public List<MovieEntity> getMoviesByCategory(String category) {
        return movieRepository.findByCategory(category);
    }

    public List<MovieEntity> getMoviesByCast(String cast) {
        return movieRepository.findByCast(cast);
    }

    public List<MovieEntity> getMoviesByStudio(String studio) {
        return movieRepository.findByStudio(studio);
    }

    public List<MovieEntity> getMoviesByReleaseDate(String releaseDate) {
        return movieRepository.findByReleaseDate(releaseDate);
    }

    public List<MovieEntity> searchMoviesByTitle(String title) {
        return movieRepository.findByTitleContaining(title);
    }
}
