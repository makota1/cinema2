package com.makota.cinema2.service;


import com.makota.cinema2.model.Director;

public interface DirectorService {
    void addDirector(Director director);

    Iterable<Director> getAllDirectors();
}
