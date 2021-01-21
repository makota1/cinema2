package com.makota.cinema2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long ticketId;

    private int placeNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    private Session session;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
