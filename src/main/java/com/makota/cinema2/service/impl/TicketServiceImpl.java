package com.makota.cinema2.service.impl;

import com.makota.cinema2.model.Session;
import com.makota.cinema2.model.Ticket;
import com.makota.cinema2.repository.TicketRepository;
import com.makota.cinema2.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void create(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> getTicketsBySession(Session session) {
        return ticketRepository.findTicketBySession(session);
    }
}
