package com.makota.cinema2.repository;

import com.makota.cinema2.model.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
}
