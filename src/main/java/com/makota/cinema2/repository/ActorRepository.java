package com.makota.cinema2.repository;

import com.makota.cinema2.model.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Long> {
    List<Actor> findAll();
}
