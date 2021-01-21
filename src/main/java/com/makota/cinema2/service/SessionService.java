package com.makota.cinema2.service;

import com.makota.cinema2.model.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface SessionService {
    void create(Session session);

    List<Session> getSessionByDate(LocalDate date);

    Page<Session> getSessionByDate(LocalDate date, Pageable pageable);

    void deleteSession(Session session);
}
