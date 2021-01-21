package com.makota.cinema2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.time.DurationMax;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.Duration;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "films")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long filmId;

    @NotBlank
    private String filmName;

    @ElementCollection(targetClass = Genre.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "film_genre", joinColumns = {@JoinColumn(name = "film_id")})
    @Enumerated(EnumType.STRING)
    private Set<Genre> filmGenre;

    @NotNull
    @PastOrPresent
    private Year created;

    @NotNull
    @DurationMax(minutes = 210L)
    private Duration duration;

    @ManyToOne(fetch = FetchType.EAGER)
    @NotNull
    private Director director;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "film")
    private Set<Session> sessions;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Actor> actors = new ArrayList<>();

    public void setDuration(String duration) {
        this.duration = Duration.ofMinutes(Long.parseLong(duration));
    }
}
