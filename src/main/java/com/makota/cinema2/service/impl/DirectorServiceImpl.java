package com.makota.cinema2.service.impl;

import com.makota.cinema2.model.Director;
import com.makota.cinema2.repository.DirectorRepository;
import com.makota.cinema2.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorServiceImpl implements DirectorService {
    private final DirectorRepository directorRepository;

    @Autowired
    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    public void addDirector(Director director) {
        directorRepository.save(director);
    }

    @Override
    public Iterable<Director> getAllDirectors() {
        return directorRepository.findAll();
    }
}
