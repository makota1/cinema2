package com.makota.cinema2.service;


import com.makota.cinema2.model.Film;

public interface MovieService {
    Iterable<Film> getAllMovies();

    void createMovie(Film film);

    void deleteMovie(Film film);
}
