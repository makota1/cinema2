package com.makota.cinema2.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @NotEmpty
    @Size(max = 25)
    private String firstName;

    @NotEmpty
    @Size(max = 25)
    private String lastName;

    @NotEmpty
    @Size(max = 40)
    private String login;

    private String password; // FIXME: 1/19/21 add pattern validation

    @Transient
    @NotEmpty
    private String confirmations;

    @Email
    @NotEmpty
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    private boolean activity;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Ticket> tickets;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<Role> roles = new ArrayList<>();
        roles.add(role);
        return roles;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
