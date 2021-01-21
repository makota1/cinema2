package com.makota.cinema2.service;


import com.makota.cinema2.model.Actor;

import java.util.List;

public interface ActorService {
    void addActor(Actor actor);

    List<Actor> getAllActors();
}
