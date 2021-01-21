package com.makota.cinema2.service.impl;

import com.makota.cinema2.model.Film;
import com.makota.cinema2.repository.FilmRepository;
import com.makota.cinema2.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private final FilmRepository filmRepository;

    @Autowired
    public MovieServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public Iterable<Film> getAllMovies() {
        return filmRepository.findAll();
    }

    @Override
    public void createMovie(Film film) {
        filmRepository.save(film);
    }

    @Override
    public void deleteMovie(Film film) {
        filmRepository.delete(film);
    }
}
