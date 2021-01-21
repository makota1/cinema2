package com.makota.cinema2.repository;

import com.makota.cinema2.model.Director;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends CrudRepository<Director, Long> {
}
