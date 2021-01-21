package com.makota.cinema2.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actors")
@Data
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long actorId;

    @NotBlank(message = "message.error.first.name")
    @Length(max = 30, message = "message.error.toolong")
    private String firstName;

    @NotBlank(message = "message.error.last.name")
    @Length(max = 30, message = "message.error.toolong")
    private String lastName;

    @ManyToMany(mappedBy = "actors")
    private List<Film> films = new ArrayList<>();

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
