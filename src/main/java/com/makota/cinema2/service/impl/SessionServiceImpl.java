package com.makota.cinema2.service.impl;

import com.makota.cinema2.model.Session;
import com.makota.cinema2.repository.SessionRepository;
import com.makota.cinema2.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;

    @Autowired
    public SessionServiceImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public void create(Session session) {
        sessionRepository.save(session);
    }

    @Override
    public List<Session> getSessionByDate(LocalDate date) {
        return sessionRepository.findAllBySessionDateOrderByStartTime(date);
    }

    @Override
    public Page<Session> getSessionByDate(LocalDate date, Pageable pageable) {
        return sessionRepository.findAllBySessionDateOrderByStartTime(date, pageable);
    }

    @Override
    public void deleteSession(Session session) {
        sessionRepository.delete(session);
    }
}
