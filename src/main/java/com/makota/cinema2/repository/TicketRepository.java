package com.makota.cinema2.repository;

import com.makota.cinema2.model.Session;
import com.makota.cinema2.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
    List<Ticket> findTicketBySession(Session session);
}
