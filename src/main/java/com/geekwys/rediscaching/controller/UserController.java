package com.geekwys.rediscaching.controller;

import com.geekwys.rediscaching.model.User;
import com.geekwys.rediscaching.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shem.mwangi
 */
@Slf4j
@RestController
public class UserController {

    final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/users")
    public List<User> fetchAllUsers() {
        log.info("Fetch all users in org: {}", userRepository.findAll());
        return userRepository.findAll();
    }

}
