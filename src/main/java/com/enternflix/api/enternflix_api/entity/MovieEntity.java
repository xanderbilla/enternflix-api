package com.enternflix.api.enternflix_api.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "movies")
public class MovieEntity {
    private String backdrop_path;
    private ArrayList<String> cast;
    private ArrayList<String> category;
    private String first_air_date;
    @Id
    private ObjectId id;
    private String media_type;
    @Indexed(unique = true)
    private String title;
    private String overview;
    private String poster_path;
    private String release_date;
    private String studio;
    private String video;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
