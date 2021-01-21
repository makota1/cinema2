package com.makota.cinema2.service.impl;

import com.makota.cinema2.model.Actor;
import com.makota.cinema2.repository.ActorRepository;
import com.makota.cinema2.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;

    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public void addActor(Actor actor) {
        actorRepository.save(actor);
    }

    @Override
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }
}
