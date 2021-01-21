package com.makota.cinema2.repository;

import com.makota.cinema2.model.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SessionRepository extends PagingAndSortingRepository<Session, Long> {
    List<Session> findAllBySessionDateOrderByStartTime(LocalDate sessionDateStartTime);

    Page<Session> findAllBySessionDateOrderByStartTime(LocalDate sessionDate, Pageable pageable);
}
