package com.makota.cinema2.service.impl;


import com.makota.cinema2.model.User;
import com.makota.cinema2.repository.UserRepository;
import com.makota.cinema2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final MessageSource messageSource;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, MessageSource messageSource, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.messageSource = messageSource;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public Optional<User> getUserByLogin(String login) {
        return Optional.of(userRepository.findByLogin(login));
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userRepository.findByLogin(s);
    }
}
