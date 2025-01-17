package com.enternflix.api.enternflix_api.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.enternflix.api.enternflix_api.entity.MovieEntity;

public interface MovieRepository extends MongoRepository<MovieEntity, ObjectId> {
    public MovieEntity findByTitle(String title);

    public List<MovieEntity> findByCategory(String category);

    public List<MovieEntity> findByCast(String cast);

    public List<MovieEntity> findByStudio(String studio);

    public List<MovieEntity> findByReleaseDate(String releaseDate);

    public List<MovieEntity> findByFirstAirDate(String firstAirDate);

    public List<MovieEntity> findByMediaType(String mediaType);

    public List<MovieEntity> findByTitleContaining(String title);
}