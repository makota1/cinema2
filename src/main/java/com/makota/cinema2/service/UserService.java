package com.makota.cinema2.service;


import com.makota.cinema2.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    String encodePassword(String password);

    void createUser(User user);

    Optional<User> getUserByLogin(String login);
}
