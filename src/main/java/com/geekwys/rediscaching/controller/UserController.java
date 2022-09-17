package com.geekwys.rediscaching.controller;

import com.geekwys.rediscaching.model.User;
import com.geekwys.rediscaching.repository.UserRepository;
import com.geekwys.rediscaching.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author shem.mwangi
 */
@Slf4j
@RestController
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/get/users")
    public List<User> fetchAllUsers() {
        log.info("Fetch all users in org: {}", userService.fetchAllUserRegisteredInOrganization());
        return userService.fetchAllUserRegisteredInOrganization();
    }

    @PostMapping("/add/users")
    public void addNewUsers(@RequestBody User user) {
        userService.registerNewUserToOrganization(user);
    }

}
