package com.makota.cinema2.service;


import com.makota.cinema2.model.Session;
import com.makota.cinema2.model.Ticket;

import java.util.List;

public interface TicketService {
    void create(Ticket ticket);

    List<Ticket> getTicketsBySession(Session session);
}
